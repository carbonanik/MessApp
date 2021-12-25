package com.massage.massenger.data.remote.firebase

import android.net.Uri
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import java.io.File
import java.util.*

object FirebaseStorage {
    private val storage = Firebase.storage
    private val ref = storage.reference
    private val photosRef = storage.getReference("photos")

    fun uploadPhoto(
        uri: Uri,
        extension: String,
        onProgress: (progress: Float) -> Unit = {},
        onSuccess: (uri: Uri?) -> Unit
    ) {

        val fileRef = photosRef.child(
            UUID.randomUUID().toString() + "." + extension
        )

        fileRef.putFile(uri).addOnSuccessListener {
            fileRef.downloadUrl.addOnSuccessListener { downloadUri ->
                onSuccess(downloadUri)
            }
        }.addOnFailureListener {
        }.addOnProgressListener {
            val progress = (it.bytesTransferred.toFloat() / it.totalByteCount.toFloat()) * 100f
            onProgress(progress)
        }
    }

    suspend fun getImage(path: String, onSaved: (localFile:File) -> Unit){

        val imageRef = ref.child(path)

        val localFile = File.createTempFile("${UUID.randomUUID()}", "jpg")

        imageRef.getFile(localFile).addOnSuccessListener {
            onSaved(localFile)
             // Handle any errors
        }
    }

    suspend fun getDownloadUrl(link: String, onSuccess: (uri: Uri?) -> Unit) {
        photosRef.child(link).downloadUrl.addOnSuccessListener {
            onSuccess(it)
            println(it)
        }.addOnFailureListener {

        }
    }
}

