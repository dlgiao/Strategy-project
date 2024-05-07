package com.kmmania;

import com.kmmania.strategy_training.AthleticTraining;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

class ContextTest {

    // Utility field and stream for capturing System.out.println output
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Mock
    private AthleticTraining athleticTrainingMock;

    // Setup capturing of System.out.println output
    @BeforeEach
    public void setUpStreams() {
        MockitoAnnotations.openMocks(this);
        System.setOut(new PrintStream(outContent));
    }

    // Reset System.out.println output capturing
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("doTraining() should print training session content and delegate to AthleticTraining")
    void doTraining_ShouldPrintTrainingSessionContentAndDelegateToAthleticTraining() {
        // Given
        Context context = new Context();
        context.setAthleticTraining(athleticTrainingMock);

        // When
        context.doTraining();

        // Then
        assertThat(getStandardOutContent()).contains("=== Training session ===");
        verify(athleticTrainingMock).train();
        assertThat(getStandardOutContent()).contains("---");
    }

    // Utility method to capture System.out.println output
    private String getStandardOutContent() {
        return outContent.toString().trim();
    }
}