package com.kmmania.strategy_training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ThrowTrainingTest extends BaseTrainingTest {
    @Test
    @DisplayName("train() method should print ThrowTraining content")
    void train_ShouldPrintThrowTrainingContent() {
        // Given
        TrainingSession trainingSessionMock = mock(TrainingSession.class);
        when(trainingSessionMock.date()).thenReturn(LocalDate.now());
        when(trainingSessionMock.timeSlot()).thenReturn("Afternoon");
        when(trainingSessionMock.place()).thenReturn("Pershing");

        ThrowTraining throwTraining = new ThrowTraining(trainingSessionMock);

        // When
        throwTraining.train();

        // Then
        assertThat(getStandardOutContent()).contains("*** Throw training ***");
        assertThat(getStandardOutContent()).contains("Date: " + LocalDate.now());
        assertThat(getStandardOutContent()).contains("Time slot: Afternoon");
        assertThat(getStandardOutContent()).contains("Place: Pershing");
    }
}