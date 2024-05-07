package strategy_training

import "fmt"

type AthleticTraining interface {
	Train()
}
type DefaultTraining struct{}

func (dt *DefaultTraining) Train() {
	fmt.Println("*** Default training ***")
	fmt.Println("...")
}
