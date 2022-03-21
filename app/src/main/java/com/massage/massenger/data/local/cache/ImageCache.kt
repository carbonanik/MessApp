package com.massage.massenger.data.local.cache

import android.graphics.Bitmap

interface ImageCache {
    suspend fun addImage(url: String, bitmap: Bitmap)
    suspend fun getImage(url: String): Bitmap?
    suspend fun deleteImage(url: String)
    suspend fun clearCache()
}