package com.massage.massenger.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable


@Serializable
@Parcelize
@Entity(tableName = "connection_table")
class User(
    @PrimaryKey
    val id: String,
    val name: String,
    val phone: String,
) : Parcelable
