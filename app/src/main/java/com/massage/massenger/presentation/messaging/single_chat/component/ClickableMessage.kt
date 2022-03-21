package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.massage.massenger.model.User

@Composable
fun ClickableMessage(
    message: String?,
    authorClicked: (User) -> Unit,
    textColor: Color
) {
    message ?: return
    val uriHandler = LocalUriHandler.current
    val styledMessage = messageFormatter(text = message)

    ClickableText(
        text = styledMessage,
        style = MaterialTheme.typography.body1.copy(color = textColor),
        modifier = Modifier.padding(8.dp),
        onClick = {
            styledMessage
                .getStringAnnotations(start = it, end = it)
                .firstOrNull()
                ?.let { annotation ->
                    when (annotation.tag) {
                        SymbolAnnotationType.LINK.name -> uriHandler.openUri(annotation.item)
                        SymbolAnnotationType.PERSON.name -> {
                        } //todo //authorClicked(annotation.item)
                        else -> Unit
                    }
                }
        }
    )
}