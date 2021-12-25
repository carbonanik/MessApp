package com.massage.massenger.util.extensions

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
val json = Json {
    encodeDefaults = true
    explicitNulls = true
    ignoreUnknownKeys = true
}

@OptIn(ExperimentalSerializationApi::class)
inline fun <reified T> T.toJson() = json.encodeToString(this)

@OptIn(ExperimentalSerializationApi::class)
inline fun <reified T> String.fromJson() = json.decodeFromString<T?>(this)
