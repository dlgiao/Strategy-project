package com.kmmania.strategy_training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DistanceTrainingTest extends BaseTrainingTest {
    @Test
    @DisplayName("train() method should print DistanceTraining content")
    void train_ShouldPrintDistanceTrainingMessage() {
        // Given
        TrainingSession trainingSessionMock = mock(TrainingSession.class);
        when(trainingSessionMock.date()).thenReturn(LocalDate.now());
        when(trainingSessionMock.timeSlot()).thenReturn("Evening");
        when(trainingSessionMock.place()).thenReturn("Louis Lumiere");

        DistanceTraining distanceTraining = new DistanceTraining(trainingSessionMock);

        // When
        distanceTraining.train();

        // Then
        assertThat(getStandardOutContent()).contains("*** Distance training ***");
        assertThat(getStandardOutContent()).contains("Date: " + LocalDate.now());
        assertThat(getStandardOutContent()).contains("Time slot: Evening");
        assertThat(getStandardOutContent()).contains("Place: Louis Lumiere");
    }
}