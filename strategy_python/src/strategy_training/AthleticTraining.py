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
    Interface representing different athletic training strategies.
    Implementations of this interface encapsulate various training sessions.

Author: Dac Linh Giao NGUYEN
Date: 2024

"""
from abc import ABC, abstractmethod


class AthleticTraining(ABC):
    """
    An abstract base class representing different athletic training strategies.

    Subclasses must implement the `train` method to define specific training behaviors.

    Methods:
        train(): Abstract method to be implemented by subclasses to define training behavior.
    """
    @abstractmethod
    def train(self):
        """
        Abstract method representing the training behavior.

        Subclasses must implement this method to define specific training behaviors.
        """
        pass
