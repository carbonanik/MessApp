package com.massage.massenger.util

import com.massage.massenger.util.object_id.ObjectId
import java.util.*


fun main() {
    val a1= ObjectId()
    val b1= ObjectId()
    val a2= ObjectId()
    val b2= ObjectId()
    val a3= ObjectId()
    val b3= ObjectId()
    val a4= ObjectId()
    val b4= ObjectId()

    println("")
}

object CalenderObj {
    val calender = Calendar.getInstance(Locale.getDefault())
}

fun Long.toTime2(): String {
    val calender = CalenderObj.calender
    calender.timeInMillis = this
//    val seconds = calender.get(Calendar.SECOND)
    val minutes = calender.get(Calendar.MINUTE)
    val hours = calender.get(Calendar.HOUR)

    val ampm =
        when (calender.get(Calendar.AM_PM)) {
            Calendar.AM -> "AM"
            Calendar.PM -> "PM"
            else -> ""
        }

    return "$hours:$minutes $ampm"

//    val numberOfDay = (calender.get(Calendar.DAY_OF_WEEK) + 7 - 2) % 7
//    val dayOfWeek = WeekDay.from(numberOfDay)

//    val dayOfMonth = calender.get(Calendar.DAY_OF_MONTH)
//    val dayOfYear = calender.get(Calendar.DAY_OF_YEAR)

//    val month = calender.get(Calendar.MONTH)
//    println(month)
//    val year = calender.get(Calendar.YEAR)
//    println(year)
}
