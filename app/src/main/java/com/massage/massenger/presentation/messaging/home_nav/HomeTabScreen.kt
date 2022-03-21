package com.massage.massenger.presentation.messaging.home_nav


//@OptIn(ExperimentalMaterialApi::class)
//@Composable
//fun HomeTabScreen(
//    viewModel: MessagingViewModel,
//    chatNavController: NavHostController
//) {
//
//    val homeNavController = rememberNavController()
//    Scaffold(
//        bottomBar = {
//            BottomNavigationBar(
//                items = tabItems,
//                navController = homeNavController,
//                onItemClick = { screen ->
//                    homeNavController.checkPopNavigate(screen())
//                }
//            )
//        }
//    ) {
//        HomeTabNavigation(
//            homeNavController = homeNavController,
//            chatNavController = chatNavController,
//            viewModel = viewModel,
//            paddingValues = it
//        )
//    }
//}


//@Composable
//fun HomeTabNavigation(
//    homeNavController: NavHostController,
//    chatNavController: NavHostController,
//    viewModel: MessagingViewModel,
//    paddingValues: PaddingValues
//) {
//    NavHost(
//        navController = homeNavController,
//        startDestination = ChatListScreen(),
//        modifier = Modifier.padding(paddingValues)
//    ) {
//        composable(ChatListScreen()) {
//            ChatListScreen(viewModel, chatNavController)
//        }
//        composable(ContactListScreen()) {
//            ContactScreen(viewModel, chatNavController)
//        }
//        composable(Screen.NewsFeedScreen()) {
//            VideosScreen()
//        }
//    }
//}
