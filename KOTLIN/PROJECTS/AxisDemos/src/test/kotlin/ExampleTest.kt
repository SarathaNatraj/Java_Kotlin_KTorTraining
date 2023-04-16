import io.mockk.*
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
internal class ExampleClassTest {





    @Test
    fun `Mock a class`() {
        //mocking the class
        val exampleClass = mockk<ExampleClass>()

        //mocking the method value
        every { exampleClass.publicFunction() } returns "Mocked value"

        //making a test
        val result = exampleClass.publicFunction()

        assertEquals("Mocked value", result)
    }








    @Test
    fun `Spy a class`() {

        //checking the real time behaviour
        val exampleClass = spyk<ExampleClass>()

        assertEquals("Returned value", exampleClass.publicFunction())
    }

    @Test
    fun `Mock a private function`() {
        val exampleClass = spyk<ExampleClass>(recordPrivateCalls = true)

        every { exampleClass["privateFunction"]() } returns "Mocked value"

        assertEquals("Mocked value", exampleClass.publicFunction())
    }

    @Test
    fun `Mock an object`() {
        //mock object using mockkObject()
        mockkObject(ExampleObject)


        every { ExampleObject.concat(any(), any()) } returns "Mocked value"

        val result = ExampleObject.concat("", "")

        assertEquals("Mocked value", result)
    }




    @Test
    fun `Verify calls`() {
        val exampleClassMock = mockk<ExampleClass>()

        every { exampleClassMock.multiplyByTen(any()) } returns 5

        exampleClassMock.multiplyByTen(10)
        exampleClassMock.multiplyByTen(20)
     //   exampleClassMock.multiplyByTen(20)

        verify(exactly = 2) { exampleClassMock.multiplyByTen(any()) }
        confirmVerified(exampleClassMock)
    }
}