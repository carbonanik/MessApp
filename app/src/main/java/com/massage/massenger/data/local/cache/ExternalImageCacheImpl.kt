package com.massage.massenger.data.local.cache

import android.graphics.Bitmap

class ExternalImageCacheImpl: ImageCache {

    override suspend fun addImage(url: String, bitmap: Bitmap) {

    }

    override suspend fun getImage(url: String): Bitmap? {
        TODO("Not yet implemented")
    }

    override suspend fun deleteImage(url: String) {
        TODO("Not yet implemented")
    }

    override suspend fun clearCache() {
        TODO("Not yet implemented")
    }
}