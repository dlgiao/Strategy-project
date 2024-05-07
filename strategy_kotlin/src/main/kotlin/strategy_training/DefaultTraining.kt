/*
 * Strategy project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Strategy project in Kotlin.
 * DefaultTraining.kt
 */
package com.kmmania.strategy_training

/**
 * Default implementation of the [AthleticTraining] interface.
 * This class represents the default training strategy.
 *
 * @author Dac Linh Giao NGUYEN
 * @constructor Constructs a new instance of DefaultTraining.
 * @since 0.1
 * @see AthleticTraining
 */
class DefaultTraining : AthleticTraining {

    /**
     * Method to perform the default training strategy.
     * This method prints a message indicating that default training is being performed.
     */
    override fun train() {
        println("*** Default training ***")
        println("...")
    }
}