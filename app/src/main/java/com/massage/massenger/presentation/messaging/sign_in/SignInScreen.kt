package com.massage.massenger.presentation.messaging.sign_in

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.navigation.NavController
import com.massage.massenger.presentation.component.LoadingAnimation
import com.massage.massenger.presentation.component.MessageDialog
import com.massage.massenger.presentation.navigation.SignupDestination
import com.massage.massenger.presentation.navigation.TabNavigation
import com.massage.massenger.presentation.navigation.popNavigate
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SignInScreen(
    navController: NavController,
    viewModel: SignInViewModel
) {

    val focusManager = LocalFocusManager.current

    val modalBottomSheetState =
        rememberModalBottomSheetState(
            initialValue = ModalBottomSheetValue.Hidden,
            skipHalfExpanded = true
        )
    val scope = rememberCoroutineScope()
    val fm = LocalFocusManager.current
    LaunchedEffect(key1 = modalBottomSheetState.isVisible, block = {
        if (!modalBottomSheetState.isVisible) {
            fm.clearFocus()
        }
    })

    // when back button is clicked
    BackHandler(enabled = modalBottomSheetState.isVisible) {
        fm.clearFocus()
        scope.launch {
            modalBottomSheetState.hide()
        }
    }

    SignInForm(
        signInState = viewModel.signInDataState,
        onEvent = { viewModel.onEvent(it) },
        onForgetPasswordClick = { },
        onSignUpTextClick = { navController.popNavigate(SignupDestination()) },
        countries = viewModel.filteredCountries,
        filterCountryCode = {
            viewModel.filterCountryCode(it)
        },
        modalBottomSheetState = modalBottomSheetState,
        onBottomSheetEvent = {
            when (it) {
                BottomSheetEvent.SHOW -> {
                    scope.launch {
                        modalBottomSheetState.show()
                    }
                }
                BottomSheetEvent.HIDE -> {
                    scope.launch {
                        modalBottomSheetState.hide()
                    }
                }
            }
        }
    )

    viewModel.dialogMessage?.let {
        MessageDialog(dialogMessage = it) {
            viewModel.clearDialog()
        }
    }

    if (viewModel.signInDataState.isLoading) {
        focusManager.clearFocus()
        LoadingAnimation(modifier = Modifier.fillMaxSize())
    }

    if (viewModel.signInDataState.signInSuccess) {
        viewModel.startingStateLoggedIn()
        Toast.makeText(LocalContext.current, "Sign In Successful", Toast.LENGTH_SHORT).show()
        navController.navigate(TabNavigation())
        viewModel.clearDataState()
        viewModel.clearDialog()
    }
}