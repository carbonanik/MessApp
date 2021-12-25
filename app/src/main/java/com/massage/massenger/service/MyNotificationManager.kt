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
import com.massage.massenger.R
import com.massage.massenger.presentation.ui.MessagingActivity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MyNotificationManager @Inject constructor (@ApplicationContext private val context: Context) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun startMyOwnForeground(service: HelloService, notification: Notification) {
        val channel = NotificationChannel(NOTIFICATION_CHANNEL_ID, channelName, NotificationManager.IMPORTANCE_NONE)
        channel.lightColor = Color.BLUE
        channel.lockscreenVisibility = Notification.VISIBILITY_PRIVATE

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)

        service.startForeground(1, notification)
    }

    fun newNotification(): Notification {
        val notificationBuild = NotificationCompat.Builder(context, NOTIFICATION_CHANNEL_ID)
        return notificationBuild.setOngoing(true)
            .setSmallIcon(R.drawable.ic_baseline_chat_24)
            .setContentTitle("App Is Running In Background")
            .setPriority(NotificationManager.IMPORTANCE_DEFAULT)
            .setCategory(Notification.CATEGORY_SERVICE)
            .build()
    }


    fun sendNotification(title: String, contentText: String, notificationId: Int) {
        val intent = Intent(context, MessagingActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        val pendingIntent = PendingIntent.getActivity(context, 0, intent, 0)
        val builder = NotificationCompat.Builder(context, NOTIFICATION_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_baseline_chat_24)
                .setContentTitle(title)
                .setContentText(contentText)
                .setContentIntent(pendingIntent)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(context)) {
            notify(notificationId, builder.build())
        }
    }

    companion object {
        const val NOTIFICATION_CHANNEL_ID = "example.permanence"
        const val channelName = "Background Service"
    }
}
