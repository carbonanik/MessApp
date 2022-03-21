package com.massage.massenger.util.object_id

import com.massage.massenger.util.object_id.Assertions.isTrueArgument
import com.massage.massenger.util.object_id.Assertions.notNull
import java.io.Serializable
import java.nio.ByteBuffer
import java.security.SecureRandom
import java.util.*
import java.util.concurrent.atomic.AtomicInteger

class ObjectId: Comparable<ObjectId>, Serializable {

    private var timestamp = 0
    private var counter = 0
    private var randomValue1 = 0
    private var randomValue2: Short = 0


    constructor() : this(date = Date())

    constructor(date: Date) :
            this(
                timestamp = dateToTimestampSeconds(date),
                counter = NEXT_COUNTER.getAndIncrement() and LOW_ORDER_THREE_BYTES,
                checkCounter = false
            )

    constructor(timestamp: Int, counter: Int, checkCounter: Boolean) :
            this(
                timestamp = timestamp,
                randomValue1 = RANDOM_VALUE1,
                randomValue2 = RANDOM_VALUE2,
                counter = counter,
                checkCounter = checkCounter
            )

    constructor(
        timestamp: Int,
        randomValue1: Int,
        randomValue2: Short,
        counter: Int,
        checkCounter: Boolean
    ) {
        require(randomValue1 and -0x1000000 == 0) { "The machine identifier must be between 0 and 16777215 (it must fit in three bytes)." }
        require(!(checkCounter && counter and -0x1000000 != 0)) { "The counter must be between 0 and 16777215 (it must fit in three bytes)." }
        this.timestamp = timestamp
        this.counter = counter and LOW_ORDER_THREE_BYTES
        this.randomValue1 = randomValue1
        this.randomValue2 = randomValue2
    }

    constructor(hexString: String) : this(parseHexString(hexString))
    constructor(bytes: ByteArray) :
            this(
                ByteBuffer.wrap(
                    isTrueArgument(
                        "bytes has length of 12",
                        bytes,
                        notNull("bytes", bytes).size == 12
                    )
                )
            )

    constructor(buffer: ByteBuffer) {
        notNull("buffer", buffer)
        isTrueArgument("buffer.remaining() >=12", buffer.remaining() >= OBJECT_ID_LENGTH)

        timestamp = makeInt(buffer.get(), buffer.get(), buffer.get(), buffer.get())
        randomValue1 = makeInt(0.toByte(), buffer.get(), buffer.get(), buffer.get())
        randomValue2 = makeShort(buffer.get(), buffer.get())
        counter = makeInt(0.toByte(), buffer.get(), buffer.get(), buffer.get())
    }

    fun putToByteBuffer(buffer: ByteBuffer) {
        notNull("buffer", buffer)
        isTrueArgument(
            "buffer.remaining() >=12",
            buffer.remaining() >= OBJECT_ID_LENGTH
        )
        buffer.put(int3(timestamp))
        buffer.put(int2(timestamp))
        buffer.put(int1(timestamp))
        buffer.put(int0(timestamp))
        buffer.put(int2(randomValue1))
        buffer.put(int1(randomValue1))
        buffer.put(int0(randomValue1))
        buffer.put(short1(randomValue2))
        buffer.put(short0(randomValue2))
        buffer.put(int2(counter))
        buffer.put(int1(counter))
        buffer.put(int0(counter))
    }


    fun toByteArray(): ByteArray {
        val buffer = ByteBuffer.allocate(OBJECT_ID_LENGTH)
        putToByteBuffer(buffer)
        return buffer.array() // using .allocate ensures there is a backing array that can be returned
    }

    fun toHexString(): String {
        val chars = CharArray(OBJECT_ID_LENGTH * 2)
        var i = 0
        toByteArray().forEach { b ->
            chars[i++] = HEX_CHARS[b.toInt() shr 4 and 0xF]
            chars[i++] = HEX_CHARS[b.toInt() and 0xF]
        }
        return String(chars)
    }

    override fun toString(): String {
        return toHexString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other == null || javaClass != other.javaClass) return false

        val objectId = other as ObjectId

        if (
            counter != counter ||
            timestamp != objectId.timestamp ||
            randomValue1 != objectId.randomValue1 ||
            randomValue2 != objectId.randomValue2
        ) return false

        return true
    }

    override fun hashCode(): Int {
        var result = timestamp
        result = 31 * result + counter
        result = 31 * result + randomValue1
        result = 31 * result + randomValue2
        return result
    }

    override fun compareTo(other: ObjectId): Int {
        val byteArray = toByteArray()
        val otherByteArray = other.toByteArray()
        for (i in 0 until OBJECT_ID_LENGTH) {
            if (byteArray[i] != otherByteArray[i]) {
                return if (byteArray[i].toInt() and 0xff < otherByteArray[i].toInt() and 0xff) -1 else 1
            }
        }
        return 0
    }

    private fun makeInt(b3: Byte, b2: Byte, b1: Byte, b0: Byte): Int {
        // CHECKSTYLE:OFF
        return b3.toInt() shl 24 or
                (b2.toInt() and 0xff shl 16) or
                (b1.toInt() and 0xff shl 8) or
                (b0.toInt() and 0xff)
        // CHECKSTYLE:ON
    }

    private fun makeShort(b1: Byte, b0: Byte): Short {
        // CHECKSTYLE:OFF
        return (b1.toInt() and 0xff shl 8 or (b0.toInt() and 0xff)).toShort()
        // CHECKSTYLE:ON
    }

    private fun int3(x: Int): Byte {
        return (x shr 24).toByte()
    }

    private fun int2(x: Int): Byte {
        return (x shr 16).toByte()
    }

    private fun int1(x: Int): Byte {
        return (x shr 8).toByte()
    }

    private fun int0(x: Int): Byte {
        return x.toByte()
    }

    private fun short1(x: Short): Byte {
        return (x.toInt() shr 8).toByte()
    }

    private fun short0(x: Short): Byte {
        return x.toByte()
    }


    companion object {
        private var RANDOM_VALUE1 = 0
        private var RANDOM_VALUE2: Short = 0

        private val HEX_CHARS = charArrayOf(
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        )

        private val NEXT_COUNTER = AtomicInteger(SecureRandom().nextInt())
        private const val LOW_ORDER_THREE_BYTES = 0x00ffffff
        private const val OBJECT_ID_LENGTH = 12

        init {
            try {
                val secureRandom = SecureRandom()
                RANDOM_VALUE1 = secureRandom.nextInt(0x01000000)
                RANDOM_VALUE2 = secureRandom.nextInt(0x00008000).toShort()
            } catch (e: Exception) {
                throw RuntimeException(e)
            }
        }

        private fun dateToTimestampSeconds(time: Date): Int {
            return (time.time / 1000).toInt()
        }

        private fun parseHexString(s: String): ByteArray {
            require(isValid(s)) { "invalid hexadecimal representation of an ObjectId: [$s]" }
            val b = ByteArray(OBJECT_ID_LENGTH)
            for (i in b.indices) {
                b[i] = s.substring(i * 2, i * 2 + 2).toInt(16).toByte()
            }
            return b
        }

        fun isValid(hexString: String?): Boolean {
            requireNotNull(hexString)
            val len = hexString.length
            if (len != 24) return false

            for (i in 0 until len) {
                val c = hexString[i]
                if (c in '0'..'9') continue
                if (c in 'a'..'f') continue
                if (c in 'A'..'F') continue
                return false
            }
            return true
        }
    }
}