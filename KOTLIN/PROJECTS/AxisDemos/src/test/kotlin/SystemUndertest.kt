/*
import org.junit.jupiter.api.Test
import io.mockk.every
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions.*

internal class Test {

    @Test
    fun calculateAddsValues() {

        @MockK
         val doc1: Dependency1 = 6
        @MockK
        val doc2: Dependency2 = "5"



        every { doc1.value1 } returns 5
        every { doc2.value2 } returns "6"

        val sut = SystemUnderTest(doc1, doc2)

        assertEquals(11, sut.calculate())
    }

}

*/
