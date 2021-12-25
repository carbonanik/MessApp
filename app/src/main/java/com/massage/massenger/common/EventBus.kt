package com.massage.massenger.common

import com.massage.massenger.data.remote.socket.dto.SocketMessage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

/**
 * EventBus
 * 17-06-2021
 */
@ExperimentalCoroutinesApi
object EventBus {

    private val outBus: Channel<SocketMessage> = Channel(10)
    private val inToRtc: Channel<SocketMessage> = Channel(10)
    private val inToService: Channel<SocketMessage> = Channel(10)

    fun outSend(message: SocketMessage){
        CoroutineScope(Dispatchers.Default).launch {
            outBus.send(message)
        }
    }

    fun inRtcSend(message: SocketMessage){
        CoroutineScope(Dispatchers.Default).launch {
            inToRtc.send(message)
        }
    }

    fun inServiceSend(message: SocketMessage){
        CoroutineScope(Dispatchers.Default).launch {
            inToService.send(message)
        }
    }



    fun outFlow(): Flow<SocketMessage>{
        return outBus.receiveAsFlow()
    }

    fun inRtcFlow(): Flow<SocketMessage> {
        return inToRtc.consumeAsFlow()
    }

    fun inServiceFlow(): Flow<SocketMessage>{
        return inToService.consumeAsFlow()
    }

    //    val bus: Channel<Any> = Channel(capacity = 10, onUndeliveredElement = this::onUndelivered)

    /**
     * 19-6-21
     */
//    private fun <E>onUndelivered(e: E){
//        lg(this::class, e.toString())
//        onUndelivered?.invoke(e)
//    }

    /**
     * 19-6-21
     */
//    val onUndelivered: ((Any?) -> Unit)? = null
//
//    suspend fun send(data: Any) {
//        lg(this::class, "event bus send")
//        bus.send(data)
//    }


//    inline fun <reified T> asFlow(): Flow<T> {
//        return bus.consumeAsFlow()
//                .filter { it is T }
//                .map { it as T }
//    }
}
