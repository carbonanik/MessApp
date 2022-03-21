package com.massage.massenger.presentation.ui

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.common.*
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.data.repository_impl.MessageRepository
import com.massage.massenger.model.User
import com.massage.massenger.model.enumstate.RTCConnectionType
import com.massage.massenger.model.enumstate.RTCRequestType
import com.massage.massenger.unorganized.datachannel.RTConnection
import com.massage.massenger.util.ACCEPTING
import com.massage.massenger.util.OTHER_PERSON
import com.massage.massenger.util.REQUESTING
import com.massage.massenger.util.REQ_OR_ACC
import com.massage.massenger.util.extensions.fromJson
import com.massage.massenger.util.extensions.setPersons
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.webrtc.DataChannel
import org.webrtc.SessionDescription
import java.io.InputStream
import java.nio.ByteBuffer
import java.nio.charset.Charset
import javax.inject.Inject

@HiltViewModel
class DataChannelViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val messageRepository: MessageRepository,
    savedStateHandle: SavedStateHandle,
    @ApplicationContext private val context: Context
) : ViewModel() {

    val TAG = "DataChannelViewModel"

//    private val user = userDataRepository.

    private val otherPerson: User? = savedStateHandle.get<String>(OTHER_PERSON)?.fromJson()
    private var thisPerson: User? = null
    private val requestingOrAccepting = savedStateHandle.get<String>(REQ_OR_ACC)
    private var rtcConnection: RTConnection? = null

    private val incomingRtc = messageRepository.incomingRtcEvent
    private var firstRequest = true

    fun init() {
        rtcConnection = RTConnection(
            context,
            sendMessage = {
                sendRtcMessage(it)
            },
            onDataChannelMessage = {
                readIncomingMessage(it.data)
            }
        )
        rtcConnection?.initialized()
        viewModelScope.launch {
            thisPerson = authRepository.getLoggedInUser()
            if (firstRequest && requestingOrAccepting == REQUESTING) {
                sendRtcMessage(
                    RtcRequest(
                        rtcConType = RTCConnectionType.DataChannel,
                        rtcReqType = RTCRequestType.REQUESTING
                    )
                )
                firstRequest = false

            } else if (firstRequest && requestingOrAccepting == ACCEPTING) {
                sendRtcMessage(
                    RtcRequest(
                        rtcConType = RTCConnectionType.DataChannel,
                        rtcReqType = RTCRequestType.ACCEPTING
                    )
                )
                firstRequest = false
            }

        }

        viewModelScope.launch{
            incomingRtc.collect { message ->
                when (message) {
                    is RtcRequest -> {
                        if (message.rtcReqType == RTCRequestType.ACCEPTING
                            && message.sender?.id == otherPerson?.id
                        ) {
                            rtcConnection?.createOffer()
                        }
                    }
                    is SDPMessage -> {
                        rtcConnection?.setRemoteSDP(
                            sessionDescription = message.sdp,
                            type = message.sdpType
                        )
                        if (message.sdpType == SessionDescription.Type.OFFER) {
                            rtcConnection?.createAnswer()
                        } else if (message.sdpType == SessionDescription.Type.ANSWER) {

                        }
                    }
                    is ICEMessage -> {
                        rtcConnection?.setIceCandidate(
                            candidate = message.sdpCandidate,
                            sdpMid = message.sdpMid,
                            sdpMLineIndex = message.sdpMLineIndex
                        )
                    }
                    is PeerLeft -> {

                    }
                }
            }
        }
    }


    private fun sendRtcMessage(message: RTCMessage) {
        message.setPersons(
            thisPerson,
            otherPerson
        ) {
            messageRepository.sendMessage(message)
        }
    }

    val CHUNK_SIZE = 64000

    fun sendImage(inputStream: InputStream, size: Long) {

        val bytes = inputStream.readBytes()

        val numberOfChunks: Int = (size / CHUNK_SIZE).toInt()
        val meta: ByteBuffer =
            stringToByteBuffer("-i$size", Charset.defaultCharset())

        rtcConnection?.sendChunk(DataChannel.Buffer(meta, false))

        for (i in 0 until numberOfChunks) {
            val wrap = ByteBuffer.wrap(
                bytes,
                i * CHUNK_SIZE,
                CHUNK_SIZE
            )
            rtcConnection?.sendChunk(DataChannel.Buffer(wrap, false))
        }
        val remainder: Int = (size % CHUNK_SIZE).toInt()
        if (remainder > 0) {
            val wrap =
                ByteBuffer.wrap(bytes, numberOfChunks * CHUNK_SIZE, remainder)
            rtcConnection?.sendChunk(DataChannel.Buffer(wrap, false))
        }
    }

    private fun stringToByteBuffer(msg: String, charset: Charset): ByteBuffer {
        return ByteBuffer.wrap(msg.toByteArray(charset))
    }

    private var receivingFile: Boolean = false
    private var incomingFileSize = 0
    private var imageFileBytes: ByteArray? = null
    private var currentIndexPointer = 0

    val incomingImage = MutableLiveData<Bitmap>()

    private fun readIncomingMessage(buffer: ByteBuffer) =
        viewModelScope.launch(Dispatchers.IO) {

            val bytes: ByteArray
            if (buffer.hasArray()) {
                bytes = buffer.array()
            } else {
                bytes = ByteArray(buffer.remaining())
                buffer[bytes]
            }
            if (!receivingFile) {
                val firstMessage = String(bytes, Charset.defaultCharset())
                val type = firstMessage.substring(0, 2)
                if (type == "-i") {
                    incomingFileSize = firstMessage.substring(2, firstMessage.length).toInt()
                    Log.d(TAG, incomingFileSize.toString())

                    imageFileBytes = ByteArray(incomingFileSize)
                    Log.d(
                        TAG,
                        "readIncomingMessage: incoming file size $incomingFileSize"
                    )
                    receivingFile = true
                }
            } else {
                for (b in bytes) {
                    imageFileBytes?.set(currentIndexPointer++, b)
                }

                Log.d(TAG, "byte chunk $currentIndexPointer")

                if (currentIndexPointer == incomingFileSize) {
                    Log.d(TAG, "readIncomingMessage: received all bytes")
                    imageFileBytes?.let {
                        BitmapFactory.decodeByteArray(it, 0, it.size)
                    }?.let {
                        Log.d(TAG, "bitmap")

                        incomingImage.postValue(it)
                        receivingFile = false
                        currentIndexPointer = 0
                    }
                }
            }
        }
}