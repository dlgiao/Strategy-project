package main

import (
	"fmt"
	"kmmania.com/strategy_go/strategy_training"
)

type Context struct {
	AthleticTraining strategy_training.AthleticTraining
}

func (ctx *Context) DoTraining() {
	fmt.Println("=== Training session ===")
	ctx.AthleticTraining.Train()
	fmt.Println("---")
}
