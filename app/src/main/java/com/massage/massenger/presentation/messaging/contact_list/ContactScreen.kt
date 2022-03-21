package com.massage.massenger.presentation.messaging.contact_list

import android.Manifest
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.navigation.NavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberPermissionState
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.chat_list.ProfileCircle
import com.massage.massenger.presentation.navigation.SingleChatScreen
import com.massage.massenger.presentation.ui.MessagingViewModel
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.util.isPermanentlyDenied
import com.massage.massenger.util.object_id.ObjectId


@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun ContactScreen(
    viewModel: MessagingViewModel,
    chatNavController: NavController
) {

    val permissionState = rememberPermissionState(
        permission = Manifest.permission.READ_CONTACTS
    )
    var noPermissionText by remember {
        mutableStateOf<String?>(null)
    }

    val lifecycleOwner = LocalLifecycleOwner.current

    DisposableEffect(key1 = lifecycleOwner, effect = {

        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_START) {
                permissionState.launchPermissionRequest()
                println("permissionState.launchPermissionRequest()")
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }

    })

    val connections by viewModel.connections.collectAsState(initial = emptyList())
    val isLoading by viewModel.isLoading.collectAsState()
    val errorMessage by viewModel.errorMessage.collectAsState()

    LaunchedEffect(key1 = lifecycleOwner) {

        when {
            permissionState.hasPermission -> {
                viewModel.loadContactScreenData()
                noPermissionText = null
            }
            permissionState.shouldShowRationale -> {
                noPermissionText = "Storage Permission Needed"
            }
            permissionState.isPermanentlyDenied() -> {
                noPermissionText =
                    "Camera Permission was permanently denied. You can enable it " +
                            "from the app setting"
            }
        }

    }

    ContactScreenContent(
        connections,
        isLoading,
        errorMessage,
        noPermissionText
    ) { user ->
        chatNavController.navigate(SingleChatScreen(user = user))
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ContactScreenContent(
    connections: List<User>,
    isLoading: Boolean,
    errorMessage: String?,
    noPermissionText: String?,
    onContactClick: (user: User) -> Unit
) {

    Column {

        AnimatedVisibility(visible = isLoading && errorMessage == null) {
            StatusBar(statusText = "Updating Contacts", loadingIndicator = true)
        }

        AnimatedVisibility(visible = errorMessage != null) {
            StatusBar(statusText = errorMessage ?: "", icon = Icons.Default.Error)
        }

        AnimatedVisibility(visible = noPermissionText != null) {
            AskPermission()
        }

        LazyColumn(content = {
            items(testConnections) { user -> // todo
                ContactView(Modifier.animateItemPlacement(),
                    connection = user, onContactClick = onContactClick)
            }
        })
    }

}

@Composable
fun ContactView(modifier: Modifier = Modifier, connection: User, onContactClick: (user: User) -> Unit) {
    Surface(modifier = modifier) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onContactClick(connection)
                    }
                    .padding(
                        horizontal = 15.dp,
                        vertical = 5.dp
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
//                Icon(
//                    modifier = Modifier.size(40.dp),
//                    imageVector = Icons.Default.Face,
//                    contentDescription = "Contact Image"
//                )
                ProfileCircle(
                    modifier = Modifier
                        .size(40.dp)
                        .align(Alignment.CenterVertically),
                    name = connection.name)
                Spacer(Modifier.width(15.dp))
                Column {
                    Text(text = connection.name, fontSize = 20.sp)
                    Text(
                        text = connection.phone, fontSize = 10.sp,
                        color = MaterialTheme.colors.primaryVariant
                    )
                }
            }
            Divider(
                color = MaterialTheme.colors.background,
                thickness = 2.dp
            )
        }
    }
}


@Composable
fun StatusBar(
    statusText: String,
    icon: ImageVector = Icons.Default.Info,
    loadingIndicator: Boolean = false
) {
    Surface(
        color = MaterialTheme.colors.background
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(20.dp)
                .animateContentSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (loadingIndicator) CircularProgressIndicator(
                Modifier.size(20.dp),
                strokeWidth = 2.dp
            )
            else Icon(icon, null)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = statusText, fontSize = 10.sp)
        }
    }
}


@Composable
fun AskPermission() {
    Row(
        Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Surface(
            Modifier
                .fillMaxWidth(.6f),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Allow Access!",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Button(colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.primaryVariant
                ),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Allow")
                }
            }
        }
    }
}


@Preview
@Composable
fun ContactScreenPrev() {
    MessengerTheme {
        ContactScreenContent(
            connections = testConnections,
            isLoading = false,
            errorMessage = null,
            noPermissionText = null,
            onContactClick = {}
        )
    }
}


@Preview
@Composable
fun PersonPreview() {
    MessengerTheme {
        Column {
            StatusBar(statusText = "Updating Contacts", loadingIndicator = true)
            AskPermission()
            ContactView(
                connection = User(
                    id = "01",
                    name = "Anik",
                    phone = "01766785027"
                ),
                onContactClick = {}
            )
            ContactView(
                connection = User(
                    id = "01",
                    name = "Anik",
                    phone = "01766785027"
                ),
                onContactClick = {}
            )
        }
    }
}


val testConnections = listOf(
    User(
        id = ObjectId().toString(),
        name = "Mia Maruf",
        phone = "8801708653739"
    ),
    User(
        id = ObjectId().toString(),
        name = "Bipu Atikur",
        phone = "8801509926113"
    ),
    User(
        id = ObjectId().toString(),
        name = "Amin Parves",
        phone = "8801877851774"
    ),
    User(
        id = ObjectId().toString(),
        name = "Huda Jakir",
        phone = "8801415582161"
    ),
    User(
        id = ObjectId().toString(),
        name = "Nur Jannatul",
        phone = "8801682262208"
    ),
    User(
        id = ObjectId().toString(),
        name = "Hassan Parvase",
        phone = "8801120145640"
    ),
    User(
        id = ObjectId().toString(),
        name = "Mohammad Mijanur",
        phone = "8801729212768"
    ),
    User(
        id = ObjectId().toString(),
        name = "Hassan Sayed",
        phone = "8801714157093"
    ),
    User(
        id = ObjectId().toString(),
        name = "Mijan Ujjol",
        phone = "8801372471236"
    ),
    User(
        id = ObjectId().toString(),
        name = "Nipa Habiba",
        phone = "8801466416095"
    ),
    User(
        id = ObjectId().toString(),
        name = "Bulbul Ashraful",
        phone = "8801111888103"
    ),
    User(
        id = ObjectId().toString(),
        name = "Sheikh Bristi",
        phone = "8801869342270"
    ),
    User(
        id = ObjectId().toString(),
        name = "Khatun Mariam",
        phone = "8801295870344"
    ),
    User(
        id = ObjectId().toString(),
        name = "Ruhul Hossen",
        phone = "8801314197651"
    ),
    User(
        id = ObjectId().toString(),
        name = "Sheikh Shamsun",
        phone = "8801886050838"
    ),
    User(
        id = ObjectId().toString(),
        name = "Tareq Mijanur",
        phone = "8801356846797"
    ),
    User(
        id = ObjectId().toString(),
        name = "Jakir Al-Amin",
        phone = "8801406392893"
    ),
    User(
        id = ObjectId().toString(),
        name = "Ishita Sumiya",
        phone = "8801637317281"
    ),
    User(
        id = ObjectId().toString(),
        name = "Kaji Joynal",
        phone = "8801279761370"
    ),
)