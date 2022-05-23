package com.massage.massenger.presentation.messaging.sign_in

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.common.NetworkState
import com.massage.massenger.data.local.assets.CountryCodeRepository
import com.massage.massenger.data.local.pref.AppStartingState
import com.massage.massenger.data.repository.AppStartingStateDataRepository
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.model.Country
import com.massage.massenger.presentation.component.DialogMessage
import com.massage.massenger.presentation.component.fillUpError
import com.massage.massenger.presentation.component.networkError
import com.massage.massenger.presentation.component.signInSuccessful
import com.massage.massenger.presentation.customComposeView.validCountryET
import com.massage.massenger.presentation.customComposeView.validNormalPasswordET
import com.massage.massenger.presentation.customComposeView.validPhoneET
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SignInViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val countriesRepository: CountryCodeRepository,
    private val appStartingStateDataRepository: AppStartingStateDataRepository
) : ViewModel() {

    var signInDataState by mutableStateOf(SignInDataState())
        private set

    var dialogMessage by mutableStateOf<DialogMessage?>(null)
        private set

    val countries = mutableStateListOf<Country>()
    val filteredCountries = mutableStateListOf<Country>()

    init {
        viewModelScope.launch {
            countries.addAll(countriesRepository.getCountries())
            filteredCountries.addAll(countries)
        }
    }

    fun onEvent(event: SignInFormEvent) {
        when (event) {

            is SignInFormEvent.PhoneChanged -> {
                signInDataState = signInDataState.copy(
                    phone = event.phone,
                    phoneError = event.phone.validPhoneET(),
                    countryError = signInDataState.country.validCountryET()
                )
            }

            is SignInFormEvent.PasswordChanged -> {
                signInDataState = signInDataState.copy(
                    password = event.password,
                    passwordError = event.password.validNormalPasswordET()
                )
            }

            SignInFormEvent.SignInClick -> {
                when (val data = signInDataState.validateSignInData()) {
                    null -> dialogMessage = fillUpError()
                    else -> signIn(data)
                }
            }
            is SignInFormEvent.CountrySelected -> {
                signInDataState = signInDataState.copy(
                    country = event.country,
                    countryError = null
                )
            }
        }
    }

    private fun signIn(signInData: SignInData) {
        viewModelScope.launch {
            authRepository.login(signInData.phone, signInData.password).collect {

                when (it) {
                    is NetworkState.Loading -> {
                        signInDataState = signInDataState.copy(isLoading = true)
                    }

                    is NetworkState.Success -> {
                        signInDataState = signInDataState
                            .copy(isLoading = false, signInSuccess = true)
                        dialogMessage = signInSuccessful()
                    }

                    is NetworkState.Error -> {
                        signInDataState = signInDataState.copy(isLoading = false)
                        dialogMessage = networkError(it.errorMessage ?: "Unexpected Error")
                    }
                }
            }
        }
    }

    fun clearDialog() {
        dialogMessage = null
    }

    fun clearDataState() {
        signInDataState = SignInDataState()
    }

    fun filterCountryCode(query: String) {
        filteredCountries.clear()

        val trimmedQuery = query.trim()

        val newFiltered = if (trimmedQuery.isNotEmpty()) {
            countries.filter {
                it.name.lowercase().contains(trimmedQuery) ||
                        it.code.toString().contains(trimmedQuery) ||
                        it.iso2.contains(trimmedQuery)
            }
        } else countries

        filteredCountries.addAll(newFiltered)
    }

    fun startingStateLoggedIn() {
        viewModelScope.launch {
            appStartingStateDataRepository.saveAppState(AppStartingState.LOGGED_IN)
        }
    }
}