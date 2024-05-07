package com.kmmania.strategy_training;

/**
 * Implementation of the {@link AthleticTraining} interface representing throw training strategy.
 * This class allows training planification for throw sessions.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class ThrowTraining implements AthleticTraining {
    private final TrainingSession trainingSession;

    /**
     * Constructs a new instance of ThrowTraining with the provided TrainingSession.
     *
     * @param trainingSession The training session details (date, time slot, place).
     */
    public ThrowTraining(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    /**
     * Method to perform the throw training strategy.
     * This method prints details of the training session, including date, time slot, and place.
     */
    @Override
    public void train() {
        System.out.println("*** Throw training ***");
        System.out.printf("Date: %s\n", this.trainingSession.date());
        System.out.printf("Time slot: %s\n", this.trainingSession.timeSlot());
        System.out.printf("Place: %s\n", this.trainingSession.place());
    }
}
