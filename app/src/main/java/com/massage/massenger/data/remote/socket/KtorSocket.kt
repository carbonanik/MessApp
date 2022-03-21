package com.massage.massenger.data.remote.socket

import com.massage.massenger.data.local.pref.UserDataSource
import com.massage.massenger.data.remote.socket.dto.SocketMessage
import com.massage.massenger.util.extensions.fromJson
import com.massage.massenger.util.extensions.toJson
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.features.websocket.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.http.cio.websocket.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton


/**
 * 19-10-21
 */
@Singleton
class KtorSocket @Inject constructor(
    private val userDataSource: UserDataSource
) {
    private val scope = CoroutineScope(Dispatchers.IO)

    val incomingMessage = MutableSharedFlow<SocketMessage>()
    val outgoingMessage = MutableSharedFlow<SocketMessage>()

    init {
        start()
    }

    private fun start() {
        println("Ktor Socket")
        scope.launch {
            val token = userDataSource.getTokenFirst()
            val client = createWSClient(token)
            openSocketSession(client)
        }
    }

    /**
     * create a new [HttpClient] with authorization token
     */
    private fun createWSClient(token: String): HttpClient {
        return HttpClient(CIO) {
            defaultRequest { header(HttpHeaders.Authorization, token) }
            install(WebSockets)
        }
    }

    /**
     * try opening [WebSocketSession]
     */
    private fun openSocketSession(client: HttpClient) {
        scope.launch {
            try {
                val wsSession = client.webSocketSession(
                    method = HttpMethod.Get,
                    host = "ktor-mess-app.herokuapp.com",//"10.0.2.2", port = 8080,
                    path = "/socket/chat"
                )

                launch { wsSession.receiveIncoming() }
                launch { wsSession.sendOutgoing() }

            } catch (e: Exception) {
                client.close()
                println(e.message)
                delay(2000)
                start()
            }
        }
    }

    private suspend fun DefaultClientWebSocketSession.receiveIncoming() {
        incoming.consumeEach { frame ->
            (frame as? Frame.Text)?.readText()
                ?.fromJson<SocketMessage>()
                ?.let { receive(it) }
        }
    }

    private suspend fun DefaultClientWebSocketSession.sendOutgoing() {
        outgoingMessage.collect {
            send(it.toJson())
        }
    }

    private suspend fun receive(m: SocketMessage){
        incomingMessage.emit(m)
    }
}