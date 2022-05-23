package com.massage.massenger.data.repository

import com.massage.massenger.data.local.pref.AppStartingState
import kotlinx.coroutines.flow.Flow

interface AppStartingStateDataRepository {
    suspend fun saveAppState(appState: AppStartingState)

    fun getAppState(): Flow<AppStartingState>
}