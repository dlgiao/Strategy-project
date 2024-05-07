package com.kmmania

import com.kmmania.strategy_training.AthleticTraining
import com.kmmania.strategy_training.DefaultTraining

class Context(
    private val athleticTraining: AthleticTraining = DefaultTraining()
) {
    fun doTraining() {
        println("=== Training session ===")
        athleticTraining.train()
        println("---")
    }
}