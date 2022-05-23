package com.massage.massenger.presentation.messaging.create_group

import com.massage.massenger.common.NetworkState

data class DataState<T>(
    val isLoading: Boolean = false,
    val data: T? = null,
    val error: String? = null
)

fun <T> NetworkState<T>.toDataState() =
    when (this) {
        is NetworkState.Error ->
            DataState(data = data, error = errorMessage)
        is NetworkState.Loading ->
            DataState(isLoading = true, data = data)
        is NetworkState.Success ->
            DataState(data = data)
    }