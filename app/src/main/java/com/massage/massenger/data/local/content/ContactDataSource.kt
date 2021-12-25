package com.massage.massenger.data.local.content

import android.content.Context
import android.provider.ContactsContract
import android.telephony.PhoneNumberUtils
import com.google.i18n.phonenumbers.PhoneNumberUtil
import com.massage.massenger.model.Phones
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.*
import javax.inject.Inject
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber

import androidx.core.content.ContextCompat.getSystemService

import android.telephony.TelephonyManager
import androidx.compose.ui.text.toLowerCase
import androidx.core.content.ContextCompat
import com.massage.massenger.util.Country
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception
import java.security.AccessController.getContext


class ContactDataSource @Inject constructor(
    @ApplicationContext private val context: Context
) {

    suspend fun fetchContact(): Phones = withContext(Dispatchers.IO) {
        val phones = Phones()

        val contacts = context.contentResolver.query(
            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
            null,
            null,
            null,
            null
        )

        while (contacts?.moveToNext() == true) {

            val number =
                contacts.getString(contacts.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.NUMBER))
            val formattedN = internationalNumber(number)

            if (!phones.phone.contains(formattedN)) {
                phones.phone.add(formattedN)
            }

        }
        contacts?.close()
        phones
    }

    private fun internationalNumber(number: String): String {

//        val manager = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        val usersCountryISOCode = "bd"//manager.simCountryIso
        var answer = Regex("[^0-9+]").replace(number, "")

        return try {
            val n = PhoneNumberUtil.getInstance()
                .parse(answer, usersCountryISOCode)
            "+${n.countryCode}${n.nationalNumber}"
        } catch (e: Exception) {
            e.printStackTrace()
            val phoneCode = Country.getPhoneCode(usersCountryISOCode.lowercase())
            if (answer.startsWith("0")){
                answer = answer.drop(1)
            }
            "+$phoneCode$answer"
        }
    }
}