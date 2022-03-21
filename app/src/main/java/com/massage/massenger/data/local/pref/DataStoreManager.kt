package com.massage.massenger.data.local.pref

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.massage.massenger.model.User
import com.massage.massenger.util.extensions.fromJson
import com.massage.massenger.util.extensions.toJson
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(DataStoreManager.USER_DATA_PREFERENCES)

@Singleton
class DataStoreManager @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private val dataStore = context.dataStore

    companion object {
        const val USER_DATA_PREFERENCES = "user_data"

        private val TOKEN = stringPreferencesKey(name = "token")
        private val USER = stringPreferencesKey(name = "user")

    }

    val savedToken: Flow<String> = dataStore.data
        .catch { exception ->
            if (exception is IOException) emit(emptyPreferences())
            else throw exception
        }.map { preferences ->
            preferences[TOKEN] ?: NO_TOKEN
        }

    val savedUser: Flow<User?> = dataStore.data
        .catch { exception ->
            if (exception is IOException) emit(emptyPreferences())
            else throw exception
        }.map { preference ->
            preference[USER]?.fromJson()
        }

    suspend fun storeToken(token: String) {
        dataStore.edit { preferences ->
            preferences[TOKEN] = "Bearer $token"
        }
    }

    suspend fun storeUser(user: User) {
        dataStore.edit { preference ->
            preference[USER] = user.toJson()
        }
    }

    suspend fun getToken(): String {
        return savedToken.first()
    }

    suspend fun getUser(): User? {
        return savedUser.first()
    }

    // delete all data from preference data store
    suspend fun clear() {
        dataStore.edit { it.clear() }
    }
}

const val NO_TOKEN = "no-Token"