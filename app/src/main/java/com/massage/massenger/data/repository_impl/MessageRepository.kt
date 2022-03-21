package com.massage.massenger.data.repository_impl

import com.massage.massenger.common.*
import com.massage.massenger.data.local.room.dao.ChatDao
import com.massage.massenger.data.local.room.dao.MessageDao
import com.massage.massenger.data.local.room.dao.UserDao
import com.massage.massenger.data.remote.socket.KtorSocket
import com.massage.massenger.data.remote.socket.dto.SocketMessage
import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.service.NotificationData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MessageRepository @Inject constructor(
    private val messageDao: MessageDao,
    private val chatDao: ChatDao,
    private val userDao: UserDao,
    private val socket: KtorSocket
) {

    private val scope = CoroutineScope(Dispatchers.Default)

    private val _incomingRtcEvent =
        MutableSharedFlow<RTCMessage>()
    val incomingRtcEvent: SharedFlow<RTCMessage> = _incomingRtcEvent

    private val _incomingNotification =
        MutableSharedFlow<NotificationData>()
    val incomingNotification =
        _incomingNotification.asSharedFlow()

    init {
        scope.launch {
            socket.incomingMessage.collect {
                processIncomingMessage(it)
            }
        }
    }

    fun sendMessage(message: SocketMessage) {
        processOutgoingMessage(message)
        scope.launch { emitOutgoing(message) }
    }

    fun getAllMessageWithChat(chatId: String?): Flow<List<ChatMessage>> {
        return messageDao.allWithChat(chatId)
    }

    suspend fun updateImageUri(id: String, imageUri: String) =
        messageDao.updateImageUri(id, imageUri)

    //////////////// private //////////////////

    private fun processIncomingMessage(message: SocketMessage) {
        messageCheck(message, text = {
            scope.launch { processIncomingTextMessage(it) }
            scope.launch { replyDeliveryStatus(it) }
        }, status = {
            scope.launch { updateMessageStatus(it) }
        })
    }

    private fun processOutgoingMessage(message: SocketMessage) {
        messageCheck(message, text = {
            scope.launch { processOutgoingTextMessage(it) }
        })
    }

    private suspend fun processIncomingTextMessage(message: TextMessage) {
        processTextMessage(message,
            success = { chat, chatMessage ->
                _incomingNotification
                    .emit(NotificationData(chatMessage, chat))
            })

        val otherUser = message.sender
        if (otherUser != null && !userDao.isUserExists(otherUser.id)) {
            userDao.insertUser(otherUser)
        }
    }

    private suspend fun processOutgoingTextMessage(message: TextMessage) {
        processTextMessage(message)
    }

    private suspend fun processTextMessage(
        message: TextMessage,
        success: (suspend (chat: Chat, chatMessage: ChatMessage) -> Unit)? = null
    ) {
        val chat = createAndInsertChat(message) ?: return
        val chatMessage = createAndInsertChatMessage(message, chat.id) ?: return
        success?.invoke(chat, chatMessage)
    }

    private suspend fun createAndInsertChat(message: TextMessage): Chat? {
        val chat = message.crateChat() ?: return null
        insertChat(chat)
        return chat
    }

    private suspend fun createAndInsertChatMessage(
        message: TextMessage,
        chatId: String
    ): ChatMessage? {
        val chatMessage = message.toChatMessage(chatId) ?: return null
        insertMessage(chatMessage)
        return chatMessage
    }

    private suspend fun insertChat(chat: Chat) {
        chatDao.insertChat(chat)
    }

    private suspend fun insertMessage(message: ChatMessage) {
        messageDao.insertMessage(message)
    }

    private suspend fun updateMessageStatus(status: MessageStatusCarrier) {
        messageDao.updateMessageStatus(status.messageId, status.status)
    }

    private suspend fun emitOutgoing(socketMessage: SocketMessage) {
        socket.outgoingMessage.emit(socketMessage)
    }

    private suspend fun replyDeliveryStatus(textMessage: TextMessage) {
        val status = textMessage.createDeliveredStatus()
        emitOutgoing(status)
    }

    private fun messageCheck(
        message: SocketMessage,
        text: (message: TextMessage) -> Unit = {},
        status: (message: MessageStatusCarrier) -> Unit = {},
        wander: (message: WanderingStatus) -> Unit = {},
        rtc: (message: RTCMessage) -> Unit = {},
    ) {
        when (message) {
            is TextMessage -> text(message)
            is MessageStatusCarrier -> status(message)
            is WanderingStatus -> wander(message)
            is RTCMessage -> rtc(message)
        }
    }

}