package com.kmmania.strategy_training;

import java.time.LocalDate;

/**
 * Represents a training session for athletic training strategies.
 * This record encapsulates details of a training session including the date, time slot, and place.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public record TrainingSession(LocalDate date, String timeSlot, String place) {
}

