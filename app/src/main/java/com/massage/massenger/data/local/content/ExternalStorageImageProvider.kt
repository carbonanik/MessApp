package com.massage.massenger.data.local.content

import android.content.ContentUris
import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import com.massage.massenger.model.SharedStoragePhoto
import com.massage.massenger.util.extensions.minSDK29OrUp
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import java.io.IOException
import javax.inject.Inject


class ExternalStorageImageProvider @Inject constructor(
    @ApplicationContext private val context: Context
) {

    fun getPhotos(): Flow<List<SharedStoragePhoto>> = flow {
        println("get photo from storage function called")
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

        context.contentResolver.query(
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
            emit(photos)
        }
    }


    suspend fun savePhotoToExternalStorage(displayName: String, bmp: Bitmap): Uri? {
        return withContext(Dispatchers.IO) {

            val imageCollection = minSDK29OrUp {
                MediaStore.Images.Media.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)
            } ?: MediaStore.Images.Media.EXTERNAL_CONTENT_URI

            val contentValues = ContentValues().apply {
                put(MediaStore.Images.Media.DISPLAY_NAME, "$displayName.jpg")
                put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
                put(MediaStore.Images.Media.WIDTH, bmp.width)
                put(MediaStore.Images.Media.HEIGHT, bmp.height)
            }
            try {
                var savedImageUri: Uri? = null
                context.contentResolver.insert(imageCollection, contentValues)?.also { uri ->
                    savedImageUri = uri
                    context.contentResolver.openOutputStream(uri).use { outputStream ->
                        if (!bmp.compress(Bitmap.CompressFormat.JPEG, 95, outputStream)) {
                            throw IOException("Couldn't Save Bitmap")
                        }
                    }
                } ?: throw IOException("Couldn't Create Media Store Entry")
                savedImageUri
            } catch (e: IOException) {
                e.printStackTrace()
                null
            }
        }
    }

    suspend fun contentExists(uriStr: String): Boolean =
        withContext(Dispatchers.IO) {

            val uri: Uri = Uri.parse(uriStr) ?: return@withContext false
            val cursor = context.contentResolver
                .query(uri, null, null, null, null)
                ?: return@withContext false

            val doesExist = cursor.moveToFirst()
            cursor.close()
            return@withContext doesExist
        }
}
