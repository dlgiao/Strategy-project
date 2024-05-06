package com.kmmania.strategy_training;

/**
 * Interface representing different athletic training strategies.
 * Implementations of this interface encapsulate various training methods
 * that can be applied to athletes.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public interface AthleticTraining {

    /**
     * Method to perform the specific training strategy.
     * Implementing classes should define the behavior of this method
     * according to the particular training strategy they represent.
     */
    void train();
}
