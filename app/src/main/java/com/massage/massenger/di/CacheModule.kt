package com.massage.massenger.di

import android.content.Context
import com.massage.massenger.data.local.cache.DiskImageCacheImpl
import com.massage.massenger.data.local.cache.ImageCache
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object CacheModule {

    @Provides
    fun provideImageCache(
        @ApplicationContext context: Context
    ): ImageCache{
        return DiskImageCacheImpl(context)
    }
}