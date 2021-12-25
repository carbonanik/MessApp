package com.massage.massenger.presentation.messaging.contact_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.HourglassEmpty
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.massage.massenger.common.Resource
import com.massage.massenger.model.User
import com.massage.massenger.presentation.ui.MessagingActivityViewModel
import com.massage.massenger.presentation.messaging.Screen

@Composable
fun ContactScreen(viewModel: MessagingActivityViewModel, chatNavController: NavController) {
    val connections by viewModel.connections.collectAsState(initial = Resource.Loading())

    connections.errorMessage?.let {
        Surface(color = Color.Red, modifier = Modifier.fillMaxWidth()) {
            Row {
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    imageVector = Icons.Default.Error,
                    contentDescription = "Error"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = it)
            }
        }
    }

    if (connections is Resource.Loading<*> && connections.data == null) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Image(
                imageVector = Icons.Default.HourglassEmpty,
                contentDescription = "Loading"
            )
        }
    }

    LazyColumn(content = {

        connections.data?.forEach { connection ->
            item {
                ContactView(connection = connection, chatNavController = chatNavController)
            }
        }
    })
}

@Preview
@Composable
fun PersonPreview() {
    ContactView(
        connection = User(
            id = "01",
            name = "Anik",
            phone = "01766785027"
        ),
        rememberNavController()
    )
}

@Composable
fun ContactView(connection: User, chatNavController: NavController) {
    Surface(color = Color.White) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .clickable {
                    chatNavController.navigate(
                        Screen.SingleChatScreen
                            .routeWithArg(userId = connection.id)
                    )
                    println("navigate=Screen.SingleChatScreen")
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(Modifier.width(20.dp))
            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Default.Face,
                contentDescription = "Contact Image"
            )
            Spacer(Modifier.width(20.dp))
            Column {
                Text(text = connection.name, fontSize = 20.sp)
                Text(text = connection.phone, fontSize = 10.sp)
            }
        }
    }
}