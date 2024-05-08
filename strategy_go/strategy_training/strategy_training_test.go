package strategy_training

import (
	"github.com/stretchr/testify/assert"
	"kmmania.com/strategy_go/utils"
	"testing"
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
