package strategy_training

import com.kmmania.strategy_training.SprintTraining
import com.kmmania.strategy_training.TrainingSession
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import java.time.LocalDate

class SprintTrainingTest : BaseTrainingTest() {
    @Test
    fun `train() method should print SprintTraining content`() {
        // Given
        val trainingSessionMock = mock(TrainingSession::class.java)
        `when`(trainingSessionMock.date).thenReturn(LocalDate.now())
        `when`(trainingSessionMock.timeSlot).thenReturn("Morning")
        `when`(trainingSessionMock.place).thenReturn("Insep")
        val sprintTraining = SprintTraining(trainingSessionMock)

        // When
        sprintTraining.train()

        // Then
        assertThat(getStandardOutContent()).contains("*** Sprint training ***")
        assertThat(getStandardOutContent()).contains("Date: ${LocalDate.now()}")
        assertThat(getStandardOutContent()).contains("Time slot: Morning")
        assertThat(getStandardOutContent()).contains("Place: Insep")
    }
}