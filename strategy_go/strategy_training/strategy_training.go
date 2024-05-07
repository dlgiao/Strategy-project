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

type DistanceTraining struct {
	TrainingSession TrainingSession
}

func (dt *DistanceTraining) Train() {
	fmt.Println("*** Distance training ***")
	fmt.Printf("Date: %s\n", dt.TrainingSession.Date)
	fmt.Printf("Time slot: %s\n", dt.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", dt.TrainingSession.Place)
}

type TrainingSession struct {
	Date     time.Time
	TimeSlot string
	Place    string
}
