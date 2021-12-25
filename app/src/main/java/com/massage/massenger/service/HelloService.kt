package com.massage.massenger.service

import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder
import com.massage.massenger.common.RTCMessage
import com.massage.massenger.common.RtcRequest
import com.massage.massenger.data.repository.SocketMessageRepository
import com.massage.massenger.util.extensions.toJson
import com.massage.massenger.model.*
import com.massage.massenger.model.enumstate.RTCConnectionType
import com.massage.massenger.model.enumstate.RTCRequestType
import com.massage.massenger.presentation.ui.DataChannelActivity
import com.massage.massenger.presentation.ui.RTCActivity
import com.massage.massenger.util.ACCEPTING
import com.massage.massenger.util.OTHER_PERSON
import com.massage.massenger.util.REQ_OR_ACC
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class HelloService: Service() {

    @Inject lateinit var socketMessageRepository: SocketMessageRepository
    @Inject lateinit var myNotificationManager: MyNotificationManager

    override fun onCreate(){
        super.onCreate()

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O) {
            myNotificationManager.startMyOwnForeground(this,
                myNotificationManager.newNotification())
        } else {
            startForeground(1, myNotificationManager.newNotification())
        }
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)

        subscribeToSocketEvents()

        return START_STICKY
    }

    private fun subscribeToSocketEvents() {

        CoroutineScope(Dispatchers.Default).launch {
            launch {
                launch {
                    socketMessageRepository.incomingRtcEvent.collect {
                        isRtcRequest(it)
                    }
                }
            }
        }
    }

    private suspend fun isRtcRequest(message: RTCMessage){
        when (message) {
            is RtcRequest -> {
                if (message.rtcConType == RTCConnectionType.VideoCall && message.rtcReqType == RTCRequestType.REQUESTING ) { /// offer came from another user

                    val intent = Intent(
                        this@HelloService,
                        RTCActivity::class.java
                    )

                    intent.putExtra(REQ_OR_ACC, ACCEPTING)
                    val senderJson = message.sender.toJson()
                    intent.putExtra(OTHER_PERSON, senderJson)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

                    startActivity(intent)
                } else if (message.rtcConType == RTCConnectionType.DataChannel && message.rtcReqType == RTCRequestType.REQUESTING ) {

                    val intent = Intent(
                        this@HelloService,
                        DataChannelActivity::class.java
                    )

                    intent.putExtra(REQ_OR_ACC, ACCEPTING)
                    val senderJson = message.sender.toJson()
                    intent.putExtra(OTHER_PERSON, senderJson)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

                    startActivity(intent)

//////////////////////////////////////////////////////////////////////////////////////////////


//                    val fullScreenIntent = Intent(this, VideoCallActivity::class.java).apply {
//                        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//                    }
//                    val fullScreenPendingIntent = PendingIntent.getActivity(this, 0,
//                        fullScreenIntent, PendingIntent.FLAG_UPDATE_CURRENT)
//
//                    val notificationBuilder =
//                        NotificationCompat.Builder(this, "videoCallNotification")
//                            .setSmallIcon(R.drawable.ic_baseline_videocam_24)
//                            .setContentTitle("Anik")
//                            .setContentText("(919) 555-1234")
//                            .setPriority(NotificationCompat.PRIORITY_HIGH)
//                            .setCategory(NotificationCompat.CATEGORY_CALL)

                            // Use a full-screen intent only for the highest-priority alerts where you
                            // have an associated activity that you would like to launch after the user
                            // interacts with the notification. Also, if your app targets Android 10
                            // or higher, you need to request the USE_FULL_SCREEN_INTENT permission in
                            // order for the platform to invoke this notification.
//                            .setFullScreenIntent(fullScreenPendingIntent, true)
//
//                    val incomingCallNotification = notificationBuilder.build()
//
//                    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O) {
//
//                        val notificationChannel = NotificationChannel(
//                            "videoCallNotification",
//                            "videoCallNotification",
//                            NotificationManager.IMPORTANCE_NONE
//                        )
//
//                        notificationChannel.lightColor = Color.BLUE
//                        notificationChannel.lockscreenVisibility = Notification.VISIBILITY_PRIVATE
//
//                        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//                        manager.createNotificationChannel(notificationChannel)
//
//                        startForeground(100, incomingCallNotification)
//                    } else {
//                        startForeground(100, incomingCallNotification)
//                    }


                }
            }
            else -> {}
        }
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

//    override fun onDestroy() {
//        messageRepository.closeSocket()
//        println("service destroyed")
//        super.onDestroy()
//    }
}