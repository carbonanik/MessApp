package com.massage.massenger.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MessageDialog(dialogMessage: DialogMessage, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(text = dialogMessage.title)
        },
        text = {
            Text(text = dialogMessage.text)
        },
        buttons = {
            Row(
                modifier = Modifier.padding(all = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onDismiss
                ) {
                    Text("Dismiss")
                }
            }
        }
    )
}

data class DialogMessage(
    val title: String,
    val text: String
)

fun fillUpError(): DialogMessage {
    return DialogMessage(
        "Data Incorrect",
        "Please fill up all the fields correctly"
    )
}

fun networkError(text: String): DialogMessage {
    return DialogMessage(
        "Error From Server",
        text
    )
}

fun signInSuccessful(): DialogMessage {
    return DialogMessage(
        "Success",
        "You Have Logged In"
    )
}

fun signUpSuccessful(): DialogMessage {
    return DialogMessage(
        "Success",
        "You Have Successfully Signed Up"
    )
}

