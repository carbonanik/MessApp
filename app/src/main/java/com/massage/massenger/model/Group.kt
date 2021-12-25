package com.massage.massenger.model

import kotlinx.serialization.Serializable

@Serializable
data class Group(
    val id: String,
    val name: String,
    val admin: List<String>,
    val members: List<String>
)