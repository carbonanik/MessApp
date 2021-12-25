package com.massage.massenger.util.extensions

import com.massage.massenger.data.local.pref.NO_TOKEN
import com.massage.massenger.common.Resource
import io.ktor.client.features.*
import io.ktor.client.statement.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.withContext
import java.nio.charset.Charset

inline fun <NetResult, LocalResult> networkBoundResource(
    tokenFlow: Flow<String>,
    crossinline query: () -> Flow<NetResult>,
    crossinline fetch: suspend (token: String) -> LocalResult,
    crossinline saveFetchResult: suspend (LocalResult) -> Unit,
    crossinline shouldFetch: (NetResult) -> Boolean = { true }
) = flow {

    val data = query().first()

    val flow = if (shouldFetch(data)) {
        emit(Resource.Loading(data))
        val old = query().map{ Resource.Success(it) }.first()
        emit(old)
        try {
            val token = tokenFlow.first()
            withContext(Dispatchers.IO){
                if (token != NO_TOKEN){
                    saveFetchResult(fetch(token))
                }
            }
            query().map {
                Resource.Success(it)
            }
//            } else {
//                throw ClientRequestException()
//            }

        } catch (crt: ClientRequestException) {
            val message = crt.response.readText(Charset.defaultCharset())
            val status = crt.response.status
            query().map { Resource.Error(message, it) }
        }

    } else {
        query().map { Resource.Success(it) }
    }

    emitAll(flow)
}