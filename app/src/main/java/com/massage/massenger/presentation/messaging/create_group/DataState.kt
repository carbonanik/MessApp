package com.massage.massenger.presentation.messaging.create_group

import com.massage.massenger.common.Resource

data class DataState<T>(
    val isLoading: Boolean = false,
    val data: T? = null,
    val error: String? = null
)

fun <T> Resource<T>.toDataState() =
    when (this) {
        is Resource.Error ->
            DataState(data = data, error = errorMessage)
        is Resource.Loading ->
            DataState(isLoading = true, data = data)
        is Resource.Success ->
            DataState(data = data)
    }