package com.kmmania;

import com.kmmania.strategy_training.AthleticTraining;
import com.kmmania.strategy_training.DefaultTraining;

public class Context {
    private AthleticTraining athleticTraining = new DefaultTraining();

    public void setAthleticTraining(AthleticTraining athleticTraining) {
        this.athleticTraining = athleticTraining;
    }

    public void doTraining() {
        System.out.println("=== Training session ===");
        athleticTraining.train();
        System.out.println("---");
    }
}
