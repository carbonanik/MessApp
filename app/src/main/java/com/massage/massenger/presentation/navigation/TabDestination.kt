package com.massage.massenger.presentation.navigation

import androidx.compose.ui.graphics.vector.ImageVector

open class TabDestination(
    val id: String,
    val title: String,
    val icon: ImageVector
) : Destination(route = id)