package com.kmmania.strategy_training;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DistanceTrainingTest {
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
    @DisplayName("train() method should print DistanceTraining message")
    void train_ShouldPrintDistanceTrainingMessage() {
        // Given
        TrainingSession trainingSessionMock = mock(TrainingSession.class);
        when(trainingSessionMock.date()).thenReturn(new Date());
        when(trainingSessionMock.timeSlot()).thenReturn("Morning");
        when(trainingSessionMock.place()).thenReturn("Pershing");

        DistanceTraining distanceTraining = new DistanceTraining(trainingSessionMock);

        // When
        distanceTraining.train();

        // Then
        assertThat(getStandardOutContent()).contains("*** Distance training ***");
        assertThat(getStandardOutContent()).contains("Date: 2024-05-06");
        assertThat(getStandardOutContent()).contains("Timeslot: Morning");
        assertThat(getStandardOutContent()).contains("Place: Pershing");
    }

    // Utility method to capture System.out.println output
    private String getStandardOutContent() {
        return outContent.toString().trim();
    }

}