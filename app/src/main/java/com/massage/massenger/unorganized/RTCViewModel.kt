package com.massage.massenger.unorganized

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.common.*
import com.massage.massenger.data.repository.SocketMessageRepository
import com.massage.massenger.data.repository.UserDataRepository
import com.massage.massenger.util.extensions.fromJson
import com.massage.massenger.util.extensions.setPersons
import com.massage.massenger.model.*
import com.massage.massenger.model.enumstate.LeftReason
import com.massage.massenger.model.enumstate.RTCConnectionType
import com.massage.massenger.model.enumstate.RTCRequestType
import com.massage.massenger.unorganized.rtc.SignalingClientListener
import com.massage.massenger.util.ACCEPTING
import com.massage.massenger.util.OTHER_PERSON
import com.massage.massenger.util.REQUESTING
import com.massage.massenger.util.REQ_OR_ACC
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.webrtc.IceCandidate
import org.webrtc.SessionDescription
import javax.inject.Inject

@HiltViewModel
class RTCViewModel @Inject constructor(
    private val socketMessageRepository: SocketMessageRepository,
    private val userDataRepository: UserDataRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

//    private val user = dataRepository.user.filterNotNull()

    private val otherPerson: User? = savedStateHandle.get<String>(OTHER_PERSON)?.fromJson()
    private var thisPerson: User? = null
    private val requestingOrAccepting = savedStateHandle.get<String>(REQ_OR_ACC)

    private val incomingRtc = socketMessageRepository.incomingRtcEvent
    private var SDPtype: String? = null


    private var firstRequest = true


    init {
        viewModelScope.launch {
            thisPerson = userDataRepository.getUser()

            if (firstRequest && requestingOrAccepting == REQUESTING) {
                sendRtcMessage(RtcRequest())
                firstRequest = false

            } else if (firstRequest && requestingOrAccepting == ACCEPTING) {
                sendRtcMessage(
                    RtcRequest(
                        rtcConType = RTCConnectionType.VideoCall,
                        rtcReqType = RTCRequestType.ACCEPTING
                    )
                )
                firstRequest = false
            }
        }
    }

    fun sendRtcMessage(message: RTCMessage) {
        message.setPersons(
            thisPerson,
            otherPerson
        ) {
            socketMessageRepository.sendMessage(message)
        }
    }

    fun init(listener: SignalingClientListener) {
        viewModelScope.launch {
            incomingRtc.collect { message ->
                when (message) {
                    is RtcRequest -> {

                        if (message.rtcReqType == RTCRequestType.ACCEPTING && message.sender?.id == otherPerson?.id) {
                            listener.onRequestAccepted()
                        }
                    }
                    is SDPMessage -> {

                        SDPtype = if (message.sdpType == SessionDescription.Type.OFFER) {
                            listener.onOfferReceived(
                                SessionDescription(message.sdpType, message.sdp)
                            )
                            "Offer"
                        } else if (message.sdpType == SessionDescription.Type.ANSWER) {
                            listener.onAnswerReceived(
                                SessionDescription(message.sdpType, message.sdp)
                            )
                            "Answer"
                        } else {
                            null
                        }

                    }
                    is ICEMessage -> {
                        listener.onIceCandidateReceived(
                            IceCandidate(
                                message.sdpMid,
                                message.sdpMLineIndex,
                                message.sdpCandidate
                            )
                        )
                    }
                    is PeerLeft -> {
                        if (message.reason == LeftReason.CALL_END) {
                            listener.onCallEnded()
                            SDPtype = "End Call"
                        }
                    }
                }
            }
        }
    }


    fun sendIceCandidate(candidate: IceCandidate?) = runBlocking {
        val type = when (requestingOrAccepting) {
            ACCEPTING -> "answerCandidate"
            REQUESTING -> "offerCandidate"
            else -> ""
        }

        candidate?.let {
            ICEMessage(
                candidate.serverUrl,
                candidate.sdpMid,
                candidate.sdpMLineIndex,
                candidate.sdp,
                type
            )
        }?.let { sendRtcMessage(it) }
    }
}