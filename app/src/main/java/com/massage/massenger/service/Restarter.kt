package com.massage.massenger.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build

@ExperimentalStdlibApi
class Restarter: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        println( " Service Restarted")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            context?.startForegroundService(Intent(context, HelloService::class.java))
        else
            context?.startService(Intent(context, HelloService::class.java))
    }
}