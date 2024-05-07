package com.kmmania.strategy_training

class SprintTraining(
    private val trainingSession: TrainingSession
) : AthleticTraining {
    override fun train() {
        println("*** Sprint training ***")
        println("Date: ${trainingSession.date}")
        println("Time slot: ${trainingSession.timeSlot}")
        println("Place: ${trainingSession.place}")
    }
}