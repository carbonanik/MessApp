package com.massage.massenger.data.remote.api_service.group

import com.massage.massenger.data.remote.api_service.HttpRoutes
import com.massage.massenger.data.remote.api_service.group.dto.AddMemberToGroupRequest
import com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest
import com.massage.massenger.model.Group
import com.massage.massenger.model.User
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GroupApiServiceImpl(private val client: HttpClient) : GroupApiService {

    override suspend fun createGroup(createGroupRequest: CreateGroupRequest, token: String) =
        withContext(Dispatchers.IO) {
            client.post<Group> {
                url(HttpRoutes.Group.CREATE)
                contentType(ContentType.Application.Json)
                headers {
                    append(HttpHeaders.Authorization, token)
                }
                body = createGroupRequest
            }
        }

    override suspend fun addMemberToGroup(
        addMemberToGroupRequest: AddMemberToGroupRequest,
        token: String
    ): Group = withContext(Dispatchers.IO) {
        client.post<Group> {
            url(HttpRoutes.Group.ADD_MEMBER)
            contentType(ContentType.Application.Json)
            headers {
                append(HttpHeaders.Authorization, token)
            }
            body = addMemberToGroupRequest
        }
    }

    override suspend fun getAllGroupForUser(userId: String, token: String): List<Group> =
        withContext(Dispatchers.IO) {
            client.get {
                url(HttpRoutes.Group.ALL_FOR_USER + "/" + userId)
                headers {
                    append(HttpHeaders.Authorization, token)
                }
            }
        }
}