package com.kmmania

import com.kmmania.strategy_training.*
import java.time.LocalDate

fun main() {
    // Create a context
    val context = Context()

    // Execute default training session
    context.doTraining()

    // Sprint training
    val sprintTraining = TrainingSession(
        LocalDate.now(),
        "Morning",
        "Insep"
    )
    context.athleticTraining = SprintTraining(sprintTraining)
    context.doTraining()

    // Distance training
    val distanceTraining = TrainingSession(
        LocalDate.now(),
        "Evening",
        "Louis Lumiere"
    )
    context.athleticTraining = DistanceTraining(distanceTraining)
    context.doTraining()

    // Jump training
    val jumpTraining = TrainingSession(
        LocalDate.now(),
        "Evening",
        "Alain Mimoun"
    )
    context.athleticTraining = JumpTraining(jumpTraining)
    context.doTraining()

    // Throw training
    val throwTraining = TrainingSession(
        LocalDate.now(),
        "Afternoon",
        "Pershing"
    )
    context.athleticTraining = ThrowTraining(throwTraining)
    context.doTraining()
}