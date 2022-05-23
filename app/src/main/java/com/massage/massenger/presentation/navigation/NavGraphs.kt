package com.massage.massenger.presentation.navigation

import com.massage.massenger.presentation.messaging.on_boarding.NavGraph
import com.massage.massenger.presentation.messaging.on_boarding.destinations.OnBoardingScreenDestination

object NavGraphs {

    val onBoarding = NavGraph(
        route = "on_boarding",
        startRoute = OnBoardingScreenDestination,
        destinations = listOf(
            OnBoardingScreenDestination
        )
    )
}