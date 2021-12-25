package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

private enum class Visibility {
    VISIBLE,
    GONE
}


@Composable
fun JumpToBottom(
    enabled: Boolean,
    onClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    val transition = updateTransition(if (enabled) Visibility.VISIBLE else Visibility.GONE,
        label = "jump to bottom transition animation"
    )
    val bottomOffset by transition.animateDp {
        if (it == Visibility.GONE) (-32).dp
        else 32.dp
    }
    if (bottomOffset > 0.dp) {
        FloatingActionButton(
            onClick = onClicked,
            backgroundColor = MaterialTheme.colors.surface,
            contentColor = MaterialTheme.colors.primary,
            modifier = modifier
                .offset(x = 0.dp, y = -bottomOffset)
                .height(36.dp)
        ){
            Icon(
                imageVector = Icons.Filled.ArrowDownward,
                modifier = Modifier.height(18.dp),
                contentDescription = null
            )
        }
    }
}