package com.massage.massenger.data.local.cache

import android.graphics.Bitmap
import android.net.Uri

class CachedImageManager {
    val journalMap = linkedMapOf<String, ImageEntity>()

    fun open(){
        //open journal file from storage if exists
        //create journal if not exists
    }

    fun getImage(url: String): Bitmap? {
        val entity = journalMap[url]
        // get bitmap from entity.uri
        // if not exists download
        // save to external
        // add to journal
        return null
    }
}

class ImageEntity(
    val uri: Uri,
    val readable: Boolean
)

fun downloadImage(): Bitmap? {
    //save to external storage
    //add to journal
    return null
}