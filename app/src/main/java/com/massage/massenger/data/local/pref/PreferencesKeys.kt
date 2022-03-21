package com.massage.massenger.data.local.pref

import androidx.datastore.preferences.core.stringPreferencesKey

object PreferencesKeys{
    const val USER_DATA_PREF = "user_data"

    val TOKEN_KEY = stringPreferencesKey(name = "token")
    val USER_KEY = stringPreferencesKey(name = "user")

}