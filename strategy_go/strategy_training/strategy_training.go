// Package strategy_training defines the strategy of training
package strategy_training

import (
	"fmt"
	"time"
)

// AthleticTraining is an interface representing different athletic training strategies.
// Implementations of this interface encapsulate various training sessions.
type AthleticTraining interface {
	// Train method to perform the specific training strategy.
	// Implementing classes should define the behavior of this method
	// according to the particular training strategy they represent.
	Train()
}

// DefaultTraining is the default implementation of the AthleticTraining interface.
// This struct represents the default training strategy.
type DefaultTraining struct{}

// Train method to perform the default training strategy.
// This method prints a message indicating that default training is being performed.
func (dt *DefaultTraining) Train() {
	fmt.Println("*** Default training ***")
	fmt.Println("...")
}

// SprintTraining is an implementation of the AthleticTraining interface representing sprint training strategy.
// This struct allows training planification for sprint sessions.
type SprintTraining struct {
	// The training session details (date, time slot, place).
	TrainingSession TrainingSession
}

// Train method to perform the sprint training strategy.
// This method prints details of the training session, including date, time slot, and place.
func (st *SprintTraining) Train() {
	fmt.Println("*** Sprint training ***")
	fmt.Printf("Date: %s\n", st.TrainingSession.Date.Format("2006-01-01"))
	fmt.Printf("Time slot: %s\n", st.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", st.TrainingSession.Place)
}

// DistanceTraining is an implementation of the AthleticTraining interface representing distance training strategy.
// This struct allows training planification for distance sessions.
type DistanceTraining struct {
	// The training session details (date, time slot, place).
	TrainingSession TrainingSession
}

// Train method to perform the distance training strategy.
// This method prints details of the training session, including date, time slot, and place.
func (dt *DistanceTraining) Train() {
	fmt.Println("*** Distance training ***")
	fmt.Printf("Date: %s\n", dt.TrainingSession.Date.Format("2006-01-01"))
	fmt.Printf("Time slot: %s\n", dt.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", dt.TrainingSession.Place)
}

// JumpTraining is an implementation of the AthleticTraining interface representing jumping training strategy.
// This struct allows training planification for jumping sessions.
type JumpTraining struct {
	// The training session details (date, time slot, place).
	TrainingSession TrainingSession
}

// Train method to perform the jump training strategy.
// This method prints details of the training session, including date, time slot, and place.
func (jt *JumpTraining) Train() {
	fmt.Println("*** Jump training ***")
	fmt.Printf("Date: %s\n", jt.TrainingSession.Date.Format("2006-01-01"))
	fmt.Printf("Time slot: %s\n", jt.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", jt.TrainingSession.Place)
}

// ThrowTraining is an implementation of the AthleticTraining interface representing throwing training strategy.
// This struct allows training planification for throwing sessions.
type ThrowTraining struct {
	// The training session details (date, time slot, place).
	TrainingSession TrainingSession
}

// Train method to perform the throw training strategy.
// This method prints details of the training session, including date, time slot, and place.
func (tt *ThrowTraining) Train() {
	fmt.Println("*** Throw training ***")
	fmt.Printf("Date: %s\n", tt.TrainingSession.Date.Format("2006-01-01"))
	fmt.Printf("Time slot: %s\n", tt.TrainingSession.TimeSlot)
	fmt.Printf("Place: %s\n", tt.TrainingSession.Place)
}

// TrainingSession represents a training session for athletic training strategies.
// This struct encapsulates details of a training session including the date, time slot, and place.
type TrainingSession struct {
	Date     time.Time
	TimeSlot string
	Place    string
}
