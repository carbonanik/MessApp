package com.massage.massenger.presentation.messaging

//import com.massage.massenger.presentation.messaging.Screen.ImageViewScreen.parsePhotoName
//import com.massage.massenger.presentation.messaging.Screen.ImageViewScreen.parsePhotoUrl
//import com.massage.massenger.presentation.messaging.Screen.SingleChatScreen.parseChat
//import com.massage.massenger.presentation.messaging.Screen.SingleChatScreen.parseUser


//@ExperimentalFoundationApi
//@ExperimentalMaterialApi
//@Composable
//fun AppNavigation(messagingViewModel: MessagingViewModel) {
//
//    val singleChatViewModel = hiltViewModel<SingleChatViewModel>()
//    val navController = rememberNavController()
//
//    NavHost(
//        navController = navController,
//        startDestination = Screen.StartScreen()
//    ) {
//
//        composable(Screen.StartScreen()) {
//            LaunchedEffect(key1 = Unit, block = {
//                if (messagingViewModel.isLoggedIn())
//                    navController.popNavigate(Screen.HomeTabScreen())
//                else navController.popNavigate(Screen.LoginScreen())
//            })
//
//            Column(
//                modifier = Modifier
//                    .fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Icon(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(200.dp),
//                    imageVector = Icons.Default.ThumbUp, contentDescription = null,
//                    tint = Color.Blue
//                )
//            }
//        }
//        composable(Screen.LoginScreen()) {
//            LoginScreen(navController, hiltViewModel())
//        }
//        composable(Screen.SignupScreen()) {
//            SignUpScreen(navController, hiltViewModel())
//        }
//
//        composable(route = Screen.HomeTabScreen()) {
//            HomeTabScreen(hiltViewModel(), navController)
//        }
//        composable(
//            route = Screen.SingleChatScreen(),
//            arguments = Screen.SingleChatScreen.args,
//            deepLinks = Screen.SingleChatScreen.deepLinks
//        ) { backStack ->
//
//            SingleChatScreen(
//                viewModel = singleChatViewModel,
//                navController = navController,
//                user = backStack.parseUser(),
//                chat = backStack.parseChat(),
//            )
//        }
//        composable(Screen.ImageGridScreen()) {
//            ImageGridScreen(
//                viewModel = singleChatViewModel,
//                navController = navController
//            )
//        }
//        composable(Screen.CreateGroupScreen()) {
//            CreateGroupScreen(
//                viewModel = hiltViewModel(),
//                navController = navController
//            )
//        }
//        composable(
//            route = Screen.ImageViewScreen(),
//            arguments = Screen.ImageViewScreen.args
//        ) { backStack ->
//
//            ImageViewScreen(
//                hiltViewModel(),
//                url = backStack.parsePhotoUrl(),
//                name = backStack.parsePhotoName()
//            )
//        }
//    }
//
//
//}