package com.massage.massenger.data.local.cache

import android.graphics.Bitmap

class FuseImageCacheImpl: ImageCache {

    override suspend fun addImage(bitmap: Bitmap): String? {
        return null
    }

    override suspend fun getImage(cacheId: String): Bitmap? {
        TODO("Not yet implemented")
    }

    override suspend fun deleteImage(cacheId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun clearCache() {
        TODO("Not yet implemented")
    }
}