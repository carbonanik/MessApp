package com.massage.massenger.domain.use_case

import com.massage.massenger.data.local.pref.NO_TOKEN
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.data.remote.api_service.auth.dto.getUser
import com.massage.massenger.data.repository.AuthApiRepository
import com.massage.massenger.data.repository.UserDataRepository
import javax.inject.Inject


class AuthenticateUseCase @Inject constructor(
    private val userData: UserDataRepository,
    private val authRepo: AuthApiRepository
) {

    operator fun invoke() =

        authBound(
            fetch = {
                val token = userData.getToken()
                authRepo.refreshAuth(token)
            },
            save = {
                saveFetchedAuthResult(it)
            }
        )

    operator fun invoke(
        phone: String,
        password: String
    ) =

        authBound(
            fetch = {
                authRepo.login(phone, password)
            },
            save = {
                saveFetchedAuthResult(it)
            }
        )

    operator fun invoke(
        name: String,
        phone: String,
        password: String
    ) =

        authBound(
            fetch = {
                authRepo.signUp(name, phone, password)
            },
            save = {
                saveFetchedAuthResult(it)
            }
        )

    private suspend fun saveFetchedAuthResult(response: AuthResponse?) {
        response?.let { auth ->
            userData.storeToken(auth.authToken)
            userData.storeUser(auth.getUser())
        }
    }

    suspend fun isLoggedIn(): Boolean {
        return userData.getToken() != NO_TOKEN
    }
}