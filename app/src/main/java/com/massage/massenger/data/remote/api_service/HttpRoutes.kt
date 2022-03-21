package com.massage.massenger.data.remote.api_service

sealed class HttpRoutes {
    private val LOCAL = "10.0.2.2:8080"
    private val REMOTE = "ktor-mess-app.herokuapp.com"

    private val SERVER = REMOTE

    val BASE_URL =
        if (SERVER == REMOTE) "https://$SERVER" else "http://$SERVER"

    object Auth: HttpRoutes() {
        val LOGIN = "$BASE_URL/auth/login"
        val SIGNUP = "$BASE_URL/auth/signup"
        val REFRESH = "$BASE_URL/auth/refresh"
    }

    object User: HttpRoutes() {
        val ME = "$BASE_URL/user/me"
        val GET_ALL = "$BASE_URL/get-all"
        val GET_BY_NAME = "$BASE_URL/user/get-by-name"
        val GET_BY_ID = "$BASE_URL/user/get-by-id"
        val GET_BY_PHONE = "$BASE_URL/user/get-by-phone"
        val DELETE = "$BASE_URL/user/delete"
    }

    object Group: HttpRoutes() {
        val CREATE = "$BASE_URL/group/create"
        val GET_BY_ID = "$BASE_URL/get-by-id"
        val ADD_MEMBER = "$BASE_URL/group/add-member"
        val REMOVE_MEMBER = "$BASE_URL/remove-member"
        val ALL_FOR_USER = "$BASE_URL/group/all-for-user"
    }

    object Post: HttpRoutes() {
        val CREATE = "$BASE_URL/post/create"
        val GET_BY_ID = "$BASE_URL/post/get-by-id"
        val GET_OF_USER = "$BASE_URL/post/get-of-user"
        val GET_ALL_PAGED = "$BASE_URL/get-all"
        val GET_ALL_UNTIL = "$BASE_URL/post/get-all-until"
        val GET_ALL_BETWEEN = "$BASE_URL/post/get-all-between"
        val DELETE = "$BASE_URL/post/delete"
    }

    object File: HttpRoutes() {
        val UPLOAD_PHOTO = "$BASE_URL/uploads/photo"
    }

    val SOCKET_HOST = if (SERVER == REMOTE) {
        "ktor-mess-app.herokuapp.coms"
    } else {
        "10.0.2.2"
    }
}