package com.massage.massenger.presentation.messaging.log_in

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
import com.massage.massenger.presentation.customComposeView.OutlineTextFieldWithErrorView
import com.massage.massenger.presentation.customComposeView.PrefixTransformation
import com.massage.massenger.presentation.customComposeView.validPassword
import com.massage.massenger.presentation.customComposeView.validPhone
import com.massage.massenger.presentation.navigation.SignupScreen
import com.massage.massenger.presentation.navigation.TabNavigation
import com.massage.massenger.presentation.navigation.popNavigate


@Composable
fun LoginScreen(navController: NavController, viewModel: LogInViewModel) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {

            if (viewModel.loggedIn){
                viewModel.loggedIn = false
                navController.popBackStack()
                navController.navigate(TabNavigation())
            }

            LoginForm(
                navController = navController,
                viewModel = viewModel,
            )

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
    navController: NavController,
    viewModel: LogInViewModel
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
            value = viewModel.phone, onValueChange = {
                if (it.length <= 20) viewModel.phone = it
                if ("+880${viewModel.phone}".validPhone()) viewModel.phoneError = false
            },
            isError = viewModel.phoneError,
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
            value = viewModel.password, onValueChange = {
                viewModel.password = it
                if (viewModel.password.validPassword()) viewModel.passwordError = false
            },
            isError = viewModel.passwordError,
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
            enabled = viewModel.submitButtonText == "Submit",
            onClick = {
                viewModel.loginFormValidate { valid ->
                    if (valid){ viewModel.login() }
                }
            },
            shape = RoundedCornerShape(size = 22.5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
        ) {
            if (viewModel.submitButtonText == "Loading...") {
                CircularProgressIndicator(modifier = Modifier.size(30.dp))
            }
            Text(
                text = viewModel.submitButtonText,
                fontSize = 16.sp
            )
        }

        viewModel.errorText?.let {
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
                    navController.popNavigate(SignupScreen())
                }) {
                Text("Sign Up?", fontSize = 8.sp)
            }
        }
    }
}
