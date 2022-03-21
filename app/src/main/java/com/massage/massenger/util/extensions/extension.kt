package com.massage.massenger.util.extensions

import android.os.Build
import android.util.Base64
import com.massage.massenger.data.remote.socket.dto.SocketMessage
import com.massage.massenger.model.User
import java.math.BigInteger
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.text.SimpleDateFormat
import java.util.*


fun <T, U, R> Pair<T?, U?>.biLet(body: (T, U) -> R): R? {
    val first = first
    val second = second
    if (first != null && second != null) {
        return body(first, second)
    }
    return null
}

inline fun <T : SocketMessage> T.setPersons(
    sender: User?,
    receiver: User?,
    block: (message: T) -> Unit
) {
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
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        onSdk29()
    } else null
}

fun Long.toTime(): String? =
    SimpleDateFormat("h:mm a", Locale.getDefault()).format(this)

object CalenderInstance {

}

//fun Long.toTime2() {
//    val calender = Calendar.getInstance(Locale.getDefault())
//    calender.timeInMillis = this
//    val seconds = calender.get(Calendar.SECOND)
//    val minutes = calender.get(Calendar.MINUTE)
//    val hours = calender.get(Calendar.HOUR_OF_DAY)
//
//    val numberOfDay = (calender.get(Calendar.DAY_OF_WEEK) + 7 - 2) % 7
//    val dayOfWeek = WeekDay.from(numberOfDay)
//
//    val dayOfMonth = calender.get(Calendar.DAY_OF_MONTH)
//    val dayOfYear = calender.get(Calendar.DAY_OF_YEAR)
//
//    val month = Month.from(calender.get(Calendar.MONTH))
//    val year = calender.get(Calendar.YEAR)
//}

fun Long.toDate(): String? =
    SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(this)

fun String.toTimestamp(): Long? =
    SimpleDateFormat("dd-MM-yyyy, HH:mm:ss", Locale.getDefault())
        .parse(this)?.time

fun String.timeToTimestamp() =
    SimpleDateFormat("h:mm a", Locale.getDefault())
        .parse(this)?.time

fun String.dateToTimestamp() =
    SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(this)?.time

fun Long.generateName(): String? =
    SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SS", Locale.getDefault()).format(this)

fun String.encode(): String {
    return Base64.encodeToString(
        toByteArray(StandardCharsets.UTF_8),
        Base64.URL_SAFE
    )
}

fun String.decode(): String {
    return String(
        Base64.decode(this, Base64.URL_SAFE),
        StandardCharsets.UTF_8
    )
}

fun String.md5(): String {
    val md = MessageDigest.getInstance("MD5")
    return BigInteger(
        1,
        md.digest(toByteArray())
    ).toString(16).padStart(32, '0')
}