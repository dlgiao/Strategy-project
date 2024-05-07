package strategy_training

import (
	"fmt"
	"time"
)

type AthleticTraining interface {
	Train()
}
type DefaultTraining struct{}

func (dt *DefaultTraining) Train() {
	fmt.Println("*** Default training ***")
	fmt.Println("...")
}

type TrainingSession struct {
	Date     time.Time
	TimeSlot string
	Place    string
}
