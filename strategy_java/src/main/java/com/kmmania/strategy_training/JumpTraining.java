package com.kmmania.strategy_training;

public class JumpTraining implements AthleticTraining {
    private final TrainingSession trainingSession;

    public JumpTraining(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    @Override
    public void train() {
        System.out.println("*** Jump training ***");
        System.out.println("Date: " + this.trainingSession.date());
        System.out.println("Time slot: " + this.trainingSession.timeSlot());
        System.out.println("Place: " + this.trainingSession.place());
    }
}
