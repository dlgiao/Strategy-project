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
	expected := "*** Default training ***\n...\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)
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
	expected := "*** Sprint training ***\n" +
		"Date: 2024-05-05\n" + // Utilisez une date fixe pour l'attente
		"Time slot: Morning\n" +
		"Place: Insep\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)
}
