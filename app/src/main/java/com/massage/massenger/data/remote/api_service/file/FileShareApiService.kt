package com.massage.massenger.data.remote.api_service.file

import io.ktor.client.statement.*

interface FileShareApiService {

    suspend fun uploadPhoto(): HttpResponse
}