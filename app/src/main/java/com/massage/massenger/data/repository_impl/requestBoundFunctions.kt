package com.massage.massenger.data.repository_impl

import com.massage.massenger.common.Resource
import io.ktor.client.features.*
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.nio.charset.Charset


fun <T> bound(
    fetch: suspend () -> T
) = flow {
    emit(Resource.Loading())
    emit(fetchRequest(fetchBlock = fetch))
}


fun <T> boundSave(
    fetch: suspend () -> T,
    save: suspend (T) -> Unit
) = flow<Resource<T>> {
    emit(Resource.Loading())

    emit(
        fetchRequest(
            fetchBlock = fetch,
            fetchedData = save
        )
    )
}

fun <T> boundCache(
    query: suspend () -> T?,
    fetch: suspend () -> T,
    saveFetched: suspend (T) -> Unit,
    shouldFetch: (T?) -> Boolean = { true },
): Flow<Resource<T>> = flow {

    val queryData = query()
    emit(Resource.Loading(data = queryData))

    emit(
        if (shouldFetch(queryData)) fetchRequest(fetchBlock = fetch, fetchedData = saveFetched)
        else if (queryData != null) Resource.Success(queryData)
        else Resource.Error("Unknown Error")
    )
}


suspend fun <T> fetchRequest(
    fetchBlock: suspend () -> T,
    fetchedData: suspend (T) -> Unit = {}
): Resource<T> {
    return try {

        val data = fetchBlock()
        fetchedData(data)
        Resource.Success(data)

    } catch (e: ResponseException) {
        Resource.Error(
            e.response.readText(Charset.defaultCharset())
        )
    }
}