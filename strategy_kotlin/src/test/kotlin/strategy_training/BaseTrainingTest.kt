package strategy_training

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

open class BaseTrainingTest {

    // Utility field and stream for capturing System.out.println output
    private val outContent = ByteArrayOutputStream()
    private val originalOut: PrintStream = System.out

    // Setup capturing of System.out.println output
    @BeforeEach
    fun setUpStreams() {
        System.setOut(PrintStream(outContent))
    }

    // Reset System.out.println output capturing
    @AfterEach
    fun restoreStreams() {
        System.setOut(originalOut)
    }

    // Utility method to capture System.out.println output
    protected fun getStandardOutContent(): String {
        return outContent.toString().trim { it <= ' ' }
    }
}