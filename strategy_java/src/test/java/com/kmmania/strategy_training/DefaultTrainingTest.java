package com.kmmania.strategy_training;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultTrainingTest {

    // Utility field and stream for capturing System.out.println output
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    // Setup capturing of System.out.println output
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    // Reset System.out.println output capturing
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("train() method should print DefaultTraining message")
    void train_ShouldPrintDefaultTrainingMessage() {
        // Given
        DefaultTraining defaultTraining = new DefaultTraining();

        // When
        defaultTraining.train();

        // Then
        assertThat(getStandardOutContent()).contains("*** Default training ***");
        assertThat(getStandardOutContent()).contains("...");
    }

    // Utility method to capture System.out.println output
    private String getStandardOutContent() {
        return outContent.toString().trim();
    }
}
