package com.kmmania.strategy_training

class JumpTraining(private val trainingSession: TrainingSession) : AthleticTraining {
    override fun train() {
        println("*** Jump training ***")
        println("Date: ${trainingSession.date}")
        println("Time slot: ${trainingSession.timeSlot}")
        println("Place: ${trainingSession.place}")
    }
}