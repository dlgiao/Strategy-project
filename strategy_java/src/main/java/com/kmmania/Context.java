package com.kmmania;

import com.kmmania.strategy_training.AthleticTraining;
import com.kmmania.strategy_training.DefaultTraining;

/**
 * Context class for applying different athletic training strategies.
 * This class allows clients to set and switch between different training strategies
 * and execute training sessions accordingly.
 */
public class Context {
    private AthleticTraining athleticTraining = new DefaultTraining();

    /**
     * Sets the athletic training strategy to be used.
     *
     * @param athleticTraining The athletic training strategy to be set.
     */
    public void setAthleticTraining(AthleticTraining athleticTraining) {
        this.athleticTraining = athleticTraining;
    }

    /**
     * Executes a training session using the current athletic training strategy.
     * This method prints a header indicating the start of the training session,
     * executes the training using the current strategy, and prints a footer.
     */
    public void doTraining() {
        System.out.println("=== Training session ===");
        athleticTraining.train();
        System.out.println("---");
    }
}
