package com.massage.massenger.data.local.content

import android.content.Context
import android.provider.ContactsContract
import com.google.i18n.phonenumbers.PhoneNumberUtil
import com.massage.massenger.util.Country
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class ContactDataSource @Inject constructor(
    @ApplicationContext private val context: Context
) {

    suspend fun fetchContact(): List<String> = withContext(Dispatchers.IO) {
        println("fetchContact")
        val phones = mutableListOf<String>()

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

//            val phone = Phone(formattedN)

            if (!phones.contains(formattedN)) {
                phones.add(formattedN)
            }
        }
        contacts?.close()
        phones
    }

    data class Phone(val name: String, val number: String)
    suspend fun fetchContactWithName(): List<Phone> = withContext(Dispatchers.IO) {
        println("fetchContact")
        val phones = mutableListOf<Phone>()

        val contacts = context.contentResolver.query(
            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
            null,
            null,
            null,
            null
        )

        while (contacts?.moveToNext() == true) {

            val number = contacts.getString(
                contacts.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.NUMBER))
            val name = contacts.getString(
                contacts.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))

            val formattedN = internationalNumber(number)

            val phone = Phone(name, formattedN)

            if (!phones.contains(phone)) {
                phones.add(phone)
            }
        }
        contacts?.close()
        phones.forEach { println(it) }
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