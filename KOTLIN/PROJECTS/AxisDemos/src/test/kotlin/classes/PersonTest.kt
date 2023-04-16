package classes

import org.junit.jupiter.api.Assertions.*


import kotlin.test.Test
import kotlin.test.assertEquals
import Person

internal class PersonTest {

    private val testPerson: Person = Person("Mike",25)

    @Test
    fun testCaps() {
        val expected = "John"
        assertEquals(expected, testPerson.caps("john"))
    }
}