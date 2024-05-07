package com.kmmania.strategy_training

class DistanceTraining(private val trainingSession: TrainingSession) : AthleticTraining {
    override fun train() {
        println("*** Distance training ***")
        println("Date: ${trainingSession.date}")
        println("Time slot: ${trainingSession.timeSlot}")
        println("Place: ${trainingSession.place}")
    }
}