package com.massage.massenger.data.remote.api_service.file

import com.massage.massenger.data.remote.api_service.HttpRoutes
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File

class FileShareApiServiceImpl(
    private val client: HttpClient
) : FileShareApiService {

    override suspend fun uploadPhoto(): HttpResponse {
        return withContext(Dispatchers.IO) {
            client.submitFormWithBinaryData(
                url = HttpRoutes.File.UPLOAD_PHOTO,
                formData = formData {
                    append("description", "Ktor logo")
                    append("image", File("ktor_logo.png").readBytes(), Headers.build {
                        append(HttpHeaders.ContentType, "image/png")
                        append(HttpHeaders.ContentDisposition, "filename=ktor_logo.png")
                    })
                }
            ) {
                onUpload { bytesSentTotal, contentLength ->
                    println("Sent $bytesSentTotal bytes from $contentLength")
                }
            }
        }
    }
}