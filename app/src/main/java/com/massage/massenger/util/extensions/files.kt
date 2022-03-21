package com.massage.massenger.util.extensions

import android.content.ContentResolver
import android.content.ContentUris
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import android.provider.OpenableColumns
import com.massage.massenger.model.SharedStoragePhoto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.FileNotFoundException

fun Uri.length(contentResolver: ContentResolver): Long {

    val assetFileDescriptor = try {
        contentResolver.openAssetFileDescriptor(this, "r")
    } catch (e: FileNotFoundException) {
        null
    }
    // uses ParcelFileDescriptor#getStatSize underneath if failed
    val length = assetFileDescriptor?.use { it.length } ?: -1L
    if (length != -1L) {
        return length
    }

    // if "content://" uri scheme, try contentResolver table
    if (scheme.equals(ContentResolver.SCHEME_CONTENT)) {
        return contentResolver.query(this, arrayOf(OpenableColumns.SIZE), null, null, null)
            ?.use { cursor ->
                // maybe shouldn't trust ContentResolver for size: https://stackoverflow.com/questions/48302972/content-resolver-returns-wrong-size
                val sizeIndex = cursor.getColumnIndex(OpenableColumns.SIZE)
                if (sizeIndex == -1) {
                    return@use -1L
                }
                cursor.moveToFirst()
                return try {
                    cursor.getLong(sizeIndex)
                } catch (_: Throwable) {
                    -1L
                }
            } ?: -1L
    } else {
        return -1L
    }
}


suspend fun ContentResolver.loadFromDisk(uri: Uri): Bitmap? {
    return withContext(Dispatchers.IO) {
//        return@withContext if (Build.VERSION.SDK_INT < 28) {
//            val bitmap = createBitmap(100, 100, Bitmap.Config.ARGB_8888)
        val bitmap = MediaStore.Images.Media.getBitmap(this@loadFromDisk, uri)
        bitmap
//        } else {
//            val source = ImageDecoder.createSource(contentResolver, uri)
//            val bitmap = ImageDecoder.decodeBitmap(source)
//            bitmap
//        }
    }
}



