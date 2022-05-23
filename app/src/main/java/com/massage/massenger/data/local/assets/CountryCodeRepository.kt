package com.massage.massenger.data.local.assets

import android.content.Context
import com.massage.massenger.model.Country
import com.massage.massenger.util.extensions.fromJson
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.nio.charset.Charset
import javax.inject.Inject

class CountryCodeRepository @Inject constructor(
    @ApplicationContext private val context: Context
) {
    suspend fun getCountries(): List<Country> = withContext(Dispatchers.IO){
        val stream = context.assets.open("countries.json")
        val jsonString = String(stream.readBytes(), Charset.defaultCharset())
        val countries = jsonString.fromJson<List<Country>>()
        countries ?: emptyList()
    }
}