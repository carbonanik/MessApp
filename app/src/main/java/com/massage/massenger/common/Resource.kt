package com.massage.massenger.common

sealed class Resource<T>(
    val isLoading: Boolean = false,
    val data: T? = null,
    val errorMessage: String? = null
) {
    class Loading<T>(data: T? = null) : Resource<T>(isLoading = true, data = data)
    class Success<T>(data: T) : Resource<T>(data = data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data = data, errorMessage = message)
}
