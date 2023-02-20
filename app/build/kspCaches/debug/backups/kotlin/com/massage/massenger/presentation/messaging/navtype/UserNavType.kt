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
import com.massage.massenger.model.User
import com.ramcosta.composedestinations.navargs.parcelable.DefaultParcelableNavTypeSerializer

val userNavType = UserNavType(DefaultParcelableNavTypeSerializer(User::class.java))

class UserNavType(
    private val stringSerializer: DestinationsNavTypeSerializer<Parcelable>
) : DestinationsNavType<User?>() {

    override fun get(bundle: Bundle, key: String): User? {
        return bundle.getParcelable(key)
    }

    override fun put(bundle: Bundle, key: String, value: User?) {
        bundle.putParcelable(key, value)
    }

    override fun parseValue(value: String): User? {
        return if (value == DECODED_NULL) {
            null
        } else {
            stringSerializer.fromRouteString(value) as User       
        }
    }

    override fun serializeValue(value: User?): String {
        return if (value == null) {
            ENCODED_NULL
        } else {
            encodeForRoute(stringSerializer.toRouteString(value))
        }
    }
    
    fun get(navBackStackEntry: NavBackStackEntry, key: String): User? {
        return navBackStackEntry.arguments?.getParcelable(key)
    }

    fun get(savedStateHandle: SavedStateHandle, key: String): User? {
        return savedStateHandle.get(key)
    }
}