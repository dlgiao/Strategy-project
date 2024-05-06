package com.kmmania.strategy_training;

/**
 * Implementation of the {@link AthleticTraining} interface representing
 * jump training strategy.
 * This class allows athletes to perform training sessions for jump events.
 */
public class JumpTraining implements AthleticTraining {
    private final TrainingSession trainingSession;

    /**
     * Constructs a new instance of JumpTraining with the provided TrainingSession.
     *
     * @param trainingSession The training session details (date, time slot, place).
     */
    public JumpTraining(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    /**
     * Method to perform the jump training strategy.
     * This method prints details of the training session, including date, time slot, and place.
     */
    @Override
    public void train() {
        System.out.println("*** Jump training ***");
        System.out.printf("Date: %s\n", this.trainingSession.date());
        System.out.printf("Time slot: %s\n", this.trainingSession.timeSlot());
        System.out.printf("Place: %s\n", this.trainingSession.place());
    }
}
