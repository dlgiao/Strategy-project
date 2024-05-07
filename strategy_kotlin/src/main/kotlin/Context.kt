/*
 * Strategy project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Strategy project in Kotlin.
 * Context.kt
 */
package com.kmmania

import com.kmmania.strategy_training.AthleticTraining
import com.kmmania.strategy_training.DefaultTraining

/**
 * Context class for applying different athletic training strategies.
 * This class allows clients to set and switch between different training strategies
 * and execute training sessions accordingly.
 *
 * @author Dac Linh Giao NGUYEN
 * @constructor Sets the athletic training strategy to be used.
 * @param athleticTraining The athletic training strategy to be set.
 * @since 0.1
 * @see AthleticTraining
 * @see DefaultTraining
 */
class Context(
    var athleticTraining: AthleticTraining = DefaultTraining()
) {

    /**
     * Executes a training session using the current athletic training strategy.
     * This method prints a header indicating the start of the training session,
     * executes the training using the current strategy, and prints a footer.
     */
    fun doTraining() {
        println("=== Training session ===")
        athleticTraining.train()
        println("---")
    }
}