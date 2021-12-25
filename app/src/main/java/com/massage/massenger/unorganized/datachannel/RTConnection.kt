package com.massage.massenger.unorganized.datachannel

import android.content.Context
import android.util.Log
import com.massage.massenger.common.ICEMessage
import com.massage.massenger.common.RTCMessage
import com.massage.massenger.common.SDPMessage
import org.webrtc.*
import org.webrtc.PeerConnection.IceServer
import org.webrtc.PeerConnection.RTCConfiguration
import org.webrtc.PeerConnectionFactory.InitializationOptions
import java.nio.ByteBuffer

class RTConnection(
    private val context: Context,
    private val sendMessage: (message: RTCMessage) -> Unit,
    private val onDataChannelMessage: (buffer: DataChannel.Buffer) -> Unit
) {
    private var peerConnectionFactory: PeerConnectionFactory? = null
    private var peerConnection: PeerConnection? = null
    private var dataChannel: DataChannel? = null

    companion object {
        const val TAG = "RTConnection"
    }

    fun initialized() {
        val initializationOptions = InitializationOptions.builder(context)
            .createInitializationOptions()
        PeerConnectionFactory.initialize(initializationOptions)

        val options = PeerConnectionFactory.Options()
        peerConnectionFactory = PeerConnectionFactory
            .builder().setOptions(options)
            .createPeerConnectionFactory()

        val iceServers: MutableList<IceServer> = arrayListOf(
            IceServer.builder("stun:stun.l.google.com:19302").createIceServer()
//            IceServer.builder("turn:numb.viagenie.ca")
//                .setUsername("user_name")
//                .setPassword("password")
//                .createIceServer()
        )
        val rtcConfig = RTCConfiguration(iceServers)

        peerConnection = peerConnectionFactory?.createPeerConnection(
            rtcConfig,
            object : CustomPeerConnectionObserver() {

                override fun onIceCandidate(iceCandidate: IceCandidate?) {
                    super.onIceCandidate(iceCandidate)

                    Log.i(TAG,"ice candidate created")
                    // send ice candidate to other person
                    iceCandidate?.let {
                        ICEMessage(
                            sdpCandidate = it.sdp,
                            sdpMid = it.sdpMid,
                            sdpMLineIndex = it.sdpMLineIndex,
                            serverUrl = "",
                            candidateType = ""
                        )
                    }?.let {
                        sendMessage(it)
                    }
                }

                override fun onDataChannel(dataChannel: DataChannel?) {
                    super.onDataChannel(dataChannel)
                    Log.i(TAG,"on data channel")
                    dataChannel?.registerObserver(object : CustomDataChannelObserver(){
                        override fun onMessage(buffer: DataChannel.Buffer?) {
                            super.onMessage(buffer)
//                            Log.i(TAG,"on message ${buffer?.data?.char}")
                            buffer?.let { onDataChannelMessage(it) }
                        }
                    })
                }

                override fun onIceConnectionChange(iceConnectionState: PeerConnection.IceConnectionState?) {
                    super.onIceConnectionChange(iceConnectionState)
                    iceConnectionState?.let {
                        //DataPacks.RTCIceStateChange rtcIceStateChange = new DataPacks.RTCIceStateChange();
                        if (it == PeerConnection.IceConnectionState.CONNECTED) {
                            Log.i(TAG,"IceConnectionState.CONNECTED")
                        }
                        if (it == PeerConnection.IceConnectionState.CLOSED) {
                            Log.i(TAG,"IceConnectionState.CLOSED")
                        }
                        if (it == PeerConnection.IceConnectionState.FAILED) {
                            Log.i(TAG,"IceConnectionState.FAILED")
                        }
                    }
                }
            })

        if (peerConnection == null) {
            Log.i(TAG,"peer connection null")
            return
        }

        val dcInit = DataChannel.Init()
        dataChannel = peerConnection?.createDataChannel("1", dcInit)
        dataChannel?.registerObserver(
            object : CustomDataChannelObserver() {}
        )
    }

    fun setIceCandidate(candidate: String?, sdpMid: String?, sdpMLineIndex: Int) {
        if (peerConnection == null) {
            return
        }
        peerConnection?.addIceCandidate(IceCandidate(sdpMid, sdpMLineIndex, candidate))
        Log.i(TAG,"set ice candidate")
    }

    fun createOffer() {
        if (peerConnection == null) {
            return
        }

        peerConnection?.createOffer(object : CustomSdpObserver() {

            override fun onCreateSuccess(sessionDescription: SessionDescription?) {
                super.onCreateSuccess(sessionDescription)
                peerConnection?.setLocalDescription(
                    object : CustomSdpObserver() {},
                    sessionDescription
                )
                Log.i(TAG,"offer created")
                sessionDescription?.let {
                    SDPMessage(
                        sdp = it.description,
                        sdpType = it.type
                    )
                }?.let {
                    sendMessage(it)
                }
            }

            override fun onCreateFailure(s: String?) {
                super.onCreateFailure(s)
                Log.i(TAG,"offer failed to create")
            }
        }, object : MediaConstraints() {})
    }


    fun createAnswer() {
        peerConnection?.createAnswer(object : CustomSdpObserver() {
            override fun onCreateSuccess(sessionDescription: SessionDescription?) {
                super.onCreateSuccess(sessionDescription)
                peerConnection?.setLocalDescription(
                    object : CustomSdpObserver() {},
                    sessionDescription
                )
                // sessionDescription.description is string which needs to the shared across network
                Log.i(TAG,"answer created")
                sessionDescription?.let {
                    SDPMessage(
                        sdp = it.description,
                        sdpType = it.type
                    )
                }?.let {
                    sendMessage(it)
                }
            }

            override fun onCreateFailure(s: String?) {
                super.onCreateFailure(s)
                // Answer creation failed
                Log.i(TAG,"answer create failed")

            }
        }, MediaConstraints())
    }

    // sdp from other person
    fun setRemoteSDP(sessionDescription: String?, type: SessionDescription.Type) {
        if (peerConnection == null) {
            return
        }
        peerConnection?.setRemoteDescription(
            object : CustomSdpObserver() {
                override fun onSetSuccess() {
                    super.onSetSuccess()
                    Log.i(TAG,"remote sdp set success")
                }
            },
            SessionDescription(type, sessionDescription)
        )
    }

    // send data to other peer using rtc data channel
    fun sendData(message: String) {
        if (peerConnection == null || dataChannel == null) {
            return
        }
        val buffer: ByteBuffer = ByteBuffer.wrap(message.toByteArray())
        dataChannel?.send(DataChannel.Buffer(buffer, false))
        Log.i(TAG,"data channel $dataChannel")
    }

    fun sendChunk(chunk: DataChannel.Buffer){
        Log.i(TAG,"send chunk")
        dataChannel?.send(chunk)
    }
}