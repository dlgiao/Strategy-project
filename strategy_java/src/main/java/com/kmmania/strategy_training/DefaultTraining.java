package com.kmmania.strategy_training;

public class DefaultTraining implements AthleticTraining {
    @Override
    public void train() {
        System.out.println("*** Default training ***");
        System.out.println("...");
    }
}
