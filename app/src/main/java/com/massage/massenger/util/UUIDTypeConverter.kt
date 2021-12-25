package com.massage.massenger.util

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.*

class UUIDTypeConverter {
    @TypeConverter
    fun fromUUID(uuid: UUID): String {
        return uuid.toString()
    }

    @TypeConverter
    fun uuidFromString(string: String): UUID? {
        return UUID.fromString(string)
    }
}