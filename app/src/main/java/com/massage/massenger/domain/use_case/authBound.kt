package com.massage.massenger.domain.use_case

import com.massage.massenger.common.Resource
import io.ktor.client.features.*
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.nio.charset.Charset


inline fun <T> authBound(
    crossinline fetch: suspend () -> T,
    crossinline save: suspend (T) -> Unit,
): Flow<Resource<T>> = flow {
    emit(Resource.Loading())

    val resource = try {
        val data: T = fetch()
        save(data)
        Resource.Success(data)
    } catch (crt: ClientRequestException) {
        val message = crt.response.readText(Charset.defaultCharset())
        Resource.Error(message)
    }

    emit(resource)
}