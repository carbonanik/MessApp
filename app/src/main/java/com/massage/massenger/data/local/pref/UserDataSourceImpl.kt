package com.massage.massenger.data.local.pref

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import com.massage.massenger.model.User
import com.massage.massenger.util.extensions.fromJson
import com.massage.massenger.util.extensions.toJson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.io.IOException


class UserDataSourceImpl (
    private val dataStore: DataStore<Preferences>
) : UserDataSource {

    override suspend fun saveToken(token: String) {
        dataStore.edit { it[PreferencesKeys.TOKEN_KEY] = "Bearer $token" }
    }

    override fun getToken(): Flow<String> {
        return dataStore.data.catch { exc ->
            if (exc is IOException) emit(emptyPreferences())
            else throw exc
        }.map { pref ->
            pref[PreferencesKeys.TOKEN_KEY] ?: NO_TOKEN
        }
    }

    override suspend fun getTokenFirst(): String {
        return getToken().first()
    }

    override suspend fun saveUser(user: User) {
        dataStore.edit { it[PreferencesKeys.USER_KEY] = user.toJson() }
    }

    override fun getUser(): Flow<User?> {
        return dataStore.data.catch { exc ->
            if (exc is IOException) emit(emptyPreferences())
            else throw exc
        }.map { pref ->
            pref[PreferencesKeys.USER_KEY]?.fromJson()
        }
    }

    override suspend fun getUserFirst(): User? {
        return getUser().first()
    }

    override suspend fun clearData() {
        dataStore.edit { it.clear() }
    }

    companion object {
        const val NO_TOKEN = "no"
    }
}