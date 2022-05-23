package com.massage.massenger.data.repository_impl

import com.massage.massenger.data.local.pref.AppStartingState
import com.massage.massenger.data.local.pref.AppStartingStateDataSource
import com.massage.massenger.data.repository.AppStartingStateDataRepository

class AppStartingStateDataRepositoryImpl (
    private val appStartingStateDataSource: AppStartingStateDataSource
): AppStartingStateDataRepository {

    override suspend fun saveAppState(appState: AppStartingState) =
        appStartingStateDataSource.saveAppState(appState)

    override fun getAppState() =
        appStartingStateDataSource.getAppState()
}