package com.massage.massenger.presentation.messaging.contact_list

import com.massage.massenger.model.User

data class ContactScreenDataState(
    val contacts: List<User> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val contactPermission: ContactPermission = ContactPermission.NOT_ACCEPTED
)

enum class ContactPermission(val value: String? = null) {
    ACCEPTED,
    NOT_ACCEPTED("Contact Permission Needed"),
    PERMANENTLY_DENIED("Contact Permission was permanently denied")
}

