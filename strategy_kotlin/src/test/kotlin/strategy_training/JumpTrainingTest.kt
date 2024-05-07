package strategy_training

import com.kmmania.strategy_training.JumpTraining
import com.kmmania.strategy_training.TrainingSession
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import java.time.LocalDate

class JumpTrainingTest : BaseTrainingTest() {
    @Test
    fun `train() method should print JumpTraining content`() {
        // Given
        val trainingSessionMock = mock(TrainingSession::class.java)
        `when`(trainingSessionMock.date).thenReturn(LocalDate.now())
        `when`(trainingSessionMock.timeSlot).thenReturn("Evening")
        `when`(trainingSessionMock.place).thenReturn("Alain Mimoun")
        val jumpTraining = JumpTraining(trainingSessionMock)

        // When
        jumpTraining.train()

        // Then
        assertThat(getStandardOutContent()).contains("*** Jump training ***")
        assertThat(getStandardOutContent()).contains("Date: ${LocalDate.now()}")
        assertThat(getStandardOutContent()).contains("Time slot: Evening")
        assertThat(getStandardOutContent()).contains("Place: Alain Mimoun")
    }
}