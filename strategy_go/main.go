package main

import (
	"kmmania.com/strategy_go/strategy_training"
	"time"
)

func main() {
	context := Context{AthleticTraining: &strategy_training.DefaultTraining{}}
	context.DoTraining()

	sprintSession := strategy_training.TrainingSession{
		Date:     time.Now(),
		TimeSlot: "Morning",
		Place:    "Insep",
	}
	context.AthleticTraining = &strategy_training.SprintTraining{
		TrainingSession: sprintSession,
	}
	context.DoTraining()

	distanceSession := strategy_training.TrainingSession{
		Date:     time.Now(),
		TimeSlot: "Evening",
		Place:    "Louis Lumiere",
	}
	context.AthleticTraining = &strategy_training.DistanceTraining{
		TrainingSession: distanceSession,
	}
	context.DoTraining()

	jumpSession := strategy_training.TrainingSession{
		Date:     time.Now(),
		TimeSlot: "Evening",
		Place:    "Alain Mimoun",
	}
	context.AthleticTraining = &strategy_training.JumpTraining{
		TrainingSession: jumpSession,
	}
	context.DoTraining()

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
