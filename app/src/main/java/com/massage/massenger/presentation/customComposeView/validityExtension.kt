package com.massage.massenger.presentation.customComposeView

import android.telephony.PhoneNumberUtils

fun String.valid() = isNotEmpty()

fun String.validPhone() = PhoneNumberUtils.isGlobalPhoneNumber(this)//PhoneNumberUtil.getInstance().isValidNumber(this)//

private const val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
fun String.validEmail() = matches(emailPattern.toRegex())

fun String.validPassword() = length >= 6