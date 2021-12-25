package com.massage.massenger.presentation.auth

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.google.accompanist.insets.rememberInsetsPaddingValues

@Composable
fun WindowInsect() {

    val scrollState = rememberLazyListState()

    Column {

        LazyColumn(
//                        reverseLayout = true,
            state = scrollState,
            contentPadding = rememberInsetsPaddingValues(
                insets = LocalWindowInsets.current.statusBars
            ),
            modifier = Modifier
                .testTag("ConversationTestTag")
                .fillMaxSize()
                .padding(16.dp)
        ) {
            item {

                Spacer(modifier = Modifier.height(50.dp))
            }
            item {
                Text(
                    text = "Login",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h3,
                )
            }

            item {
                Spacer(modifier = Modifier.height(50.dp))
            }

            item {
                OutlinedTextField(value = "", onValueChange = {})
            }

            item {
                OutlinedTextField(value = "", onValueChange = {})
            }

            item {
                Spacer(modifier = Modifier.height(16.dp))
            }

            item {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(size = 22.5.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp),
                ) {
                    Text(text = "Submit")
                }
            }
            item {
                Spacer(modifier = Modifier.height(40.dp))
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    Text("Don't Have Account?", fontSize = 8.sp)
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(
                        modifier = Modifier
                            .height(30.dp)
                            .width(73.dp),
                        onClick = {
                        }) {
                        Text("Sign Up?", fontSize = 8.sp)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(1.dp).navigationBarsWithImePadding())
    }
}
