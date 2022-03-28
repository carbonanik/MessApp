package com.massage.massenger.data.local.cache

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.graphics.BitmapFactory
import com.jakewharton.disklrucache.DiskLruCache
import com.massage.massenger.util.extensions.md5
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream

@Suppress("BlockingMethodInNonBlockingContext", "DEPRECATION")
class DiskImageCacheImpl constructor(
    context: Context
): ImageCache {

    private var versionCode = context.packageManager
        .getPackageInfo(context.packageName, 0).versionCode

    private val diskLruCache: DiskLruCache =
        DiskLruCache.open(
            context.cacheDir,
            versionCode, 1,
            1 * 1024 * 1024L
        )

    override suspend fun addImage(url: String, bitmap: Bitmap) = withContext(Dispatchers.IO){

        val stream = ByteArrayOutputStream()
        bitmap.compress(CompressFormat.PNG, 100, stream)
        try {
            diskLruCache.edit(url.md5()).run {

                val out = newOutputStream(0)
                out.write(stream.toByteArray())
                out.flush()

                commit()
            }
        } catch (e: Exception){
            e.printStackTrace()
        }
    }

    override suspend fun getImage(url: String): Bitmap? = withContext(Dispatchers.IO){
        var bmp: Bitmap? = null

        try {
            val snapshot: DiskLruCache.Snapshot = diskLruCache.get(url.md5()) ?: return@withContext null
            val inputStream = snapshot.getInputStream(0) ?: return@withContext null

            bmp = BitmapFactory.decodeStream(inputStream)
            inputStream.close()

        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return@withContext bmp
    }

    override suspend fun deleteImage(url: String) {
        TODO("Not yet implemented")
    }

    override suspend fun clearCache() {
        TODO("Not yet implemented")
    }
}