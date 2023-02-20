package com.massage.massenger.presentation.messaging.navtype

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavBackStackEntry
import com.ramcosta.composedestinations.navargs.DestinationsNavType
import com.ramcosta.composedestinations.navargs.DestinationsNavTypeSerializer
import com.ramcosta.composedestinations.navargs.utils.encodeForRoute
import com.ramcosta.composedestinations.navargs.primitives.DECODED_NULL
import com.ramcosta.composedestinations.navargs.primitives.ENCODED_NULL
import com.massage.massenger.model.Chat
import com.ramcosta.composedestinations.navargs.parcelable.DefaultParcelableNavTypeSerializer

val chatNavType = ChatNavType(DefaultParcelableNavTypeSerializer(Chat::class.java))

class ChatNavType(
    private val stringSerializer: DestinationsNavTypeSerializer<Parcelable>
) : DestinationsNavType<Chat?>() {

    override fun get(bundle: Bundle, key: String): Chat? {
        return bundle.getParcelable(key)
    }

    override fun put(bundle: Bundle, key: String, value: Chat?) {
        bundle.putParcelable(key, value)
    }

    override fun parseValue(value: String): Chat? {
        return if (value == DECODED_NULL) {
            null
        } else {
            stringSerializer.fromRouteString(value) as Chat       
        }
    }

    override fun serializeValue(value: Chat?): String {
        return if (value == null) {
            ENCODED_NULL
        } else {
            encodeForRoute(stringSerializer.toRouteString(value))
        }
    }
    
    fun get(navBackStackEntry: NavBackStackEntry, key: String): Chat? {
        return navBackStackEntry.arguments?.getParcelable(key)
    }

    fun get(savedStateHandle: SavedStateHandle, key: String): Chat? {
        return savedStateHandle.get(key)
    }
}