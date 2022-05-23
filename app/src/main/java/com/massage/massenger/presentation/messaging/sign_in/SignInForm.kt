package com.massage.massenger.presentation.messaging.sign_in

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.massage.massenger.R
import com.massage.massenger.model.Country
import com.massage.massenger.model.displayText
import com.massage.massenger.presentation.component.CountryBottomView
import com.massage.massenger.presentation.customComposeView.OutlineTextFieldWithErrorView
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.presentation.ui.theme.RoundedCornerButtonShape
import com.massage.massenger.presentation.ui.theme.TextFieldOutlineColor

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SignInForm(
    signInState: SignInDataState,
    countries: SnapshotStateList<Country>,
    onEvent: (event: SignInFormEvent) -> Unit,
    filterCountryCode: (query: String) -> Unit,
    onForgetPasswordClick: () -> Unit,
    onSignUpTextClick: () -> Unit,
    modalBottomSheetState: ModalBottomSheetState,
    onBottomSheetEvent: (event: BottomSheetEvent) -> Unit,
) {


    // bottom sheet shows country list
    ModalBottomSheetLayout(sheetContent = {

        // bottom sheet view
        CountryBottomView(
            countries = countries,
            onCountrySelect = { country ->
                onEvent(SignInFormEvent.CountrySelected(country))
                onBottomSheetEvent(BottomSheetEvent.HIDE)
            },
            filterCountryCode = filterCountryCode
        )
    }, sheetState = modalBottomSheetState) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .navigationBarsWithImePadding()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            Text(
                text = "Sign In",
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h3,
            )

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            /**
             * Country Code Field
             */
            OutlineTextFieldWithErrorView(
                modifier = Modifier
                    .fillMaxWidth()
                    .onFocusChanged {
                        if (it.isFocused) {
                            onBottomSheetEvent(BottomSheetEvent.SHOW)
                        }
                    },
                value = signInState.country?.displayText() ?: "",
                placeholder = {
                    Text(text = "Select Country")
                },
                onValueChange = { },
                label = {
                    Text(
                        text = "Select Country"
                    )
                },
                readOnly = true,
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Phone
                ),
                errorMsg = signInState.countryError,
                leadingIcon = {
                    Image(
                        painter = painterResource(
                            id = getFlagResId(
                                iso2 = signInState.country?.iso2 ?: "bd"
                            )
                        ),
                        contentDescription = null
                    )
                },
                trailingIcon = {
                    IconButton(onClick = {
                        onBottomSheetEvent(BottomSheetEvent.SHOW)
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.form_icon_arrow_down),
                            contentDescription = null
                        )

                    }
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colors.primary,
                    unfocusedBorderColor = TextFieldOutlineColor
                ),
                shape = RoundedCornerButtonShape
            )

            /**
             *  Phone Number Field
             */
            OutlineTextFieldWithErrorView(
                modifier = Modifier.fillMaxWidth(),
                value = signInState.phone,
                onValueChange = { onEvent(SignInFormEvent.PhoneChanged(it)) },
                label = {
                    Text(
                        text = "Phone"
                    )
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Phone
                ),
//                visualTransformation = PrefixTransformation("(+880)"),
                errorMsg = signInState.phoneError,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.form_icon_phone),
                        contentDescription = null
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colors.primary,
                    unfocusedBorderColor = TextFieldOutlineColor
                ),
                shape = RoundedCornerButtonShape
            )

            var passwordVisibility: Boolean by remember { mutableStateOf(false) }

            /**
             *  Password Field
             */
            OutlineTextFieldWithErrorView(
                value = signInState.password,
                onValueChange = { onEvent(SignInFormEvent.PasswordChanged(it)) },
                label = { Text("Password") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password
                ),
                errorMsg = signInState.passwordError,
                singleLine = true,
                visualTransformation = if (passwordVisibility) VisualTransformation.None
                else PasswordVisualTransformation(),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.form_icon_key),
                        contentDescription = null
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colors.primary,
                    unfocusedBorderColor = TextFieldOutlineColor
                ),
                shape = RoundedCornerButtonShape,
                trailingIcon = {

                    val resId = if (passwordVisibility) R.drawable.form_icon_eye_cross
                    else R.drawable.form_icon_eye

                    IconButton(onClick = {
                        passwordVisibility = !passwordVisibility
                    }) {
                        Icon(painter = painterResource(id = resId), "")
                    }
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            /**
             * Submit Button
             */

            Button(
                onClick = {
                    onEvent(SignInFormEvent.SignInClick)
                },
                shape = RoundedCornerShape(size = 22.5.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp),
                enabled = signInState.isNotEmpty()
            ) {
                Text(
                    text = "Sign In",
                    fontSize = 16.sp
                )
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
                    onClick = onSignUpTextClick
                ) {
                    Text("Sign Up?", fontSize = 8.sp)
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun SignInScreenPrev() {
    MessengerTheme {
        Surface {
            SignInForm(signInState = SignInDataState(),
                onEvent = {},
                onForgetPasswordClick = {},
                onSignUpTextClick = {},
                countries = remember { mutableStateListOf() },
                filterCountryCode = {},
                modalBottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden),
                onBottomSheetEvent = {}
            )
        }
    }
}