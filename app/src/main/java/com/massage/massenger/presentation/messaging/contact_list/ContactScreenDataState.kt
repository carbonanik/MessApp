package com.massage.massenger.presentation.messaging.contact_list

import com.massage.massenger.model.User

data class ContactScreenDataState(
    val contacts: List<User> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val permissionText: String? = null
)