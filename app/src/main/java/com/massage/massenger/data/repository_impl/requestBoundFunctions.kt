package com.massage.massenger.data.repository_impl

import com.massage.massenger.common.NetworkState
import io.ktor.client.features.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.nio.charset.Charset

/**
 * execute fetch and return the fetched data as kotlin flow
 */
fun <T> boundFetch(
    fetch: suspend () -> T
) = flow {
    // indication for loading until the fetch request process
    emit(NetworkState.Loading())
    emit(tryFetchRequest(fetch = fetch))
}

/**
 * execute fetch, save fetch data and return it as kotlin flow
 */
fun <T> boundFetchSave(
    fetch: suspend () -> T,
    save: suspend (T) -> Unit
) = flow<NetworkState<T>> {
    emit(NetworkState.Loading())

    emit(
        tryFetchRequest(
            fetch = fetch,
            useFetched = save
        )
    )
}

/**
 * return previous saved/cached data for better user experience
 * until the fetch request complete
 */
fun <T> boundCacheFetchSave(
    query: suspend () -> T?,
    fetch: suspend () -> T,
    saveFetched: suspend (T) -> Unit,
    shouldFetch: suspend (T?) -> Boolean = { true },
): Flow<NetworkState<T>> = flow {

    val queryData = query()
    emit(NetworkState.Loading(data = queryData))

    emit(
        if (shouldFetch(queryData)) tryFetchRequest(fetch = fetch, useFetched = saveFetched)
        else if (queryData != null) NetworkState.Success(queryData)
        else NetworkState.Error("Unknown Error")
    )
}

/**
 * Wrapper Function for fetching api with error handling
 */
suspend fun <T> tryFetchRequest(
    fetch: suspend () -> T,
    useFetched: suspend (T) -> Unit = {}
): NetworkState<T> {
    return try {

        // execute fetch block / call api
        val data = fetch()
        // use the raw data if not any error happen
        useFetched(data)
        // return the data as success
        NetworkState.Success(data)

    } catch (e: ResponseException) { // if any exception occurred during fetching data
        // if exception occurred because you are not authorised
        if (e.response.status == HttpStatusCode.Unauthorized) {
            // return the error message with error wrapper object
            NetworkState.Error(
                e.response.readText(Charset.defaultCharset()),
                authenticationNeeded = true
            )
        } else { // other exceptions
            NetworkState.Error(
                e.response.readText(Charset.defaultCharset())
            )
        }
    } catch (e: Exception) {
        NetworkState.Error(e.localizedMessage?:"Unknown Error")
    }
}