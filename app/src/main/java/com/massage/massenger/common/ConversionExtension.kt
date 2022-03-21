package com.massage.massenger.common

import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.util.extensions.toDate
import com.massage.massenger.util.extensions.toTime
import com.massage.massenger.util.state.MessageStatus


fun TextMessage.toChatMessage(chatId: String): ChatMessage? {
    sender ?: return null
    if (receiver == null && group == null) return null

    return ChatMessage(
        id = id,
        chatId = chatId,
        authorId = sender!!.id,
        authorName = sender!!.name,
        text = text,
        mediaUrl = mediaUrl,
        mediaType = mediaType,
        timestamp = timestamp,
        date = timestamp.toDate(),
        time = timestamp.toTime(),
        status = status
    )
}


fun TextMessage.crateChat(): Chat? {

    val otherUser = if (status.isReceived()) sender else receiver

    val id = group?.id ?: otherUser?.id ?: return null
    val name = group?.name ?: otherUser?.name ?: return null

    val type = if (group != null) ChatType.GROUP else ChatType.SINGLE

    val chatMessage = if (status.isReceived()) text ?: "Media"
    else "You: $text"

    return Chat(
        id = id,
        name = name,
        type = type,
        message = chatMessage,
        time = timestamp,
        status = status
    )
}

fun User.createChat(): Chat {
    return Chat(
        id = id,
        name = name,
        type = ChatType.SINGLE,
        message = "Say Hi!",
        time = System.currentTimeMillis(),
        status = MessageStatus.EMPTY_CHAT
    )
}

/**
 * creating a new text message [MessageStatus.DELIVERED] status carrier
 */
fun TextMessage.createDeliveredStatus() =
    MessageStatusCarrier(
        messageId = id,
        status = MessageStatus.DELIVERED
    ).apply {
        receiver = this@createDeliveredStatus.sender
    }
