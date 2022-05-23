package com.massage.massenger.data.local.cache

import android.graphics.Bitmap

interface ImageCache {
    suspend fun addImage(bitmap: Bitmap): String?
    suspend fun getImage(cacheId: String): Bitmap?
    suspend fun deleteImage(cacheId: String)
    suspend fun clearCache()
}