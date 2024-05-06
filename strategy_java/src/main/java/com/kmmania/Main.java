package com.kmmania;

import com.kmmania.strategy_training.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.doTraining();

        TrainingSession trainingSession1 = new TrainingSession(LocalDate.now(), "Afternoon", "Pershing");
        context.setAthleticTraining(new SprintTraining(trainingSession1));
        context.doTraining();

        TrainingSession trainingSession2 = new TrainingSession(LocalDate.now(), "Morning", "Stephane Diagana");
        context.setAthleticTraining(new ThrowTraining(trainingSession2));
        context.doTraining();

        TrainingSession trainingSession3 = new TrainingSession(LocalDate.now(), "Evening", "Louis Lumiere");
        context.setAthleticTraining(new DistanceTraining(trainingSession3));
        context.doTraining();

        TrainingSession trainingSession4 = new TrainingSession(LocalDate.now(), "Evening", "Alain Mimoun");
        context.setAthleticTraining(new JumpTraining(trainingSession4));
        context.doTraining();
    }
}