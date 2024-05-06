package com.kmmania.strategy_training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SprintTrainingTest extends BaseTrainingTest {
    @Test
    @DisplayName("train() method should print SprintTraining content")
    void train_ShouldPrintSprintTrainingCotent() {
        // Given
        TrainingSession trainingSessionMock = mock(TrainingSession.class);
        when(trainingSessionMock.date()).thenReturn(LocalDate.now());
        when(trainingSessionMock.timeSlot()).thenReturn("Morning");
        when(trainingSessionMock.place()).thenReturn("Insep");

        SprintTraining sprintTraining = new SprintTraining(trainingSessionMock);

        // When
        sprintTraining.train();

        // Then
        assertThat(getStandardOutContent()).contains("*** Sprint training ***");
        assertThat(getStandardOutContent()).contains("Date: " + LocalDate.now());
        assertThat(getStandardOutContent()).contains("Time slot: Morning");
        assertThat(getStandardOutContent()).contains("Place: Insep");
    }
}