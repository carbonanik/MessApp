package com.massage.massenger.presentation.messaging.on_boarding

import com.massage.massenger.R

sealed class OnBoardingPage(
    val img: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        R.drawable.ic_launcher_foreground,
        "Page One",
        "This is the first page of on boarding screen"
    )

    object Second : OnBoardingPage(
        R.drawable.ic_launcher_foreground,
        "Page Tow",
        "This is the second page of on boarding screen"
    )

    object Third : OnBoardingPage(
        R.drawable.ic_launcher_foreground,
        "Page Three",
        "This is the third page of on boarding screen"
    )
}