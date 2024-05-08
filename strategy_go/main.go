package main

import (
	"kmmania.com/strategy_go/strategy_training"
	"time"
)

// main is the entry point of the program.
// demonstrates the usage of different athletic training strategies.
// creates a Context instance and executes training sessions
// using various training strategies such as sprint, distance, jump, and throw.
func main() {
	// Create a context
	context := Context{AthleticTraining: &strategy_training.DefaultTraining{}}

	// Execute default training session
	context.DoTraining()

	// Sprint session
	sprintSession := strategy_training.TrainingSession{
		Date:     time.Now(),
		TimeSlot: "Morning",
		Place:    "Insep",
	}
	context.AthleticTraining = &strategy_training.SprintTraining{
		TrainingSession: sprintSession,
	}
	context.DoTraining()

	// Distance session
	distanceSession := strategy_training.TrainingSession{
		Date:     time.Now(),
		TimeSlot: "Evening",
		Place:    "Louis Lumiere",
	}
	context.AthleticTraining = &strategy_training.DistanceTraining{
		TrainingSession: distanceSession,
	}
	context.DoTraining()

	// Jump session
	jumpSession := strategy_training.TrainingSession{
		Date:     time.Now(),
		TimeSlot: "Evening",
		Place:    "Alain Mimoun",
	}
	context.AthleticTraining = &strategy_training.JumpTraining{
		TrainingSession: jumpSession,
	}
	context.DoTraining()

	// Throw session
	throwSession := strategy_training.TrainingSession{
		Date:     time.Now(),
		TimeSlot: "Afternoon",
		Place:    "Pershing",
	}
	context.AthleticTraining = &strategy_training.ThrowTraining{
		TrainingSession: throwSession,
	}
	context.DoTraining()
}
