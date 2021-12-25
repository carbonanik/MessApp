package com.massage.massenger.util.naim

import com.massage.massenger.util.extensions.toJson
import com.massage.massenger.data.remote.socket.dto.SocketMessage
import com.massage.massenger.common.MessageStatusCarrier

fun main() {
    val m: SocketMessage = MessageStatusCarrier()

//    val j = "{\"type\":\"TextMessage\",\"sender\":{\"phoneId\":\"\",\"id\":\"\",\"name\":\"\"},\"receiver\":{\"phoneId\":\"\",\"id\":\"\",\"name\":\"\"},\"id\":\"1000\",\"localId\":\"4449b81c-a885-4afc-9945-d61b39ab0709\",\"time\":1633485779898,\"text\":\"Its a message\",\"image\":null}"

    println(m.toJson())
//    println(j.fromJson<ClientMessage>())
}