package com.massage.massenger.di

import android.app.Application
import androidx.room.Room
import com.massage.massenger.data.local.room.ChatDao
import com.massage.massenger.data.local.room.ConnectionDao
import com.massage.massenger.data.local.room.MessageDao
import com.massage.massenger.data.local.room.MessengerDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): MessengerDatabase =
            Room.databaseBuilder(app, MessengerDatabase::class.java, "messenger_database")
                    .build()

    @Provides
    fun provideMessageDao(database: MessengerDatabase): MessageDao {
        return database.messageDao()
    }

    @Provides
    fun provideChatDao(database: MessengerDatabase): ChatDao {
        return database.chatDao()
    }

    @Provides
    fun provideConnectionDao(database: MessengerDatabase): ConnectionDao {
        return database.connectionDao()
    }
}