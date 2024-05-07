import com.kmmania.Context
import com.kmmania.strategy_training.AthleticTraining
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ContextTest {

    // Utility field and stream for capturing System.out.println output
    private val outContent = ByteArrayOutputStream()
    private val originalOut: PrintStream = System.out

    @Mock
    lateinit var athleticTrainingMock: AthleticTraining

    // Setup capturing of System.out.println output
    @BeforeEach
    fun setUpStreams() {
        MockitoAnnotations.openMocks(this)
        athleticTrainingMock = mock(AthleticTraining::class.java)
        System.setOut(PrintStream(outContent))
    }

    // Reset System.out.println output capturing
    @AfterEach
    fun restoreStreams() {
        System.setOut(originalOut)
    }

    @Test
    fun `doTraining() should print training session content and delegate to AthleticTraining`() {
        // Given
        val context = Context()
        context.athleticTraining = athleticTrainingMock

        // When
        context.doTraining()

        // Then
        assertThat(getStandardOutContent()).contains("=== Training session ===")
        verify(athleticTrainingMock).train()
        assertThat(getStandardOutContent()).contains("---")
    }

    // Utility method to capture System.out.println output
    private fun getStandardOutContent(): String {
        return outContent.toString().trim { it <= ' ' }
    }
}