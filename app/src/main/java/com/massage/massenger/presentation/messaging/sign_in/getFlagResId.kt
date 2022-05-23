package com.massage.massenger.presentation.messaging.sign_in

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext



@Composable
fun getFlagResId(iso2: String): Int {
    return LocalContext.current.resources.getIdentifier(
        "country_flag_${iso2}",
        "drawable",
        LocalContext.current.packageName
    )
}
