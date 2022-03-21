package com.massage.massenger.util.object_id

object Assertions {
    fun <T> isTrueArgument(name: String, value: T, condition: Boolean): T {
        require(condition) { "state should be: $name" }
        return value
    }

    fun isTrueArgument(name: String, condition: Boolean) {
        require(condition) { "state should be: $name" }
    }

    fun <T> notNull(name: String, value: T?): T {
        requireNotNull(value) { "$name can not be null" }
        return value
    }
}