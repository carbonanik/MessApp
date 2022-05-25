package com.massage.massenger.presentation.messaging.contact_list

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.massage.massenger.model.User
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.util.object_id.ObjectId

@Preview
@Composable
fun ContactScreenPrev() {
    MessengerTheme {
        ContactScreenContent(
            dataState = ContactScreenDataState(),
            onContactClick = {},
            onAllowPermissionClick = {}
        )
    }
}


@Preview
@Composable
fun PersonPreview() {
    MessengerTheme {
        Column {
            StatusBar(statusText = "Updating Contacts", loadingIndicator = true)
            AskPermission(ContactPermission.NOT_ACCEPTED){}
            ContactView(
                connection = User(
                    id = "01",
                    name = "Anik",
                    phone = "01766785027"
                ),
                onContactClick = {}
            )
            ContactView(
                connection = User(
                    id = "01",
                    name = "Anik",
                    phone = "01766785027"
                ),
                onContactClick = {}
            )
        }
    }
}


val testConnections = listOf(
    User(
        id = ObjectId().toString(),
        name = "Mia Maruf",
        phone = "8801708653739"
    ),
    User(
        id = ObjectId().toString(),
        name = "Bipu Atikur",
        phone = "8801509926113"
    ),
    User(
        id = ObjectId().toString(),
        name = "Amin Parves",
        phone = "8801877851774"
    ),
    User(
        id = ObjectId().toString(),
        name = "Huda Jakir",
        phone = "8801415582161"
    ),
    User(
        id = ObjectId().toString(),
        name = "Nur Jannatul",
        phone = "8801682262208"
    ),
    User(
        id = ObjectId().toString(),
        name = "Hassan Parvase",
        phone = "8801120145640"
    ),
    User(
        id = ObjectId().toString(),
        name = "Mohammad Mijanur",
        phone = "8801729212768"
    ),
    User(
        id = ObjectId().toString(),
        name = "Hassan Sayed",
        phone = "8801714157093"
    ),
    User(
        id = ObjectId().toString(),
        name = "Mijan Ujjol",
        phone = "8801372471236"
    ),
    User(
        id = ObjectId().toString(),
        name = "Nipa Habiba",
        phone = "8801466416095"
    ),
    User(
        id = ObjectId().toString(),
        name = "Bulbul Ashraful",
        phone = "8801111888103"
    ),
    User(
        id = ObjectId().toString(),
        name = "Sheikh Bristi",
        phone = "8801869342270"
    ),
    User(
        id = ObjectId().toString(),
        name = "Khatun Mariam",
        phone = "8801295870344"
    ),
    User(
        id = ObjectId().toString(),
        name = "Ruhul Hossen",
        phone = "8801314197651"
    ),
    User(
        id = ObjectId().toString(),
        name = "Sheikh Shamsun",
        phone = "8801886050838"
    ),
    User(
        id = ObjectId().toString(),
        name = "Tareq Mijanur",
        phone = "8801356846797"
    ),
    User(
        id = ObjectId().toString(),
        name = "Jakir Al-Amin",
        phone = "8801406392893"
    ),
    User(
        id = ObjectId().toString(),
        name = "Ishita Sumiya",
        phone = "8801637317281"
    ),
    User(
        id = ObjectId().toString(),
        name = "Kaji Joynal",
        phone = "8801279761370"
    ),
)