package com.massage.massenger.data.repository

import com.massage.massenger.common.*
import com.massage.massenger.data.local.room.ChatDao
import com.massage.massenger.data.local.room.MessageDao
import com.massage.massenger.data.remote.socket.KtorSocket
import com.massage.massenger.data.remote.socket.dto.SocketMessage
import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.util.extensions.messageTypeSeparate
import com.massage.massenger.util.state.MessageStatus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SocketMessageRepository @Inject constructor(
    private val messageDBRepository: MessageDBRepository,
    private val chatDBRepository: ChatDBRepository,
    private val socket: KtorSocket
) {

    private val scope = CoroutineScope(Dispatchers.Default)
//    private val outgoing = MutableSharedFlow<SocketMessage>()

    private val _incomingRtcEvent = MutableSharedFlow<RTCMessage>()
    val incomingRtcEvent: SharedFlow<RTCMessage> = _incomingRtcEvent

    init {
        scope.launch {
            socket.incomingMessage.collect {
                processIncomingMessage(it)
            }
        }
    }

    private fun processIncomingMessage(message: SocketMessage) {
        when (message) {
            is TextMessage -> {
                processTextMessage(message)
                replyDeliveryStatus(message)
            }
            is MessageStatusCarrier -> {
                updateMessageStatus(message)
            }
            is RTCMessage -> {
//                _incomingRtcEvent.emit(m)
            }
            is WanderingStatus -> {}
        }
    }

    fun sendMessage(message: SocketMessage) {
        processOutgoingMessage(message)
        emitOutgoing(message)
    }

    private fun processOutgoingMessage(message: SocketMessage) {
        when (message) {
            is TextMessage -> {
                processTextMessage(message)
            }
            is MessageStatusCarrier -> {}
            is RTCMessage -> {}
            is WanderingStatus -> {}
        }
    }

    private fun processTextMessage(message: TextMessage) {

        val chat = message.crateChat() ?: return
        insertChat(chat)

        val chatMessage = message.toChatMessage(chat.id) ?: return
        insertMessage(chatMessage)
    }

    private fun insertChat(chat: Chat) {
        scope.launch {
            chatDBRepository.insertChat(chat)
        }
    }

    private fun insertMessage(message: ChatMessage) {
        scope.launch {
            messageDBRepository.insertMessage(message)
        }
    }

    private fun updateMessageStatus(status: MessageStatusCarrier) {
        scope.launch {
            messageDBRepository.updateMessageStatus(status.messageLocalId, status.status)
        }
    }

    private fun emitOutgoing(socketMessage: SocketMessage) {
        scope.launch {
            socket.outgoingMessage.emit(socketMessage)
        }
    }

    private fun replyDeliveryStatus(textMessage: TextMessage) {
        val status =
            textMessage.createDeliveredStatus()
        emitOutgoing(status)
    }
}