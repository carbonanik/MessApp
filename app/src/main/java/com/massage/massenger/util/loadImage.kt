package com.massage.massenger.util

import android.net.Uri
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter


@Composable
fun loadImage(uri: Uri?, image: ImageVector): Painter? {

    val vp =  rememberVectorPainter(image = image)
    var painter by remember { mutableStateOf<Painter?>(vp) }

//    Glide.with(LocalContext.current)
//        .asBitmap()
//        .load(uri)
//        .into(object : CustomTarget<Bitmap>() {
//            override fun onLoadCleared(placeholder: Drawable?) { }
//            override fun onResourceReady(
//                resource: Bitmap,
//                transition: Transition<in Bitmap>?
//            ) {
//                painter = BitmapPainter(resource.asImageBitmap())
//            }
//        })

    return painter
}