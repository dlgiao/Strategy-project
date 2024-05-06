package com.kmmania;

import com.kmmania.strategy_training.*;

import java.time.LocalDate;

/**
 * Main class to demonstrate the usage of different athletic training strategies.
 * This class creates a Context instance and executes training sessions
 * using various training strategies such as sprint, distance, jump, and throw.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        // Create a context
        Context context = new Context();

        // Execute default training session
        context.doTraining();

        // Sprint training
        TrainingSession sprintTraining = new TrainingSession(
                LocalDate.now(),
                "Morning",
                "Insep"
        );
        context.setAthleticTraining(new SprintTraining(sprintTraining));
        context.doTraining();

        // Distance training
        TrainingSession distanceTraining = new TrainingSession(
                LocalDate.now(),
                "Evening",
                "Louis Lumiere"
        );
        context.setAthleticTraining(new DistanceTraining(distanceTraining));
        context.doTraining();

        // Jump training
        TrainingSession jumpTraining = new TrainingSession(
                LocalDate.now(),
                "Evening",
                "Alain Mimoun"
        );
        context.setAthleticTraining(new JumpTraining(jumpTraining));
        context.doTraining();

        // Throw training
        TrainingSession throwTraining = new TrainingSession(
                LocalDate.now(),
                "Afternoon",
                "Pershing"
        );
        context.setAthleticTraining(new ThrowTraining(throwTraining));
        context.doTraining();
    }
}
