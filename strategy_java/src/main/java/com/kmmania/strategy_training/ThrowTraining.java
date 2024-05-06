package com.kmmania.strategy_training;

public class ThrowTraining implements AthleticTraining {
    private final TrainingSession trainingSession;

    public ThrowTraining(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    @Override
    public void train() {
        System.out.println("*** Throw training ***");
        System.out.printf("Date: %s\n", this.trainingSession.date());
        System.out.printf("Time slot: %s\n", this.trainingSession.timeSlot());
        System.out.printf("Place: %s\n", this.trainingSession.place());
    }
}
