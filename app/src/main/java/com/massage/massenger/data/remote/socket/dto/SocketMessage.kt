package com.massage.massenger.data.remote.socket.dto

import com.massage.massenger.model.Group
import com.massage.massenger.model.User
import com.massage.massenger.model.enumstate.LeftReason
import com.massage.massenger.model.enumstate.RTCConnectionType
import com.massage.massenger.model.enumstate.RTCRequestType
import com.massage.massenger.util.UUIDSerializer
import com.massage.massenger.util.state.MessageStatus
import com.massage.massenger.util.state.WanderingState
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.webrtc.SessionDescription
import java.util.*


@Serializable
sealed class SocketMessage {
    var sender: User? = null
    var receiver: User? = null
    var group: Group? = null

    @Serializable
    @SerialName("TextMessage")
    data class TextMessage(
        val id: String = "",
        @Serializable(with = UUIDSerializer::class)
        var localId: UUID = UUID.randomUUID(),
        var time: Long = System.currentTimeMillis(),
        var text: String? = null,
        var image: String? = null,
        @Transient
        var status: MessageStatus = MessageStatus.RECEIVED
    ) : SocketMessage()


    @Serializable
    @SerialName("MessageStatusCarrier")
    data class MessageStatusCarrier(
        @Serializable(with = UUIDSerializer::class)
        var messageLocalId: UUID = UUID.randomUUID(),
        var time: Long = System.currentTimeMillis(),
        var status: MessageStatus = MessageStatus.SENDING
    ) : SocketMessage()


    @Serializable
    @SerialName("WanderingStatus")
    data class WanderingStatus(
        var status: WanderingState = WanderingState.LEFT,
    ) : SocketMessage()


    @Serializable
    sealed class RTCMessage : SocketMessage() {

        @Serializable
        @SerialName("RtcRequest")
        data class RtcRequest(
            var rtcConType: RTCConnectionType = RTCConnectionType.VideoCall,
            var rtcReqType: RTCRequestType = RTCRequestType.REQUESTING,
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
            var reason: LeftReason = LeftReason.CALL_END
        ) : RTCMessage()

    }
}