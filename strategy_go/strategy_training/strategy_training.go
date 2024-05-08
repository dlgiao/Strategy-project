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

type SprintTraining struct {
	TrainingSession TrainingSession
}

func (st *SprintTraining) Train() {
	fmt.Println("*** Sprint training ***")
	fmt.Printf("Date: %s\n", st.TrainingSession.Date.Format("2006-01-01"))
	fmt.Printf("Time slot: %s\n", st.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", st.TrainingSession.Place)
}

type DistanceTraining struct {
	TrainingSession TrainingSession
}

func (dt *DistanceTraining) Train() {
	fmt.Println("*** Distance training ***")
	fmt.Printf("Date: %s\n", dt.TrainingSession.Date.Format("2006-01-01"))
	fmt.Printf("Time slot: %s\n", dt.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", dt.TrainingSession.Place)
}

type JumpTraining struct {
	TrainingSession TrainingSession
}

func (jt *JumpTraining) Train() {
	fmt.Println("*** Jump training ***")
	fmt.Printf("Date: %s\n", jt.TrainingSession.Date.Format("2006-01-01"))
	fmt.Printf("Time slot: %s\n", jt.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", jt.TrainingSession.Place)
}

type ThrowTraining struct {
	TrainingSession TrainingSession
}

func (tt *ThrowTraining) Train() {
	fmt.Println("*** Throw training ***")
	fmt.Printf("Date: %s\n", tt.TrainingSession.Date.Format("2006-01-01"))
	fmt.Printf("Time slot: %s\n", tt.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", tt.TrainingSession.Place)
}

type TrainingSession struct {
	Date     time.Time
	TimeSlot string
	Place    string
}