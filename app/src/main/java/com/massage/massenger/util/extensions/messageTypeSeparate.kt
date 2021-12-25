package com.massage.massenger.util.extensions

import com.massage.massenger.common.*
import com.massage.massenger.data.remote.socket.dto.SocketMessage
import com.massage.massenger.util.state.EventType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

fun messageTypeSeparate(
    socketIncoming: SharedFlow<SocketMessage>,
    outgoing: SharedFlow<SocketMessage>,
    scope: CoroutineScope,

    // all outgoing message from this user
    onOutgoingMessage: suspend (m: SocketMessage) -> Unit = { _ -> },

    // all incoming and outgoing `text` message
    onTextMessage: suspend (m: TextMessage) -> Unit = { _ -> },
//    onIncomingTextMessage: suspend (m: TextMessage) -> Unit = { _ -> },

    // text message status /send/delivered/seen
    onIncomingStatus: suspend (m: MessageStatusCarrier) -> Unit = { _ -> },
    onOutgoingStatus: suspend (m: MessageStatusCarrier) -> Unit = { _ -> },

    onIncWondering: suspend (m: WanderingStatus) -> Unit = { _ -> },

    onIncRtcRequest: suspend (m: RtcRequest) -> Unit = { _ -> },
    onSDPMessage: suspend (m: SDPMessage, e: EventType) -> Unit = { _, _ -> },
    onICEMessage: suspend (m: ICEMessage, e: EventType) -> Unit = { _, _ -> },
    onPeerLeft: suspend (m: PeerLeft, e: EventType) -> Unit = { _, _ -> },
    onIncRtcEvents: suspend (m: RTCMessage) -> Unit
) {

    scope.launch {
        socketIncoming.collect { message ->
            when (message) {
                is TextMessage -> {
                    onTextMessage(message)
//                    onIncomingTextMessage(message)
                }
                is MessageStatusCarrier -> onIncomingStatus(message)
                is WanderingStatus -> onIncWondering(message)
                is RTCMessage -> onIncRtcEvents(message)
            }
        }
    }

    scope.launch {
        outgoing.collect { message ->
            onOutgoingMessage(message)
            when (message) {
                is TextMessage -> onTextMessage(message)
                is MessageStatusCarrier -> onOutgoingStatus(message)
                else -> {
                }
            }
        }
    }
}