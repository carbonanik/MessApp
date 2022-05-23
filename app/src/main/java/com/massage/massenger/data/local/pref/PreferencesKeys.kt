package com.massage.massenger.data.local.pref

import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey

object PreferencesKeys {
    const val USER_DATA_PREF = "user_data"

    val TOKEN_KEY = stringPreferencesKey(name = "token")
    val USER_KEY = stringPreferencesKey(name = "user")
    val APP_STATE = intPreferencesKey("on_boarding")

    val CONTACT_FETCH_TIME_KEY = longPreferencesKey("contact_fetch_time")
}