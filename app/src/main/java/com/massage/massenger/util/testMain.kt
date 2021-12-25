package com.massage.massenger.util

import com.massage.massenger.util.extensions.toJson
import com.massage.massenger.common.TextMessage
import com.massage.massenger.model.User


fun main() {
    val text = TextMessage()
    text.sender = User("","","")
    text.receiver = User("","","")
    println(text.toJson())
}