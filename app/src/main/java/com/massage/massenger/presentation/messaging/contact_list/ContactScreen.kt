package com.massage.massenger.presentation.messaging.contact_list

import android.Manifest
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.navigation.NavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberPermissionState
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.chat_list.NameBox
import com.massage.massenger.presentation.navigation.SignInDestination
import com.massage.massenger.presentation.navigation.SingleChatDestination
import com.massage.massenger.presentation.navigation.popNavigate
import com.massage.massenger.util.isPermanentlyDenied


@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun ContactScreen(
    viewModel: ContactScreenViewModel,
    navController: NavController
) {

    val permissionState = rememberPermissionState(
        permission = Manifest.permission.READ_CONTACTS
    )

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

    if (viewModel.navigateBackToLoginScreen) {
        navController.popNavigate(SignInDestination())
        viewModel.navigateBackToLoginScreen = false
    }




    LaunchedEffect(key1 = permissionState.hasPermission) {

        println("changed permission state")

        when {
            permissionState.hasPermission -> {
                viewModel.loadData()
                viewModel.updatePermissionText(ContactPermission.ACCEPTED)
            }
            permissionState.shouldShowRationale -> {
                viewModel.updatePermissionText(ContactPermission.NOT_ACCEPTED)
            }
            permissionState.isPermanentlyDenied() -> {
                viewModel.updatePermissionText(ContactPermission.PERMANENTLY_DENIED)
            }
        }
    }

    ContactScreenContent(
        viewModel.dataState,
        onContactClick = { user ->
            navController.navigate(SingleChatDestination(user = user))
        },
        onAllowPermissionClick = {
            permissionState.launchPermissionRequest()
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ContactScreenContent(
    dataState: ContactScreenDataState,
    onContactClick: (user: User) -> Unit,
    onAllowPermissionClick: () -> Unit
) {

    Column {

        AnimatedVisibility(visible = dataState.isLoading && dataState.errorMessage == null) {
            StatusBar(statusText = "Updating Contacts", loadingIndicator = true)
        }

        AnimatedVisibility(visible = dataState.errorMessage != null) {
            StatusBar(statusText = dataState.errorMessage ?: "", icon = Icons.Default.Error)
        }

        AnimatedVisibility(visible = dataState.contactPermission != ContactPermission.ACCEPTED) {
            AskPermission(dataState.contactPermission, onAllowClick = onAllowPermissionClick)
        }

        LazyColumn(content = {
            items(dataState.contacts) { user -> // todo
                ContactView(
                    Modifier.animateItemPlacement(
                        animationSpec = tween(durationMillis = 600)
                    ),
                    connection = user, onContactClick = onContactClick
                )
            }
        })
    }

}

@Composable
fun ContactView(
    modifier: Modifier = Modifier,
    connection: User,
    onContactClick: (user: User) -> Unit
) {
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

                NameBox(
                    modifier = Modifier
                        .size(40.dp)
                        .align(Alignment.CenterVertically),
                    name = connection.name
                )
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
            Text(
                text = statusText,
                fontSize = 10.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@Composable
fun AskPermission(contactPermission: ContactPermission, onAllowClick: () -> Unit) {
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
                    text = contactPermission.value ?: "",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp),
                    textAlign = TextAlign.Center
                )
                if (contactPermission == ContactPermission.NOT_ACCEPTED) {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = MaterialTheme.colors.primaryVariant
                        ),
                        onClick = onAllowClick
                    ) {
                        Text(text = "Allow")
                    }
                }
            }
        }
    }
}