package com.massage.massenger.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState


val bottomBarRoutes = tabItems.map { it.route }

@Composable
fun shouldShowBottomBar(navController: NavHostController): Boolean=
    navController.currentBackStackEntryAsState().value?.destination?.route in bottomBarRoutes