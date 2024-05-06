package com.kmmania.strategy_training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class JumpTrainingTest extends BaseTrainingTest {
    @Test
    @DisplayName("train() method should print JumpTraining content")
    void train_ShouldPrintJumpTrainingContent() {
        // Given
        TrainingSession trainingSessionMock = mock(TrainingSession.class);
        when(trainingSessionMock.date()).thenReturn(LocalDate.now());
        when(trainingSessionMock.timeSlot()).thenReturn("Evening");
        when(trainingSessionMock.place()).thenReturn("Alain Mimoun");

        JumpTraining jumpTraining = new JumpTraining(trainingSessionMock);

        // When
        jumpTraining.train();

        // Then
        assertThat(getStandardOutContent()).contains("*** Jump training ***");
        assertThat(getStandardOutContent()).contains("Date: " + LocalDate.now());
        assertThat(getStandardOutContent()).contains("Time slot: Evening");
        assertThat(getStandardOutContent()).contains("Place: Alain Mimoun");
    }
}