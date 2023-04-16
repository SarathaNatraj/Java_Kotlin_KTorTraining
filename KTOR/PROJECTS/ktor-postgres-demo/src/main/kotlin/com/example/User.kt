package com.example

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.util.*
import kotlinx.serialization.descriptors.PrimitiveKind
@Serializable
data class User(

    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)
@Serializable
data class UserDTO(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)
object UUIDSerializer : KSerializer<UUID> {
    override val descriptor = PrimitiveSerialDescriptor("UUID", PrimitiveKind.STRING)




    override fun deserialize(decoder: Decoder): UUID {
        return UUID.fromString(decoder.decodeString())
    }

    override fun serialize(encoder: Encoder, value: UUID) {
        encoder.encodeString(value.toString())
    }
}


