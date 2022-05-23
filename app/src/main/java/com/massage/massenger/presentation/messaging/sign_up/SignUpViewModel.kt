package com.massage.massenger.presentation.messaging.sign_up

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
import com.massage.massenger.presentation.component.signUpSuccessful
import com.massage.massenger.presentation.customComposeView.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val countriesRepository: CountryCodeRepository,
    private val appStartingStateDataRepository: AppStartingStateDataRepository
) : ViewModel() {

    var signUpDataState by mutableStateOf(SignUpDataState())
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

    fun onEvent(event: SignUpFormEvent) {
        when (event) {

            is SignUpFormEvent.CountrySelected -> {
                signUpDataState = signUpDataState.copy(
                    country = event.country,
                    countryError = null
                )
            }
            is SignUpFormEvent.NameChanged -> {
                signUpDataState = signUpDataState.copy(
                    name = event.name,
                    nameError = event.name.validNameET()
                )
            }
            is SignUpFormEvent.PhoneChanged -> {
                signUpDataState = signUpDataState.copy(
                    phone = event.phone,
                    phoneError = event.phone.validPhoneET(),
                    countryError = signUpDataState.country.validCountryET()
                )
            }

            is SignUpFormEvent.PasswordChanged -> {
                signUpDataState = signUpDataState.copy(
                    password = event.password,
                    passwordError = event.password.validNormalPasswordET()
                )
            }

            is SignUpFormEvent.ConfirmPasswordChanged -> {
                signUpDataState = signUpDataState.copy(
                    confirmPassword = event.confirmPassword,
                    confirmPasswordError = event.confirmPassword.validConfirmPasswordET(
                        signUpDataState.password
                    )
                )
            }
            SignUpFormEvent.SignInClick -> {
                when (val data = signUpDataState.validateSignUpData()) {
                    null -> {
                        dialogMessage = fillUpError()
                    }
                    else -> signUp(data)
                }
            }
        }
    }

    private fun signUp(signUpData: SignUpData) {
        viewModelScope.launch {
            authRepository.signUp(signUpData).collect {

                when (it) {
                    is NetworkState.Loading -> {
                        signUpDataState = signUpDataState.copy(isLoading = true)
                    }

                    is NetworkState.Success -> {
                        signUpDataState = signUpDataState
                            .copy(isLoading = false, signUpSuccess = true)
                        dialogMessage = signUpSuccessful()
                    }

                    is NetworkState.Error -> {
                        signUpDataState = signUpDataState.copy(isLoading = false)
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
        signUpDataState = SignUpDataState()
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
