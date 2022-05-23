package com.massage.massenger.di

import android.app.Application
import androidx.room.Room
import com.massage.massenger.data.local.room.MessengerDatabase
import com.massage.massenger.data.local.room.dao.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): MessengerDatabase =
        Room.databaseBuilder(app, MessengerDatabase::class.java, "messenger_database")
//            .addCallback(DB_CALLBACK)
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
    fun provideConnectionDao(database: MessengerDatabase): UserDao {
        return database.userDao()
    }

    @Provides
    fun provideGroupDao(database: MessengerDatabase): GroupDao {
        return database.groupDao()
    }

    @Provides
    fun providePostDao(database: MessengerDatabase): PostDao {
        return database.postDao()
    }
}