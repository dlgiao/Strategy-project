package main

import (
	"fmt"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/mock"
	"kmmania.com/strategy_go/utils"
	"testing"
)

type AthleticTrainingMock struct {
	mock.Mock
}

func (ath *AthleticTrainingMock) Train() {
	fmt.Println("*** Sprint training ***")
	fmt.Println("Date: 2024-05-05")
	fmt.Println("Time slot: Morning")
	fmt.Println("Place: Insep")
}

func TestContext_DoTraining(t *testing.T) {
	// Given
	athleticTrainingMock := &AthleticTrainingMock{}
	athleticTrainingMock.On("Train").Return()
	ctx := Context{
		AthleticTraining: athleticTrainingMock,
	}

	// When
	output := utils.CaptureOutput(func() {
		ctx.DoTraining()
	})

	// Then
	expectedOutput := "=== Training session ===\n" +
		"*** Sprint training ***\n" +
		"Date: 2024-05-05\n" +
		"Time slot: Morning\n" +
		"Place: Insep\n" +
		"---\n"
	assert.Equal(t, expectedOutput, output, "Expected output %s, but got %s", expectedOutput, output)
}
