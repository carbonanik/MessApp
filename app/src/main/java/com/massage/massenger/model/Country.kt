package com.massage.massenger.model

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val iso2: String,
    val name: String,
    val code: Int,
)

fun Country.displayText() = "+$code ($name)"