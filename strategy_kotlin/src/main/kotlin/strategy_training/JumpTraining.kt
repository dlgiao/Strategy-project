/*
 * Strategy project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Strategy project in Kotlin.
 * JumpTraining.kt
 */
package com.kmmania.strategy_training

/**
 * Implementation of the [AthleticTraining] interface representing jump training strategy.
 * This class allows training planification for jump sessions.
 *
 * @author Dac Linh Giao NGUYEN
 * @property trainingSession The training session details (date, time slot, place).
 * @constructor Constructs a new instance of JumpTraining with the provided TrainingSession.
 * @param trainingSession The training session details (date, time slot, place).
 * @since 0.1
 * @see AthleticTraining
 */
class JumpTraining(
    private val trainingSession: TrainingSession
) : AthleticTraining {

    /**
     * Method to perform the jump training strategy.
     * This method prints details of the training session, including date, time slot, and place.
     */
    override fun train() {
        println("*** Jump training ***")
        println("Date: ${trainingSession.date}")
        println("Time slot: ${trainingSession.timeSlot}")
        println("Place: ${trainingSession.place}")
    }
}