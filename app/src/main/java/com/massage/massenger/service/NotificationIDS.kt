package com.massage.massenger.service

import java.util.concurrent.atomic.AtomicInteger

object NotificationIDS {

    private val atomicInteger = AtomicInteger(10)
    private val notificationIDs = mutableMapOf<String, Int>()

    private fun getNewIntId(): Int {
        return atomicInteger.incrementAndGet()
    }

    fun notificationId(userId: String): Int? {
        return if (notificationIDs.containsKey(userId)){
            notificationIDs[userId]
        } else {
            notificationIDs[userId] = getNewIntId()
            notificationIDs[userId]
        }
    }
}