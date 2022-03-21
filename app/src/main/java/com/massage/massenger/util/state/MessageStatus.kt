package com.massage.massenger.util.state

enum class MessageStatus {
    SENDING,
    SENT,
    DELIVERED,
    SEEN,
    FAILED,
    RECEIVED,
    SEEN_RECEIVED,
    EMPTY_CHAT;

    fun isReceived(): Boolean {
        val array = values()
        return (array[this.ordinal] == RECEIVED || array[this.ordinal] == SEEN_RECEIVED)
    }
}