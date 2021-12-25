package com.massage.massenger.data.remote.socket
//
//import com.massage.massenger.data.remote.socket.dto.ClientMessage
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.flow.MutableSharedFlow
//import okhttp3.OkHttpClient
//import okhttp3.WebSocket
//import okhttp3.WebSocketListener
//
///**
// * 09 - 06 - 2021
// */
//
//class WebSocketServiceProvider {
//
//    private var _webSocket: WebSocket? = null
//    private var _webSocketListener: WebSocketListener? = null
//    private var token: String? = null
//
//    private val scope = CoroutineScope(Dispatchers.Default)
//
//    private val _incoming = MutableSharedFlow<ClientMessage>()
//    val incoming = _incoming.asSharedFlow()
//
//    private val okHttpClient: OkHttpClient = OkHttpClient.Builder()
//            .readTimeout(30, TimeUnit.SECONDS)
//            .connectTimeout(39, TimeUnit.SECONDS)
//            .retryOnConnectionFailure(true)
//            .build()
//
//    private val wsURL = wsURL()
//
//    fun startSocket(token: String) {
//        this.token = token
//        _webSocketListener = getWebSocketListener()
//        _webSocket = getWebSocket(getWebSocketListener(), token)
//
//    }
//
//    private fun getWebSocketListener(): WebSocketListener {
//        return _webSocketListener ?: listener
//    }
//
//    private fun getWebSocket(webSocketListener: WebSocketListener, token: String): WebSocket {
//        return _webSocket ?: okHttpClient.newWebSocket(
//                                request(token),
//                                webSocketListener
//                            )
//    }
//
//    private fun request(token: String): Request {
//        return Request.Builder()
//            .url(wsURL)
//            .addHeader("authorization", token)
//            .build()
//    }
//
//    fun stopSocket(){
//        try {
//            _webSocket?.close(NORMAL_CLOSURE_STATUS, null)
//            _webSocket = null
//            _webSocketListener = null
//        } catch (e: Exception){
//            println(e.message)
//        }
//    }
//
//    companion object {
//        const val NORMAL_CLOSURE_STATUS = 1000
//    }
//
//    private fun onFailure(t: Throwable) {
//        println(t)
//        restartSocket()
//    }
//
//    private fun restartSocket(){
//        _webSocketListener = null
//        _webSocket = null
//        Thread.sleep(3000)
//        _webSocketListener = getWebSocketListener()
//        _webSocket = getWebSocket(_webSocketListener!!, token!!)
//    }
//
//    fun sendMessage(message: ClientMessage){
//        println(message)
//        _webSocket?.send(message.toJson())
//    }
//
//    val listener: WebSocketListener = object : WebSocketListener() {
//
//        override fun onOpen(webSocket: WebSocket, response: Response) {
//            super.onOpen(webSocket, response)
//            println("Socket Open")
//        }
//
//        override fun onMessage(webSocket: WebSocket, text: String) {
//            super.onMessage(webSocket, text)
//            try {
//                scope.launch {
//                    _incoming.emit(text.fromJson())
//                }
//            } catch (e: Exception){
//                println(e)
//            }
//        }
//
//        override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
//            super.onClosing(webSocket, code, reason)
//            webSocket.close(NORMAL_CLOSURE_STATUS, null)
//        }
//
//        override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
//            onFailure(t)
//            super.onFailure(webSocket, t, response)
//        }
//    }
//}