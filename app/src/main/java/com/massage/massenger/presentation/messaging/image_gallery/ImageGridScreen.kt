package com.massage.massenger.presentation.messaging.image_gallery

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel

@Preview
@Composable
fun PreviewImageGrid() {

}

@ExperimentalFoundationApi
@Composable
fun ImageGridScreen(
    viewModel: SingleChatViewModel,
    navController: NavHostController,
) {
    val photos = viewModel.photos

    Column {
        LazyVerticalGrid(cells = GridCells.Fixed(4)) {


            items(items = photos) { photo ->
                val painter =
                    rememberImagePainter(data = photo.contentUri,
                        builder = {
                            crossfade(true)
                        })

                Image(
                    painter = painter,
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(1 / 3f)
                        .aspectRatio(1.0f)
                        .clickable {
                            viewModel.submitPhotoUriToUpload(photo.contentUri)
                            navController.navigateUp()
                        }
                        .padding(4.dp),
                    contentScale = ContentScale.Crop,
                )
            }
        }
    }
}
