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

        // Sprint session
        TrainingSession sprintSession = new TrainingSession(
                LocalDate.now(),
                "Morning",
                "Insep"
        );
        context.setAthleticTraining(new SprintTraining(sprintSession));
        context.doTraining();

        // Distance session
        TrainingSession distanceSession = new TrainingSession(
                LocalDate.now(),
                "Evening",
                "Louis Lumiere"
        );
        context.setAthleticTraining(new DistanceTraining(distanceSession));
        context.doTraining();

        // Jump session
        TrainingSession jumpSession = new TrainingSession(
                LocalDate.now(),
                "Evening",
                "Alain Mimoun"
        );
        context.setAthleticTraining(new JumpTraining(jumpSession));
        context.doTraining();

        // Throw session
        TrainingSession throwSession = new TrainingSession(
                LocalDate.now(),
                "Afternoon",
                "Pershing"
        );
        context.setAthleticTraining(new ThrowTraining(throwSession));
        context.doTraining();
    }
}
