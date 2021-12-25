package com.massage.massenger.presentation.auth.log_in

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest
import com.massage.massenger.common.Resource
import com.massage.massenger.presentation.auth.AuthViewModel
import com.massage.massenger.presentation.auth.PrefixTransformation
import com.massage.massenger.presentation.customComposeView.OutlineTextFieldWithErrorView
import com.massage.massenger.presentation.customComposeView.validPassword
import com.massage.massenger.presentation.customComposeView.validPhone
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun LoginScreen(navController: NavController, viewModel: LogInViewModel, loggedIn: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {

            var phoneError by remember { mutableStateOf(false) }
//            var phone by remember { mutableStateOf("") }
            val phoneUpdate = { data: String ->
                if (data.length <= 20) viewModel.phone = data
                if ("+880${viewModel.phone}".validPhone()) phoneError = false
            }

            var passwordError by remember { mutableStateOf(false) }
//            var password by remember { mutableStateOf("") }
            val passwordTextUpdate = { data: String ->
                viewModel.password = data
                if (viewModel.password.validPassword()) passwordError = false
            }

            var submitButtonText by remember { mutableStateOf("Submit") }
            var errorText: String? by remember { mutableStateOf(null) }

            if (viewModel.dataState.isLoading) {
                submitButtonText = "Loading..."
                errorText = null
            }

            if (viewModel.dataState.data != null) {
                submitButtonText = "Successful"
                errorText = null
                LaunchedEffect(key1 = true, block = {
                    launch {
                        delay(300)
                        loggedIn()
                    }
                })
            }

            if (viewModel.dataState.error != null) {
                submitButtonText = "Submit"
                errorText = "Error: ${viewModel.dataState.error}"
            }

            if (viewModel.dataState.data == null) {
                submitButtonText = "Submit"
                errorText = null
            }


            LoginForm(
                phone = viewModel.phone,
                phoneUpdate = phoneUpdate,
                phoneError = phoneError,

                password = viewModel.password,
                passwordUpdate = passwordTextUpdate,
                passwordError = passwordError,

                navController = navController,
                viewModel = viewModel,
                errorText = errorText,
                submitButtonText = submitButtonText
            ) {
                phoneError = !viewModel.phone.validPhone()
                passwordError = !viewModel.password.validPassword()

                if (!(phoneError || passwordError)) {
                    viewModel.login()
                }
            }

            Box(
                Modifier
                    .height(40.dp)
                    .weight(1f)
            ) {

            }
        }
    }
}


@Composable
fun LoginForm(
    phone: String,
    phoneUpdate: (String) -> Unit,
    phoneError: Boolean,

    password: String,
    passwordUpdate: (String) -> Unit,
    passwordError: Boolean,

    submitButtonText: String,
    errorText: String?,
    navController: NavController,
    viewModel: LogInViewModel,
    validate: () -> Unit
) {
    Column(
        modifier = Modifier
            .navigationBarsWithImePadding()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Spacer(
            modifier = Modifier
                .height(50.dp)
                .weight(1f)
        )

        Text(
            text = "Login",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.h3,
        )

        Spacer(
            modifier = Modifier
                .height(50.dp)
                .weight(1f)
        )

        /**
         *  Phone Number Field
         */
        OutlineTextFieldWithErrorView(
            value = phone, onValueChange = phoneUpdate,
            isError = phoneError,
            label = { Text("phone") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Phone
            ),
            visualTransformation = PrefixTransformation("(+880)"),
            errorMsg = "Enter A Valid Number"
        )

        var passwordVisibility: Boolean by remember { mutableStateOf(false) }

        /**
         *  Password Field
         */
        OutlineTextFieldWithErrorView(
            value = password, onValueChange = passwordUpdate,
            isError = passwordError,
            label = { Text("password") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password
            ),
            errorMsg = "Password Too Short",
            singleLine = true,
            visualTransformation = if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation(),
            trailingIcon = {
                val image =
                    if (passwordVisibility) Icons.Default.RemoveRedEye
                    else Icons.Default.Menu

                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(imageVector = image, "")
                }
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        /**
         * Submit Button
         */

        Button(
            enabled = submitButtonText == "Submit",
            onClick = { validate() },
            shape = RoundedCornerShape(size = 22.5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
        ) {
            if (submitButtonText == "Loading...") {
                CircularProgressIndicator(modifier = Modifier.size(30.dp))
            }
            Text(
                text = submitButtonText,
                fontSize = 16.sp
            )
        }

        errorText?.let {
            Row {
                Spacer(modifier = Modifier.width(16.dp))
                Text(it, fontSize = 14.sp, color = Color.Red)
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Text("Don't Have Account?", fontSize = 8.sp)
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                modifier = Modifier
                    .height(30.dp)
                    .width(73.dp),
                onClick = {
//                    viewModel.loginRequest(null)
                    navController.popBackStack()
                    navController.navigate("signup")
                }) {
                Text("Sign Up?", fontSize = 8.sp)
            }
        }
    }
}
