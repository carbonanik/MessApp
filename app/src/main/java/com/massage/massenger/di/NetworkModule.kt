package com.massage.massenger.di

import com.massage.massenger.data.remote.api_service.auth.AuthApiService
import com.massage.massenger.data.remote.api_service.auth.AuthApiServiceImpl
import com.massage.massenger.data.remote.api_service.file.FileShareApiService
import com.massage.massenger.data.remote.api_service.file.FileShareApiServiceImpl
import com.massage.massenger.data.remote.api_service.group.GroupApiService
import com.massage.massenger.data.remote.api_service.group.GroupApiServiceImpl
import com.massage.massenger.data.remote.api_service.post.PostApiService
import com.massage.massenger.data.remote.api_service.post.PostApiServiceImpl
import com.massage.massenger.data.remote.api_service.user.UserApiService
import com.massage.massenger.data.remote.api_service.user.UserApiServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideHttpClient() = HttpClient(Android) {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
        install(Logging)
    }

//    @Provides
//    @Singleton
//    @Named("socket")
//    fun provideSocketHttpClient(userDataSource: UserDataSource): HttpClient? {
//        val r = CoroutineScope(Dispatchers.IO).async{
//            val token = userDataSource.getTokenFirst()
//            return@async if (token == NO_TOKEN){
//                null
//            } else {
//                HttpClient(CIO) {
//                    defaultRequest { header(HttpHeaders.Authorization, token) }
//                    install(WebSockets)
//                }
//            }
//        }
//        r.await()
//    }

    @Provides
    @Singleton
    fun provideAuthApiService(client: HttpClient): AuthApiService {
        return AuthApiServiceImpl(client)
    }

    @Provides
    @Singleton
    fun provideUserApiService(client: HttpClient): UserApiService {
        return UserApiServiceImpl(client)
    }

    @Provides
    @Singleton
    fun provideGroupApiService(client: HttpClient): GroupApiService {
        return GroupApiServiceImpl(client)
    }

    @Provides
    @Singleton
    fun providePostApiService(client: HttpClient): PostApiService {
        return PostApiServiceImpl(client)
    }

    @Provides
    @Singleton
    fun provideFileShareApiService(client: HttpClient): FileShareApiService {
        return FileShareApiServiceImpl(client)
    }

}