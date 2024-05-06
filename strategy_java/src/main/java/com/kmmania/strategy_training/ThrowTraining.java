package com.kmmania.strategy_training;

public class ThrowTraining implements AthleticTraining {
    private final TrainingSession trainingSession;

    public ThrowTraining(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    @Override
    public void train() {
        System.out.println("*** Throw training ***");
        System.out.println("Date: " + this.trainingSession.date());
        System.out.println("Time slot: " + this.trainingSession.timeSlot());
        System.out.println("Place: " + this.trainingSession.place());
    }
}
