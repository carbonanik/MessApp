package com.massage.massenger.presentation.messaging.image_view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Download
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.graphics.drawable.toBitmap
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import com.massage.massenger.R
import com.massage.massenger.presentation.ui.theme.MessengerTheme


@OptIn(ExperimentalCoilApi::class)
@Composable
fun ImageViewScreen(viewModel: ImageViewViewModel, url: String?, name: String?) {

    val painter = rememberDiskCacheImagePainter(url)

    ImageViewContent(painter)
}

@Composable
fun ImageViewContent(painter: Painter) {


    Surface(modifier = Modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize()) {
            Row(Modifier.fillMaxWidth()) {
                TopAppBar(
                    navigationIcon = {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
                    },
                    title = {
                        Text("Image View")
                    },
                    actions = {
                        IconButton(onClick = {
                        }) {
                            Icon(imageVector = Icons.Default.Download, contentDescription = "")
                        }
                    }
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                ZoomableImage(
                    painter = painter,
                )
            }
//            val images =
//                listOf(
//                    R.drawable.iphone,
//                    R.drawable.rocket,
//                    R.drawable.seal,
//                    R.drawable.tesla_car,
//                    R.drawable.iphone,
//                    R.drawable.rocket,
//                    R.drawable.seal,
//                    R.drawable.tesla_car,
//                )

//            LazyRow(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .weight(.2f)
//            ) {
//                items(images) { image ->
//                    Image(
//                        modifier = Modifier.aspectRatio(1f),
//                        painter = rememberImagePainter(
//                            data = image,
//                            builder = {
//                                crossfade(true)
//                                placeholder(R.drawable.ic_launcher_foreground)
//                            }),
//                        contentDescription = "",
//                        contentScale = ContentScale.Crop,
//                    )
//                }
//            }
        }
    }
}

@Preview
@Composable
fun FullScreenImageViewPrev() {
    MessengerTheme {
        val urie = "content://media/external_primary/images/media/36092"
        val urin =
            "https://firebasestorage.googleapis.com/v0/b/mess-app-10b91.appspot.com/o/photos%2F50490c4e-be23-4bfd-8df9-184a635d577a.jpg?alt=media&token=fd525c8a-cfff-4b35-ae4a-24e4f345d3fd"
        val urif = "/storage/self/primary/Pictures/Messenger/received_1788489451344369.jpeg"

        val painter = rememberImagePainter("", builder = {
            placeholder(R.drawable.ic_baseline_image_24)
        })
        ImageViewContent(painter)
    }
}

@Composable
fun ZoomableImage(
    modifier: Modifier = Modifier,
    painter: Painter
) {
    var scale by remember { mutableStateOf(1f) }
    val rotationState by remember { mutableStateOf(1f) }
    if (scale < .5f) scale = 1f

    Box(
        modifier = modifier
            .clip(RectangleShape) // Clip the box content
            .fillMaxSize() // Give the size you want...
            .background(Color.Gray)
            .pointerInput(Unit) {
                detectTransformGestures { centroid, pan, zoom, rotation ->
                    scale *= zoom
//                    rotationState += rotation
                }
            }
    ) {
        Image(
            modifier = Modifier
                .align(Alignment.Center) // keep the image centralized into the Box
                .graphicsLayer(
                    // adding some zoom limits (min 50%, max 200%)
                    scaleX = maxOf(.5f, minOf(3f, scale)),
                    scaleY = maxOf(.5f, minOf(3f, scale)),
                    rotationZ = rotationState
                )
                .fillMaxWidth(),
            contentDescription = "",
            painter = painter,
        )
    }
}