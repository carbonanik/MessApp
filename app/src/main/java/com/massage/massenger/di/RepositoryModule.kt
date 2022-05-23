package com.massage.massenger.di

import com.massage.massenger.data.local.pref.AppStartingStateDataSource
import com.massage.massenger.data.local.pref.UserDataSource
import com.massage.massenger.data.local.room.MessengerDatabase
import com.massage.massenger.data.remote.api_service.auth.AuthApiService
import com.massage.massenger.data.repository.AppStartingStateDataRepository
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.data.repository_impl.AppStartingStateDataRepositoryImpl
import com.massage.massenger.data.repository_impl.AuthRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideAuthRepository(
        authApiService: AuthApiService,
        userDataSource: UserDataSource,
        database: MessengerDatabase
    ): AuthRepository{
        return AuthRepositoryImpl(
            authApiService,
            userDataSource,
            database
        )
    }

    @Singleton
    @Provides
    fun provideAppStartingStateDataRepository(
        dataSource: AppStartingStateDataSource
    ): AppStartingStateDataRepository{
        return AppStartingStateDataRepositoryImpl(dataSource)
    }
}