package com.massage.massenger.util.extensions

import android.os.Build
import com.massage.massenger.data.remote.socket.dto.SocketMessage
import com.massage.massenger.model.User


fun <T, U, R> Pair<T?, U?>.biLet(body: (T, U) -> R): R? {
    val first = first
    val second = second
    if (first != null && second != null) {
        return body(first, second)
    }
    return null
}

inline fun <T> T.setPersons(sender: User?, receiver: User?, block: (message: T) -> Unit) {
    Pair(sender, receiver).biLet { s, r ->

        (this as SocketMessage).apply {
            this.sender = s
            this.receiver = r
        }

    }?.let {
        block(it as T)
    }
}

inline fun <T> minSDK29OrUp(onSdk29: () -> T): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
        onSdk29()
    } else null
}


