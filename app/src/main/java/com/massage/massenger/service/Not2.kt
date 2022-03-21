package com.massage.massenger.service

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.TaskStackBuilder
import com.massage.massenger.R
import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.presentation.ui.MessagingActivity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

//class MessageNotificationManager2 @Inject constructor(@ApplicationContext private val context: Context) {
//
////    @RequiresApi(Build.VERSION_CODES.O)
////    fun startMyOwnForeground(service: HelloService, notification: Notification) {
////        val channel = NotificationChannel(
////            MESSAGE_NOT_CHANNEL_ID,
////            channelName,
////            NotificationManager.IMPORTANCE_NONE
////        )
////        channel.lightColor = Color.BLUE
////        channel.lockscreenVisibility = Notification.VISIBILITY_PRIVATE
////
////        val manager = context.getNotificationManager()
////        manager?.createNotificationChannel(channel)
////
////        service.startForeground(1, notification)
////    }
//
////    fun floatingForegroundNotification(): Notification {
////        val notificationBuild = NotificationCompat.Builder(context, FLOATING_NOT_CHANNEL_ID)
////        return notificationBuild.setOngoing(true)
////            .setSmallIcon(R.drawable.ic_baseline_chat_24)
////            .setContentTitle("App Is Running In Background")
////            .setPriority(NotificationManager.IMPORTANCE_DEFAULT)
////            .setCategory(Notification.CATEGORY_SERVICE)
////            .build()
////    }
//
//
//    fun sendNotification(
//        notificationData: NotificationData,
//        notificationId: Int
//    ) {
//        val intent = Intent(
//            context,
//            MessagingActivity::class.java
//        ).apply {
//            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//        }
//
////        val intent = Intent(
////            Intent.ACTION_VIEW,
////            ("${context.resources.getString(R.string.intent_uri)}/" +
////                    "chat=${notificationData.chat.toJson()}").toUri(),
////            context,
////            MessagingActivity::class.java
////        ).apply {
////            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
////        }
//
//        val pendingIntent = PendingIntent.getActivity(context, 0, intent, 0)
////        val pendingIntent: PendingIntent? = TaskStackBuilder.create(context).run {
////            addNextIntentWithParentStack(intent)
////            getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
////        }
//
//        val builder = NotificationCompat.Builder(context, MESSAGE_NOT_CHANNEL_ID)
//            .setSmallIcon(R.drawable.ic_baseline_chat_24)
//            .setContentTitle(notificationData.chat.name)
//            .setContentText(notificationData.chatMessage.text)
//            .setContentIntent(pendingIntent)
//            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//
//        with(NotificationManagerCompat.from(context)) {
//            notify(notificationId, builder.build())
//        }
//    }
//
//    companion object {
//        const val FLOATING_NOT_CHANNEL_ID = "floating_notification_channel"
//        const val MESSAGE_NOT_CHANNEL_ID = "messapp_notification_channel"
//        const val channelName = "Messapp Notification Channel"
//        const val REQUEST_CODE_OPEN_CHAT = 1_121_111
//    }
//
//    fun showMessageNotification(not: NotificationData, notificationId: Int) {
//        val builder = buildNotification(not)
//        //builder.addAction(getCompleteAction(task))
//        context.getNotificationManager()?.notify(notificationId, builder.build())
//    }
//
//    private fun Context.getNotificationManager() =
//        getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager
//
//    private fun buildNotification(not: NotificationData) =
//        NotificationCompat.Builder(context, MESSAGE_NOT_CHANNEL_ID).apply {
//            setSmallIcon(R.drawable.ic_baseline_chat_24)
//            setContentTitle(not.chat.name)
//            setContentText(not.chatMessage.text)
//            setContentIntent(buildPendingIntent(not.chat))
//            setAutoCancel(true)
//            //addAction(getSnoozeAction(task))
//        }
//
//    private fun buildPendingIntent(chat: Chat): PendingIntent? {
//        val openChatIntent = Intent(
//            Intent.ACTION_VIEW,
//            Screen.SingleChatScreen.getDeepLink(chat)
//        )
//
//        return TaskStackBuilder.create(context).run {
//            addNextIntentWithParentStack(openChatIntent)
//            getPendingIntent(
//                REQUEST_CODE_OPEN_CHAT,
//                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
//            )
//        }
//    }
//}
//
//data class NotificationData2(
//    val chatMessage: ChatMessage,
//    val chat: Chat
//)
