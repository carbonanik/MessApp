package com.massage.massenger.domain.use_case

import com.massage.massenger.data.local.room.MessengerDatabase
import com.massage.massenger.data.repository.UserDataRepository
import javax.inject.Inject


class DataClearUseCase @Inject constructor(
    private val database: MessengerDatabase,
    private val userDataRepository: UserDataRepository
) {

    suspend operator fun invoke() {
        database.clearAllTables()
        userDataRepository.clearAll()
    }
}