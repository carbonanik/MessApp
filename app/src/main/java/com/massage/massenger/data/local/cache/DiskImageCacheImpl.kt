package com.massage.massenger.data.local.cache

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.graphics.BitmapFactory
import com.jakewharton.disklrucache.DiskLruCache
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.util.*

@Suppress("BlockingMethodInNonBlockingContext", "DEPRECATION")
class DiskImageCacheImpl constructor(
    context: Context
) : ImageCache {

    private var versionCode = context.packageManager
        .getPackageInfo(context.packageName, 0).versionCode

    private val diskLruCache: DiskLruCache =
        DiskLruCache.open(
            context.cacheDir,
            versionCode, 1,
            1 * 1024 * 1024L
        )

    override suspend fun addImage(bitmap: Bitmap): String? =
        withContext(Dispatchers.IO) {

            val stream = ByteArrayOutputStream()
            bitmap.compress(CompressFormat.PNG, 100, stream)
            val id = UUID.randomUUID().toString()
            try {
                diskLruCache.edit(id).run {

                    val out = newOutputStream(0)
                    out.write(stream.toByteArray())
                    out.flush()

                    commit()
                }
                id
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun getImage(cacheId: String): Bitmap? = withContext(Dispatchers.IO) {
        var bmp: Bitmap? = null

        try {
            val snapshot: DiskLruCache.Snapshot =
                diskLruCache.get(cacheId) ?: return@withContext null
            val inputStream = snapshot.getInputStream(0) ?: return@withContext null

            bmp = BitmapFactory.decodeStream(inputStream)
            inputStream.close()

        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        bmp
    }

    override suspend fun deleteImage(cacheId: String) {
        try {
            diskLruCache.delete()
        } catch (e: java.lang.Exception) {

        }
    }

    override suspend fun clearCache() {
        TODO("Not yet implemented")
    }
}