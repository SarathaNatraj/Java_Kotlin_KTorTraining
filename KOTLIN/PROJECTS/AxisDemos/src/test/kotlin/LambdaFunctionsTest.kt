import io.mockk.*
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

internal class LambdaFunctionsTest {

    val lambdaClass = mockk<LambdaFunctions>()
    @Test
    fun getStartsWithS() {
        val la = LambdaFunctions()
    }

    @Test
    fun `Mock a class`() {
        //mocking the class
        //val lambdaClass = mockk<LambdaFunctions>()

        //mocking the method value
        every { lambdaClass.getStartsWithSSize() } returns 5

        //making a test
        val result = lambdaClass.getStartsWithSSize()

        assertEquals(5, result)
    }

    @Test
    fun `Spy a class`() {

        //checking the real time behaviour
        val lambdaClassSpy = spyk<LambdaFunctions>()

        assertEquals(2, lambdaClassSpy.getStartsWithSSize())
    }
    @Test
    fun `Verify calls`() {


        every { lambdaClass.getStartsWithSSize() } returns 5

        lambdaClass.getStartsWithSSize()
        lambdaClass.getStartsWithSSize()
        //   exampleClassMock.multiplyByTen(20)

        verify(exactly = 2) { lambdaClass.getStartsWithSSize() }
        confirmVerified(lambdaClass)
    }
}