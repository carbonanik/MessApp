package com.massage.massenger.presentation.messaging.single_chat

import android.net.Uri
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
import com.massage.massenger.model.SharedStoragePhoto
import com.massage.massenger.model.User
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.util.state.MessageStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
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

    private val _viewState = MutableStateFlow(SingleChatDataState())
    val viewState = _viewState.asStateFlow()

//    var singleChatViewState by mutableStateOf(SingleChatDataState())

    fun getSingleChatDataState(chat: Chat?, user: User?) {
        initAllData(chat, user)
    }

    private fun initAllData(chat: Chat?, user: User?) {
//        println("init all data")
        viewModelScope.launch {
            launch { getLoggedInUser() }
            launch { getCurrentChat(user, chat) }
            launch { getReceiverUser(chat, user) }
            launch { getReceiverGroup(chat) }
            launch { getAllMessageWithChat(chat?.id ?: user?.id) }
        }
    }

    private suspend fun getAllMessageWithChat(chatId: String?) {
        messageRepository.getAllMessageWithChat(chatId).collect { ml ->
            _viewState.value = _viewState.value
                .copy(messageList = ml)
        }
    }

    private suspend fun getLoggedInUser() {
        _viewState.value = _viewState.value
            .copy(loggedInUser = authRepository.getLoggedInUser())
    }

    private suspend fun getReceiverUser(chat: Chat?, user: User?) {
//        if (chat?.type == ChatType.GROUP) return
        val ru = userRepository.getUserByIdLocal(user?.id ?: chat?.id)
        _viewState.value = _viewState.value
            .copy(receiverUser = ru)
    }

    private suspend fun getReceiverGroup(chat: Chat?) {
        if (chat?.type != ChatType.GROUP) return
        _viewState.value = _viewState.value
            .copy(receivingGroup = groupRepository.getCachedGroupById(chat.id))

    }

    private suspend fun getCurrentChat(user: User?, chat: Chat?) {
        _viewState.value = _viewState.value
            .copy(
                currentChat = chat
                    ?: chatRepository.getChat(user?.id)
                    ?: user?.createChat()
            )
    }

    fun sendTextMessage(
        me: User?,
        text: String?,
        image: String?,
        receiverUser: User?,
        receiverGroup: Group?
    ) =
        createTextMessage(
            me = me,
            image = image,
            messageText = text,
            receiverUser = receiverUser,
            receiverGroup = receiverGroup
        )?.let {
            messageRepository.sendMessage(it)
        }

    fun submitPhotoForSend(photo: SharedStoragePhoto) {
        trySendingPhotos(
            _viewState.value.loggedInUser,
            _viewState.value.receiverUser,
            _viewState.value.receivingGroup, photo
        )
    }

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

    private fun trySendingPhotos(
        loggedInUser: User?,
        receiverUser: User?,
        receiverGroup: Group?,
        photo: SharedStoragePhoto
    ) {

        uploadPhoto(photo.contentUri) {
            sendTextMessage(
                loggedInUser, null,
                it.toString(), receiverUser, receiverGroup
            )
        }
    }

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

