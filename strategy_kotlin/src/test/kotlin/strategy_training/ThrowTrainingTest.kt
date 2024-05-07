package strategy_training

import com.kmmania.strategy_training.ThrowTraining
import com.kmmania.strategy_training.TrainingSession
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import java.time.LocalDate

class ThrowTrainingTest : BaseTrainingTest() {
    @Test
    fun `train() method should print ThrowTraining content`() {
        // Given
        val trainingSessionMock = mock(TrainingSession::class.java)
        `when`(trainingSessionMock.date).thenReturn(LocalDate.now())
        `when`(trainingSessionMock.timeSlot).thenReturn("Afternoon")
        `when`(trainingSessionMock.place).thenReturn("Pershing")
        val throwTraining = ThrowTraining(trainingSessionMock)

        // When
        throwTraining.train()

        // Then
        assertThat(getStandardOutContent()).contains("*** Throw training ***")
        assertThat(getStandardOutContent()).contains("Date: ${LocalDate.now()}")
        assertThat(getStandardOutContent()).contains("Time slot: Afternoon")
        assertThat(getStandardOutContent()).contains("Place: Pershing")
    }
}