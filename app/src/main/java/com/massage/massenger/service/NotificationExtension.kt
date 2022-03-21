package com.massage.massenger.service

import android.app.NotificationManager
import android.content.Context

fun Context.getNotificationManager() =
    getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager
