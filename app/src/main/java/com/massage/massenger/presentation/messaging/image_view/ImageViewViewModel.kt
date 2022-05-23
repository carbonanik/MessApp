package com.massage.massenger.presentation.messaging.image_view

import android.graphics.Bitmap
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.compose.rememberImagePainter
import com.massage.massenger.data.local.cache.DiskImageCacheImpl
import com.massage.massenger.data.local.content.ExternalStorageImageProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ImageViewViewModel @Inject constructor(
    private val externalStorageImageProvider: ExternalStorageImageProvider
) : ViewModel() {

    fun savePhotoToExternalStorage(bitmap: Bitmap, name: String?) {
        viewModelScope.launch {
            val uri = externalStorageImageProvider.savePhotoToExternalStorage(
                name ?: System.currentTimeMillis().toString(),
                bitmap
            ).toString()
        }
    }

//    fun saveImageToDiskCash(url: String, bitmap: Bitmap){
//        viewModelScope.launch {
//            imageCache.addToDisk(url, bitmap)
//        }
//    }
//
//    fun getImageFromImageCache(url: String){
//        viewModelScope.launch {
//            imageCache.getFromDisk(url)
//        }
//    }
}


@Composable
fun rememberDiskCacheImagePainter(url: String?): Painter {

    var image: Painter by remember {
        mutableStateOf(ColorPainter(Color.Gray))
    }

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    val imageCache = remember { DiskImageCacheImpl(context) }

    var diskCacheChecking by remember { mutableStateOf(true) }
    var cacheExist by remember { mutableStateOf(false) }

//    LaunchedEffect(key1 = url, block = {
//        scope.launch {
//            val bitmap = url?.let { imageCache.getImage(it) }
//
//            if (bitmap != null){
//                image =  BitmapPainter(bitmap.asImageBitmap())
//                cacheExist = true
//                diskCacheChecking = false
//                imageCache.addImage(url, bitmap)
//            }
//
//            diskCacheChecking = false
//        }
//    })

    if (!diskCacheChecking && !cacheExist){
        image = rememberImagePainter(url)
    }

    return image
}