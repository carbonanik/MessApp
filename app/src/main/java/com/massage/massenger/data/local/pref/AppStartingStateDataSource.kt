package com.massage.massenger.data.local.pref

import kotlinx.coroutines.flow.Flow

// Data Source Interface
interface AppStartingStateDataSource {
    suspend fun saveAppState(state: AppStartingState)
    fun getAppState(): Flow<AppStartingState>

}

