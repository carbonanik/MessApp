package com.massage.massenger.presentation.messaging.create_group

import com.massage.massenger.common.Resource
import com.massage.massenger.model.User

data class GetConnectionState(
    val isLoading: Boolean = false,
    val connections: List<User> = emptyList(),
    val error: String? = null
)

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

fun Resource<List<User>>.getConnectionState() {
    when (this) {
        is Resource.Error -> {
            GetConnectionState(
                connections = data ?: emptyList(),
                error = errorMessage
            )
        }
        is Resource.Loading -> {
            GetConnectionState(
                isLoading = true,
                connections = data ?: emptyList()
            )
        }
        is Resource.Success -> {
            GetConnectionState(
                connections = data ?: emptyList()
            )
        }
    }
}