package com.massage.massenger.presentation.messaging.image_gallery

import android.net.Uri
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.local.content.ExternalStorageImageProvider
import com.massage.massenger.model.SharedStoragePhoto
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ImageGridViewModel @Inject constructor(
    private val externalStorageImageProvider: ExternalStorageImageProvider
) : ViewModel() {


}