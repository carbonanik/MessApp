package com.massage.massenger.common

sealed class NetworkState<T>(
    val isLoading: Boolean = false,
    val data: T? = null,
    val errorMessage: String? = null
) {
    class Loading<T>(data: T? = null) : NetworkState<T>(isLoading = true, data = data)
    class Success<T>(data: T) : NetworkState<T>(data = data)
    class Error<T>(message: String, data: T? = null, val authenticationNeeded: Boolean = false) :
        NetworkState<T>(data = data, errorMessage = message)
}
