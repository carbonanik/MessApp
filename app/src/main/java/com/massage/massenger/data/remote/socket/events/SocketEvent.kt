package com.massage.massenger.data.remote.socket.events

import com.massage.massenger.model.Group
import com.massage.massenger.model.User
import com.massage.massenger.model.enumstate.LeftReason
import com.massage.massenger.model.enumstate.RTCConnectionType
import com.massage.massenger.model.enumstate.RTCRequestType
import com.massage.massenger.util.object_id.ObjectId
import com.massage.massenger.util.state.AttachedMedia
import com.massage.massenger.util.state.MessageStatus
import com.massage.massenger.util.state.WanderingState
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.webrtc.SessionDescription


@Serializable
sealed class SocketEvent {

    var sender: User? = null
    var receiver: User? = null
    var group: Group? = null

    @Serializable
    @SerialName("TextMessage")
    data class TextMessage(
        val id: String = ObjectId().toString(),
        val timestamp: Long = System.currentTimeMillis(),
        val text: String? = null,
        val mediaUrl: String? = null,
        val mediaType: AttachedMedia? = null,
        @Transient
        val status: MessageStatus = MessageStatus.RECEIVED
    ) : SocketEvent()


    @Serializable
    @SerialName("MessageStatusCarrier")
    data class MessageStatusCarrier(
        val messageId: String,
        val time: Long = System.currentTimeMillis(),
        val status: MessageStatus = MessageStatus.SENDING
    ) : SocketEvent()


    @Serializable
    @SerialName("WanderingStatus")
    data class WanderingStatus(
        val status: WanderingState = WanderingState.LEFT,
    ) : SocketEvent()


    @Serializable
    sealed class RTCMessage : SocketEvent() {

        @Serializable
        @SerialName("RtcRequest")
        data class RtcRequest(
            val rtcConType: RTCConnectionType = RTCConnectionType.VideoCall,
            val rtcReqType: RTCRequestType = RTCRequestType.REQUESTING,
        ) : RTCMessage()


        @Serializable
        @SerialName("SDPMessage")
        data class SDPMessage(
            val sdpType: SessionDescription.Type,
            val sdp: String,
        ) : RTCMessage()


        @Serializable
        @SerialName("ICEMessage")
        data class ICEMessage(
            val serverUrl: String,
            val sdpMid: String,
            val sdpMLineIndex: Int,
            val sdpCandidate: String,
            val candidateType: String
        ) : RTCMessage()


        @Serializable
        @SerialName("PeerLeft")
        data class PeerLeft(
            val reason: LeftReason = LeftReason.CALL_END
        ) : RTCMessage()

    }
}