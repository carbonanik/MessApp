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


suspend fun ContentResolver.loadPhotosFromExternalStorage(): List<SharedStoragePhoto> {
    return withContext(Dispatchers.IO) {
        val collection = minSDK29OrUp {
            MediaStore.Images.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
        } ?: MediaStore.Images.Media.EXTERNAL_CONTENT_URI

        val projection = arrayOf(
            MediaStore.Images.Media._ID,
            MediaStore.Images.Media.DISPLAY_NAME,
            MediaStore.Images.Media.WIDTH,
            MediaStore.Images.Media.HEIGHT,
        )

        val photos = mutableListOf<SharedStoragePhoto>()

        query(
            collection, projection, null, null,
            "${MediaStore.Images.Media.DATE_ADDED} DESC"
        )?.use { cursor ->
            val idColumn = cursor.getColumnIndexOrThrow(MediaStore.Images.Media._ID)
            val displayNameColumn = cursor
                .getColumnIndexOrThrow(MediaStore.Images.Media.DISPLAY_NAME)
            val heightColumn = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.HEIGHT)
            val widthColumn = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.WIDTH)
//                val createdDate = cursor.getColumnIndexOrThrow()

            while (cursor.moveToNext()) {
                val id = cursor.getLong(idColumn)
                val name = cursor.getString(displayNameColumn)
                val height = cursor.getInt(heightColumn)
                val width = cursor.getInt(widthColumn)
                val contentUri = ContentUris.withAppendedId(
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id
                )
                photos.add(SharedStoragePhoto(id, name, width, height, contentUri))
            }
            photos.toList()
        } ?: listOf()
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



