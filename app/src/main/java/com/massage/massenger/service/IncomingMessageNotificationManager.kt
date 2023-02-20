package com.massage.massenger.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.TaskStackBuilder
import com.massage.massenger.R
import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.presentation.navigation.SingleChatDestination
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class IncomingMessageNotificationManager @Inject constructor(@ApplicationContext private val context: Context) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun createFloatingNotificationChannel() {
        createChannel(FLOATING_CHANNEL_ID, FLOATING_CHANNEL_NAME)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun createMessageNotificationChannel() {
        createChannel(MESSAGE_CHANNEL_ID, MESSAGE_CHANNEL_NAME)
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun createChannel(id: String, name: String) {
        val channel = NotificationChannel(id, name, NotificationManager.IMPORTANCE_NONE)
        channel.lightColor = Color.BLUE
        channel.lockscreenVisibility = Notification.VISIBILITY_PRIVATE

        val manager = context.getNotificationManager()
        manager?.createNotificationChannel(channel)
    }

    fun sendNotification(notificationData: NotificationData, notificationId: Int) {
        with(NotificationManagerCompat.from(context)) {
            notify(notificationId, notificationBuilder(notificationData).build())
        }
    }

    private fun notificationBuilder(notificationData: NotificationData) =
        NotificationCompat.Builder(context, MESSAGE_CHANNEL_ID).apply {
            setSmallIcon(R.drawable.ic_baseline_chat_24)
            setContentTitle(notificationData.chat.name)
            setContentText(notificationData.chatMessage.text ?: "New Message")
            setContentIntent(buildPendingIntent(notificationData.chat))
            setAutoCancel(true)
        }

    private fun buildPendingIntent(chat: Chat): PendingIntent? {
        val openChatIntent = Intent(
            Intent.ACTION_VIEW,
            SingleChatDestination.getDeepLink(chat)
//            "app://com.massage.massenger/test".toUri()
        )

        return TaskStackBuilder.create(context).run {
            addNextIntentWithParentStack(openChatIntent)
            getPendingIntent(
                REQUEST_CODE_OPEN_CHAT,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )
        }
    }

    companion object {
        const val FLOATING_CHANNEL_ID = "floating_notification_channel"
        const val MESSAGE_CHANNEL_ID = "messapp_notification_channel"

        const val FLOATING_CHANNEL_NAME = "Floating Notification Channel"
        const val MESSAGE_CHANNEL_NAME = "Messapp Notification Channel"
        const val REQUEST_CODE_OPEN_CHAT = 1_121_111
    }
}


data class NotificationData(
    val chatMessage: ChatMessage,
    val chat: Chat
)