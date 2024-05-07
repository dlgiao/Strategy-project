/*
 * Strategy project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Strategy project in Kotlin.
 * TrainingSession.kt
 */
package com.kmmania.strategy_training

import java.time.LocalDate

/**
 * Represents a training session for athletic training strategies.
 * This data class encapsulates details of a training session including the date, time slot, and place.
 *
 * @property date The date of the training session.
 * @property timeSlot The time slot of the training session.
 * @property place The place of the training session.
 * @constructor Creates a TrainingSession.
 * @param date The date of the training session.
 * @param timeSlot The time slot of the training session.
 * @param place The place of the training session.
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
data class TrainingSession(
    val date: LocalDate,
    val timeSlot: String,
    val place: String
)

