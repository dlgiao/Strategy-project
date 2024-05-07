/*
 * Strategy project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Strategy project in Kotlin.
 * DistanceTraining.kt
 */
package com.kmmania.strategy_training

/**
 * Implementation of the [AthleticTraining] interface representing distance training strategy.
 * This class allows training planification for distance sessions.
 *
 * @author Dac Linh Giao NGUYEN
 * @property trainingSession The training session details (date, time slot, place).
 * @constructor Constructs a new instance of DistanceTraining with the provided TrainingSession.
 * @param trainingSession The training session details (date, time slot, place).
 * @since 0.1
 * @see AthleticTraining
 */
class DistanceTraining(
    private val trainingSession: TrainingSession
) : AthleticTraining {

    /**
     * Method to perform the distance training strategy.
     * This method prints details of the training session, including date, time slot, and place.
     */
    override fun train() {
        println("*** Distance training ***")
        println("Date: ${trainingSession.date}")
        println("Time slot: ${trainingSession.timeSlot}")
        println("Place: ${trainingSession.place}")
    }
}