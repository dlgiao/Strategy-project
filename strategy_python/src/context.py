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
    Context class for applying different athletic training strategies.
    This class allows clients to set and switch between different training strategies and execute training sessions
    accordingly.

Author: Dac Linh Giao NGUYEN
Date: 2024

"""
from src.strategy_training.DefaultTraining import DefaultTraining


class Context:
    """
    Context class for applying different athletic training strategies.

    This class allows clients to set and switch between different training strategies and execute training sessions
    accordingly.

    Attributes:
        athletic_training (AthleticTraining): The current athletic training strategy.

    Methods:
        do_training(): Method to execute the current training strategy.
    """

    def __init__(self):
        """
        Initialize the Context instance.

        Sets the default training strategy to DefaultTraining.
        """
        self.athletic_training = DefaultTraining()

    def do_training(self):
        """
        Execute the current training strategy.

        This method performs the training session according to the current athletic training strategy.
        """
        print("=== Training session ===")
        self.athletic_training.train()
        print("---")
