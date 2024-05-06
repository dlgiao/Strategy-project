package com.kmmania.strategy_training;

/**
 * Implementation of the {@link AthleticTraining} interface representing
 * sprint training strategy.
 * This class allows athletes to perform training sessions for sprint events.
 */
public class SprintTraining implements AthleticTraining {
    private final TrainingSession trainingSession;

    /**
     * Constructs a new instance of SprintTraining with the provided TrainingSession.
     *
     * @param trainingSession The training session details (date, time slot, place).
     */
    public SprintTraining(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    /**
     * Method to perform the sprint training strategy.
     * This method prints details of the training session, including date, time slot, and place.
     */
    @Override
    public void train() {
        System.out.println("*** Sprint training ***");
        System.out.printf("Date: %s\n", this.trainingSession.date());
        System.out.printf("Time slot: %s\n", this.trainingSession.timeSlot());
        System.out.printf("Place: %s\n", this.trainingSession.place());
    }
}
