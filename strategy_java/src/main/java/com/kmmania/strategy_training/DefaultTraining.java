package com.kmmania.strategy_training;

/**
 * Default implementation of the {@link AthleticTraining} interface.
 * This class represents the default training strategy.
 */
public class DefaultTraining implements AthleticTraining {

    /**
     * Method to perform the default training strategy.
     * This method prints a message indicating that default training
     * is being performed.
     */
    @Override
    public void train() {
        System.out.println("*** Default training ***");
        System.out.println("...");
    }
}
