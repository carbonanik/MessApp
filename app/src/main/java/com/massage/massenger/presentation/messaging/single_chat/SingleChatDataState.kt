package com.massage.massenger.presentation.messaging.single_chat

import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.Group
import com.massage.massenger.model.User

data class SingleChatDataState(
    val loggedInUser: User? = null,
    val currentChat: Chat? = null,
    val receiverUser: User? = null,
    val receivingGroup: Group? = null,
    val messageList: List<ChatMessage> = emptyList()
)
