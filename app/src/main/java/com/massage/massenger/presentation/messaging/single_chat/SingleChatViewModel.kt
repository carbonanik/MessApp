package com.massage.massenger.presentation.messaging.single_chat

import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.common.TextMessage
import com.massage.massenger.common.createChat
import com.massage.massenger.data.local.content.ExternalStorageImageProvider
import com.massage.massenger.data.remote.firebase.FirebaseStorage
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.data.repository_impl.ChatRepositoryImpl
import com.massage.massenger.data.repository_impl.GroupRepository
import com.massage.massenger.data.repository_impl.MessageRepository
import com.massage.massenger.data.repository_impl.UserRepository
import com.massage.massenger.model.Chat
import com.massage.massenger.model.Group
import com.massage.massenger.model.User
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.util.extensions.toJson
import com.massage.massenger.util.state.MessageStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SingleChatViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val messageRepository: MessageRepository,
    private val chatRepository: ChatRepositoryImpl,
    private val groupRepository: GroupRepository,
    private val userRepository: UserRepository,
    private val externalStorageImageProvider: ExternalStorageImageProvider,
) : ViewModel() {

    var dataState by mutableStateOf(SingleChatDataState())
        private set

    fun getSingleChatDataState(chat: Chat?, user: User?) {
        initAllData(chat, user)
    }

    private fun initAllData(chat: Chat?, user: User?) {
        viewModelScope.launch {
            launch { getLoggedInUser() }
            launch { getCurrentChat(user, chat) }
            launch { getReceiverUser(chat, user) }
            launch { getReceiverGroup(chat) }
            launch { getAllMessageWithChat(chat?.id ?: user?.id) }
        }
    }

    private suspend fun getAllMessageWithChat(chatId: String?) {
        messageRepository.getAllMessageWithChat(chatId).collect { messageList ->
            dataState = dataState
                .copy(messageList = messageList)
        }
    }

    private suspend fun getLoggedInUser() {
        dataState = dataState
            .copy(loggedInUser = authRepository.getLoggedInUser())
    }

    private suspend fun getReceiverUser(chat: Chat?, user: User?) {
//        if (chat?.type == ChatType.GROUP) return
        val receiverUser = userRepository.getUserByIdLocal(user?.id ?: chat?.id)
        dataState = dataState
            .copy(receiverUser = receiverUser)
    }

    private suspend fun getReceiverGroup(chat: Chat?) {
        if (chat?.type != ChatType.GROUP) return
        dataState = dataState
            .copy(receivingGroup = groupRepository.getCachedGroupById(chat.id))

    }

    private suspend fun getCurrentChat(user: User?, chat: Chat?) {
        dataState = dataState
            .copy(
                currentChat = chat
                    ?: chatRepository.getChat(user?.id)
                    ?: user?.createChat()
            )
    }

    fun sendTextMessage(
        text: String?,
        image: String?,
    ) =
        createTextMessage(
            me = dataState.loggedInUser,
            image = image,
            messageText = text,
            receiverUser = dataState.receiverUser,
            receiverGroup = dataState.receivingGroup
        )?.let {
            println(it.toJson())
            messageRepository.sendMessage(it)
        }

//    fun submitPhotoForSend(photo: SharedStoragePhoto) {
//        trySendingPhotos(
//            dataState.loggedInUser,
//            dataState.receiverUser,
//            dataState.receivingGroup, photo
//        )
//    }

    private fun uploadPhoto(contentUri: Uri, complete: (uri: Uri?) -> Unit) {
        FirebaseStorage.uploadPhoto(
            uri = contentUri,
            extension = "jpg",
            onProgress = {
                //todo progress
            },
            onSuccess = {
                complete(it)
            })
    }

    private fun createTextMessage(
        me: User?,
        image: String? = null,
        messageText: String? = null,
        receiverUser: User? = null,
        receiverGroup: Group? = null,
    ): TextMessage? {
        me ?: return null
        if (receiverUser == null && receiverGroup == null) return null

        return TextMessage(
            text = messageText,
            mediaUrl = image,
            status = MessageStatus.SENDING
        ).apply {
            sender = me
            receiver = receiverUser
            group = receiverGroup
        }
    }

    fun getImages() =
        externalStorageImageProvider.getPhotos()

//    private fun trySendingPhotos(
//        loggedInUser: User?,
//        receiverUser: User?,
//        receiverGroup: Group?,
//        photo: SharedStoragePhoto
//    ) {
//
//        uploadPhoto(photo.contentUri) {
//            sendTextMessage(
//                loggedInUser,
//                null,
//                it.toString(),
//                receiverUser,
//                receiverGroup
//            )
//        }
//    }

//    fun initList() {
//        sendWandering(WanderingState.WANDERING)
//    }

//    private fun checkStatusChange(message: TextMessage){
//        if ( message.status != MessageStatus.RECEIVED){
//            sendStatus(message.localId, MessageStatus.SEEN)
//        }
//    }

//    fun sendWandering(status: WanderingState) =
//        newWandering(status)?.let { messageRepository.sendMessage(it) }
//
//    private fun sendStatus(localId: UUID, s: MessageStatus) =
//        newStatus(localId, s)?.let { messageRepository.sendMessage(it) }
//
//


//    private fun newStatus(localId: UUID, status: MessageStatus) =
//        Pair(thisPerson, otherPerson).biLet { thisP, otherP ->
//
//                MessageStatusCarrier(
//                    messageLocalId = localId,
//                    status = status
//                ).apply {
//                    sender = thisP
//                    receiver = otherP
//                }
//            }
//
//    private fun newWandering(status: WanderingState) =
//        Pair(thisPerson, otherPerson).biLet { thisP, otherP ->
//
//                WanderingStatus(status = status).apply {
//                    sender = thisP
//                    receiver = otherP
//                }
//            }
}

