package com.kmmania.strategy_training;

/**
 * Implementation of the {@link AthleticTraining} interface representing
 * distance training strategy.
 * This class allows athletes to perform training sessions for distance events.
 */
public class DistanceTraining implements AthleticTraining {
    private final TrainingSession trainingSession;

    /**
     * Constructs a new instance of DistanceTraining with the provided TrainingSession.
     *
     * @param trainingSession The training session details (date, time slot, place).
     */
    public DistanceTraining(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    /**
     * Method to perform the distance training strategy.
     * This method prints details of the training session, including date, time slot, and place.
     */
    @Override
    public void train() {
        System.out.println("*** Distance training ***");
        System.out.printf("Date: %s\n", this.trainingSession.date());
        System.out.printf("Time slot: %s\n", this.trainingSession.timeSlot());
        System.out.printf("Place: %s\n", this.trainingSession.place());
    }
}
