package com.massage.massenger.presentation.customComposeView

import android.telephony.PhoneNumberUtils
import android.util.Patterns
import com.massage.massenger.model.Country

fun String.valid() = isNotEmpty()

fun String.validPhone() =
    PhoneNumberUtils.isGlobalPhoneNumber(this)//PhoneNumberUtil.getInstance().isValidNumber(this)//

private const val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
fun String.validEmail() = matches(emailPattern.toRegex())

fun String.validPassword() = length >= 6


fun String.validNameET(): String? {
    return when {
        length < 3 -> "Name too short"
        matches(".*[\$&+,:;=?@#|<>^*()%!].*".toRegex()) -> "Name Does not contain Spacial Character"
        else -> null
    }
}

fun Country?.validCountryET(): String? {
    return if (this == null) "Country Not Selected"
    else null
}

fun String.validEmailET(): String? { // ET -> Error Text
    return if (!Patterns.EMAIL_ADDRESS.matcher(this).matches()) {
        "Invalid Email Address"
    } else null
}

fun String.validPasswordET(): String? {
    return when {
        length < 8 -> "Minimum 8 Character Password"
        !matches(".*[a-zA-Z].*".toRegex()) -> "Must Contain 1 Character"
        else -> null
    }
}

fun String.validNormalPasswordET(): String? {
    return when {
        length < 6 -> "Minimum 6 Character Password"
        else -> null
    }
}

fun String.validConfirmPasswordET(password: String): String? {
    return if (this != password) "Password Did Not Match"
    else null
}


fun String.validPhoneET(): String? {
    return when {
        !matches(".*[1-9].*".toRegex()) -> "Must be all Digits"
        length < 10 -> "Must be 10 Digits"
        else -> null
    }
}