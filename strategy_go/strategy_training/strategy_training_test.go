package strategy_training

import (
	"github.com/stretchr/testify/assert"
	"kmmania.com/strategy_go/utils"
	"testing"
	"time"
)

func TestDefaultTraining_Train(t *testing.T) {
	// Given
	defaultTraining := DefaultTraining{}

	// When
	output := utils.CaptureOutput(func() {
		defaultTraining.Train()
	})

	// Then
	expectedOutput := "*** Default training ***\n...\n"
	assert.Equal(t, expectedOutput, output, "Expected output %s, but got %s", expectedOutput, output)
}

func TestSprintTraining_Train(t *testing.T) {
	// Given
	sprintTraining := SprintTraining{
		TrainingSession: TrainingSession{
			Date:     time.Date(2024, 5, 5, 0, 0, 0, 0, time.UTC), // Utilisez une date fixe pour le test
			TimeSlot: "Morning",
			Place:    "Insep",
		},
	}

	// When
	output := utils.CaptureOutput(func() {
		sprintTraining.Train()
	})

	// Then
	expectedOutput := "*** Sprint training ***\n" +
		"Date: 2024-05-05\n" +
		"Time slot: Morning\n" +
		"Place: Insep\n"
	assert.Equal(t, expectedOutput, output, "Expected output %s, but got %s", expectedOutput, output)
}

func TestDistanceTraining_Train(t *testing.T) {
	// Given
	distanceTraining := DistanceTraining{
		TrainingSession: TrainingSession{
			Date:     time.Date(2024, 5, 5, 0, 0, 0, 0, time.UTC), // Utilisez une date fixe pour le test
			TimeSlot: "Evening",
			Place:    "Louis Lumiere",
		},
	}

	// When
	output := utils.CaptureOutput(func() {
		distanceTraining.Train()
	})

	// Then
	expectedOutput := "*** Distance training ***\n" +
		"Date: 2024-05-05\n" +
		"Time slot: Evening\n" +
		"Place: Louis Lumiere\n"
	assert.Equal(t, expectedOutput, output, "Expected output %s, but got %s", expectedOutput, output)
}

func TestJumpTraining_Train(t *testing.T) {
	// Given
	jumpTraining := JumpTraining{
		TrainingSession: TrainingSession{
			Date:     time.Date(2024, 5, 5, 0, 0, 0, 0, time.UTC), // Utilisez une date fixe pour le test
			TimeSlot: "Evening",
			Place:    "Alain Mimoun",
		},
	}

	// When
	output := utils.CaptureOutput(func() {
		jumpTraining.Train()
	})

	// Then
	expectedOutput := "*** Jump training ***\n" +
		"Date: 2024-05-05\n" +
		"Time slot: Evening\n" +
		"Place: Alain Mimoun\n"
	assert.Equal(t, expectedOutput, output, "Expected output %s, but got %s", expectedOutput, output)
}

func TestThrowTraining_Train(t *testing.T) {
	// Given
	throwTraining := ThrowTraining{
		TrainingSession: TrainingSession{
			Date:     time.Date(2024, 5, 5, 0, 0, 0, 0, time.UTC), // Utilisez une date fixe pour le test
			TimeSlot: "Afternoon",
			Place:    "Pershing",
		},
	}

	// When
	output := utils.CaptureOutput(func() {
		throwTraining.Train()
	})

	// Then
	expectedOutput := "*** Throw training ***\n" +
		"Date: 2024-05-05\n" +
		"Time slot: Afternoon\n" +
		"Place: Pershing\n"
	assert.Equal(t, expectedOutput, output, "Expected output %s, but got %s", expectedOutput, output)
}
