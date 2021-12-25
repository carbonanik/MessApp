package com.massage.massenger.common

import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.util.state.MessageStatus


fun TextMessage.toChatMessage(chatId: String): ChatMessage? {
    sender ?: return null

    return ChatMessage(
        id = localId.toString(),
        chatId = chatId,
        authorId = sender!!.id,
        authorName = sender!!.name,
        text = text,
        image = image,
        messageTime = time,
        messageStatus = status
    )
}


fun TextMessage.crateChat(): Chat? {

    val otherUser =
        if (status.isReceived()) sender
        else receiver

    val id = group?.id ?: otherUser?.id
    val name = group?.name ?: otherUser?.name

    val type =
        if (group != null) ChatType.GROUP
        else ChatType.SINGLE

    if (id == null || name == null) return null

    fun chatText(): String {
        return if (status.isReceived()) text ?: ""
        else "You: $text"
    }

    return Chat(
        id = id,
        name = name,
        type = type,
        message = chatText(),
        time = time,
        status = status
    )
}

/**
 * creating a new text message [MessageStatus.DELIVERED] status carrier
 */
fun TextMessage.createDeliveredStatus() =
    MessageStatusCarrier(
        messageLocalId = localId,
        status = MessageStatus.DELIVERED
    ).apply {
        receiver = this@createDeliveredStatus.sender
    }
