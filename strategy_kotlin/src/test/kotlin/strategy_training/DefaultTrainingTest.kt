package strategy_training

import com.kmmania.strategy_training.DefaultTraining
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DefaultTrainingTest : BaseTrainingTest() {
    @Test
    fun `train() method should print DefaultTraining message`() {
        // Given
        val defaultTraining = DefaultTraining()

        // When
        defaultTraining.train()

        // Then
        assertThat(getStandardOutContent()).contains("*** Default training ***")
        assertThat(getStandardOutContent()).contains("...")
    }
}