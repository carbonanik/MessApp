package com.massage.massenger.util

import androidx.room.TypeConverter
import com.massage.massenger.util.extensions.fromJson
import com.massage.massenger.util.extensions.toJson

class ListTypeConverter {
    @TypeConverter
    fun fromList(list: List<String>): String {
        return list.toJson()
    }

    @TypeConverter
    fun uuidFromString(string: String): List<String>? {
        return string.fromJson<List<String>>()
    }
}