/*
 * Strategy project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Strategy project in Kotlin.
 * AthleticTraining.kt
 */
package com.kmmania.strategy_training

/**
 * Interface representing different athletic training strategies.
 * Implementations of this interface encapsulate various training sessions.
 *
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 */
interface AthleticTraining {

    /**
     * Method to perform the specific training strategy.
     * Implementing classes should define the behavior of this method
     * according to the particular training strategy they represent.
     */
    fun train()
}