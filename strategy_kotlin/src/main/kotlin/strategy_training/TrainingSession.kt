package com.kmmania.strategy_training

import java.time.LocalDate

data class TrainingSession(
    val date: LocalDate,
    val timeSlot: String,
    val place: String
)
