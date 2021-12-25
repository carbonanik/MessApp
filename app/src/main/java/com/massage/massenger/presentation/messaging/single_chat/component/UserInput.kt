package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Mood
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun UserInputPreview(){
    UserInput(onMessageSent = {}, {})
}

@Composable
fun UserInput(
    onMessageSent: (String) -> Unit,
    onImageSend: () -> Unit,
    modifier: Modifier =  Modifier,
    resetScroll: () -> Unit = {}
) {
//    var currentInputSelector by rememberSaveable{ mutableStateOf(InputSelector.NONE) }
//    val dismissKeyboard = {currentInputSelector = InputSelector.NONE }

    // Intercept back navigation if there's a InputSelector visible
//    if (currentInputSelector != InputSelector.NONE) {
//        BackPressHandler(onBackPressed = dismissKeyboard)
//    }

    var textState by remember{ mutableStateOf(TextFieldValue()) }

    // Used to decide if the keyboard should be shown
    var textFieldFocusState by remember { mutableStateOf(false) }

//    Surface {
        Column(modifier) {
            Divider()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                UserInputText(
                    textFieldValue = textState,
                    onTextChanged = { textState = it },
                    onTextFieldFocused = { focused ->
                        if (focused) {
                            resetScroll()
                        }
                        textFieldFocusState = focused
                    },
                    focusState = textFieldFocusState,
                    sendMessageEnabled = textState.text.isNotBlank(),
                    onMessageSent = {
                        onMessageSent(textState.text)
                        textState = TextFieldValue()
                        resetScroll()
//                    dismissKeyboard()
                    },
                    onImageSend = onImageSend
                )
            }
        }
//    }
}

val KeyboardShownKey = SemanticsPropertyKey<Boolean>("KeyboardShownKey")
//var SemanticsPropertyReceiver.keyboardShownProperty by KeyboardShownKey

@Composable
private fun UserInputText(
    keyboardType: KeyboardType = KeyboardType.Text,
    onTextChanged: (TextFieldValue) -> Unit,
    textFieldValue: TextFieldValue,
//    keyboardShown: Boolean,
    onTextFieldFocused: (Boolean) -> Unit,
    focusState: Boolean,
    sendMessageEnabled: Boolean,
    onMessageSent: () -> Unit,
    onImageSend: () -> Unit
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
//            .semantics {
//                keyboardShownProperty = keyboardShown
//            },
        horizontalArrangement = Arrangement.End
    ){

        InputButton(
            onClick = {},
            icon = Icons.Outlined.Mood
        )


        Box(
            modifier = Modifier
                .height(48.dp)
                .weight(1f)
                .align(Alignment.Bottom)
        ) {
            var lastFocusState by remember { mutableStateOf(false) }
            BasicTextField(
                value = textFieldValue,
                onValueChange = { onTextChanged(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    //.padding(start = 16.dp)
                    .align(Alignment.CenterStart)
                    .onFocusChanged { state ->
                        if (lastFocusState != state.isFocused) {
                            onTextFieldFocused(state.isFocused)
                        }
                        lastFocusState = state.isFocused
                    },
                keyboardOptions = KeyboardOptions(
                    keyboardType = keyboardType,
                    imeAction = ImeAction.Send
                ),
                maxLines = 1,
                cursorBrush = SolidColor(LocalContentColor.current),
                textStyle = LocalTextStyle.current.copy(color = LocalContentColor.current)
            )


            val disableContentColor =
                MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled)
            if (textFieldValue.text.isEmpty() && !focusState) {
                //User Input Text Hint
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    text = "Message...!!!",
                    style = MaterialTheme.typography.body1.copy(color = disableContentColor)
                )
            }
        }
        InputButton(
            onClick = onImageSend,
            icon = Icons.Default.Image)
        InputButton(
            enabled = sendMessageEnabled,
            onClick = onMessageSent,
            icon = Icons.Default.Send
        )
    }
}


// Icon Input Button For User Input
@Composable
fun InputButton(
    enabled: Boolean = true,
    onClick: () -> Unit,
    icon: ImageVector,
    tint: Color = Color.Gray,
    contentDescription: String = ""
){
    IconButton(
        enabled = enabled,
        onClick = onClick
    ) {
        Icon(
            icon,
            tint = tint,
            modifier = Modifier
                .padding(12.dp)
                .size(20.dp),
            contentDescription = contentDescription
        )
    }
}
