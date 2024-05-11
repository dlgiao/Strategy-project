"""
Strategy Training Project

This project demonstrates the implementation of various athletic training strategies using Python.

The project showcases the Strategy Design Pattern, where different training strategies are encapsulated into separate
classes implementing a common interface. It allows athletes to perform training sessions for different types of athletic
events, such as sprinting, distance running, jumping, and throwing.

Classes:
    AthleticTraining: Interface representing different athletic training strategies.
    Context: Class providing a context for executing training sessions using different strategies.
    TrainingSession: Class representing details of a training session including date, time slot, and place.
    DefaultTraining: Default implementation of the AthleticTraining interface.
    SprintTraining: Implementation of the AthleticTraining interface for sprint training.
    DistanceTraining: Implementation of the AthleticTraining interface for distance training.
    JumpTraining: Implementation of the AthleticTraining interface for jump training.
    ThrowTraining: Implementation of the AthleticTraining interface for throw training.
    Main: Contains the `main` method to demonstrate the usage of different training strategies.

Usage:
    Main class to demonstrate the usage of different athletic training strategies.
    This class creates a Context instance and executes training sessions using various training strategies such as
    sprint, distance, jump, and throw.

Author: Dac Linh Giao NGUYEN
Date: 2024

"""
from datetime import datetime

from src.context import Context
from src.strategy_training.DistanceTraining import DistanceTraining
from src.strategy_training.JumpTraining import JumpTraining
from src.strategy_training.SprintTraining import SprintTraining
from src.strategy_training.ThrowTraining import ThrowTraining
from src.strategy_training.TrainingSession import TrainingSession

if __name__ == '__main__':
    # Create a context
    context = Context()

    # Execute default training session
    context.do_training()

    # Sprint session
    sprint_training = TrainingSession(datetime.today(), "Morning", "Insep")
    context.athletic_training = SprintTraining(sprint_training)
    context.do_training()

    # Distance session
    distance_training = TrainingSession(datetime.today(), "Evening", "Louis Lumiere")
    context.athletic_training = DistanceTraining(distance_training)
    context.do_training()

    # Jump session
    jump_training = TrainingSession(datetime.today(), "Evening", "Alain Mimoun")
    context.athletic_training = JumpTraining(jump_training)
    context.do_training()

    # Throw session
    throw_training = TrainingSession(datetime.today(), "Afternoon", "Pershing")
    context.athletic_training = ThrowTraining(throw_training)
    context.do_training()
