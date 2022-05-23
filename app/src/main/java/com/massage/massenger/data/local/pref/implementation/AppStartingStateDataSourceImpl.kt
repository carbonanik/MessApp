package com.massage.massenger.data.local.pref.implementation

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import com.massage.massenger.data.local.pref.AppStartingState
import com.massage.massenger.data.local.pref.AppStartingStateDataSource
import com.massage.massenger.data.local.pref.PreferencesKeys
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

class AppStartingStateDataSourceImpl(
    private val dataStore: DataStore<Preferences>
) : AppStartingStateDataSource {

    override suspend fun saveAppState(state: AppStartingState) {
        dataStore.edit { it[PreferencesKeys.APP_STATE] = state.ordinal }
    }

    override fun getAppState(): Flow<AppStartingState> {
        return dataStore.data.catch { exc ->
            if (exc is IOException) emit(emptyPreferences())
            else throw exc
        }.map { pref ->
            AppStartingState.values()[pref[PreferencesKeys.APP_STATE] ?: 0]
        }
    }
}