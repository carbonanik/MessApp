package com.massage.massenger.presentation.messaging.single_chat

import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.*
import com.massage.massenger.common.TextMessage
import com.massage.massenger.data.remote.firebase.FirebaseStorage
import com.massage.massenger.data.repository.*
import com.massage.massenger.model.*
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.presentation.messaging.Screen
import com.massage.massenger.util.state.MessageStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SingleChatViewModel @Inject constructor(
    private val userDataRepository: UserDataRepository,
    private val socketMessageRepository: SocketMessageRepository,
    private val chatDBRepository: ChatDBRepository,
    private val userDBRepository: UserDBRepository,
    private val messageDBRepository: MessageDBRepository
) : ViewModel() {

    var me by mutableStateOf<User?>(null)
        private set

    var chat by mutableStateOf<Chat?>(null)
        private set

    var receiverUser by mutableStateOf<User?>(null)
        private set

    /**
     * gallery photo for sending
     */
    val photos = mutableStateListOf<SharedStoragePhoto>()

    /**
     * all message of this chat
     */
    val displayMessage = mutableStateListOf<ChatMessage>()


    fun initSingleChatArgs(args: Screen.SingleChatScreen.SingleChatArgs) {
        if (me == null) {
            getLoggedInUser()
        }

        if (chat == null && args.chatId != null) {
            chatById(args.chatId, success = {
                if (chat?.type == ChatType.SINGLE) {
                    receiverUser(chat?.id)
                } else if (chat?.type == ChatType.GROUP) {

                }
            })
        }

        if (receiverUser == null && args.userId != null) {
            receiverUser(args.userId)
        }

        if (displayMessage.isEmpty() && chat != null){
            viewModelScope.launch {
                messageDBRepository.allWithChat(chat?.id).collect { list ->
                    displayMessage.clear()
                    displayMessage.addAll(list)
                }
            }
        }

    }

    /**
     * me / author
     * logged in user
     */
    private fun getLoggedInUser() {
        viewModelScope.launch {
            me = userDataRepository.getUser()
        }
    }

    /**
     * get the chat if open from chat list
     * or get null
     */
    private fun chatById(id: String?, success: () -> Unit) {
        viewModelScope.launch {
            chat = chatDBRepository.getChat(id)
            if (chat != null) success()
        }
    }

    /**
     * other person / user // receiver of the chat
     */
    private fun receiverUser(id: String?) {
        viewModelScope.launch {
            receiverUser = userDBRepository.getUser(id)
        }
    }

    /**
     * send text message to other person
     */
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
            socketMessageRepository.sendMessage(it)
        }

    fun submitPhotoUriToUpload(contentUri: Uri) {
        uploadPhoto(contentUri) { uri ->
            println(uri)
            sendTextMessage(
                me = me,
                text = null,
                image = uri.toString(),
                receiverUser = receiverUser,
                receiverGroup = null
            )
        }
    }

    private fun uploadPhoto(contentUri: Uri, complete: (uri: Uri?) -> Unit) {
        FirebaseStorage.uploadPhoto(
            uri = contentUri,
            extension = "jpg",
            onProgress = {
                //todo progress
            },
            onSuccess = {
                // send message
                complete(it)
            })
    }

    /**
     * create new text message
     * sender me
     * receiver provided user / group
     */
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
            image = image,
            status = MessageStatus.SENDING
        ).apply {
            sender = me
            receiver = receiverUser
            group = receiverGroup
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

