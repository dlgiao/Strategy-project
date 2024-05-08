package main

import (
	"fmt"
	"kmmania.com/strategy_go/strategy_training"
)

// Context struct for applying different athletic training strategies.
// This struct allows clients to set and switch between different training strategies
// and execute training sessions accordingly.
type Context struct {
	// The athletic training strategy to be set.
	AthleticTraining strategy_training.AthleticTraining
}

// DoTraining executes a training session using the current athletic training strategy.
// This method prints a header indicating the start of the training session,
// executes the training using the current strategy, and prints a footer.
func (ctx *Context) DoTraining() {
	fmt.Println("=== Training session ===")
	ctx.AthleticTraining.Train()
	fmt.Println("---")
}
