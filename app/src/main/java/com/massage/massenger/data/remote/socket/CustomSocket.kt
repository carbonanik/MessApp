package com.massage.massenger.data.remote.socket

import com.massage.massenger.common.TextMessage
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
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CustomSocket @Inject constructor(
    private val userDataSource: UserDataSource
) {

    private val scope = CoroutineScope(Dispatchers.IO)

    private var client: HttpClient? = null
    private var wsSession: DefaultWebSocketSession? = null

    init {
        start()
    }

    private fun start() {
        println("Ktor Socket")
        scope.launch {
            val token = userDataSource.getToken()
        }
    }

    private fun createHttpClient(token: String): HttpClient {
        return HttpClient(CIO) {
            defaultRequest { header(HttpHeaders.Authorization, token) }
            install(WebSockets)
        }
    }

    private fun openSocketSession() {
        scope.launch {
            try {
                wsSession = client?.webSocketSession(
                    method = HttpMethod.Get,
                    host = "ktor-mess-app.herokuapp.com",//"10.0.2.2", port = 8080,
                    path = "/socket/chat"
                )
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    suspend fun receiveIncoming(receive: (message: SocketMessage) -> Unit) {
        wsSession?.incoming?.consumeEach { frame ->
            (frame as? Frame.Text)?.readText()
                ?.fromJson<SocketMessage>()
                ?.let { receive(it) }
        }
    }

    fun incoming(): Flow<SocketMessage?>? {
        return wsSession?.incoming?.receiveAsFlow()
            ?.filter { it is Frame.Text }
            ?.map { (it as Frame.Text).readText().fromJson<SocketMessage>() }
    }

    fun incomingText(): Flow<TextMessage?>? {
        return incoming()?.filter { it is TextMessage }?.map { it as TextMessage }
    }

    suspend fun sendOutgoing(message: SocketMessage) {
        wsSession?.send(message.toJson())
    }
}