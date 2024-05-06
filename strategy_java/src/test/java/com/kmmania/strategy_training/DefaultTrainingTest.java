package com.kmmania.strategy_training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultTrainingTest extends BaseTrainingTest {

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
}
