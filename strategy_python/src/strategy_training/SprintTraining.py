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
    Implementation of the AthleticTraining interface representing sprint training strategy.
    This class allows training planification for sprint sessions.

Author: Dac Linh Giao NGUYEN
Date: 2024

"""
from src.strategy_training.AthleticTraining import AthleticTraining


class SprintTraining(AthleticTraining):
    """
    Implementation of the AthleticTraining interface representing sprint training strategy.

    This class allows training planification for sprint sessions.

    Attributes:
        training_session (TrainingSession): Details of the training session including date, time slot, and place.

    Methods:
        train(): Method implementing the sprint training behavior.
    """

    def __init__(self, training_session):
        """
        Initialize the SprintTraining instance.

        Args:
            training_session (TrainingSession): Details of the training session including date, time slot, and place.
        """
        self.training_session = training_session

    def train(self):
        """
        Perform sprint training.

        Prints information about the training session.
        """
        print("*** Sprint training ***")
        print(f"Date: {self.training_session.date}")
        print(f"Time slot: {self.training_session.time_slot}")
        print(f"Place: {self.training_session.place}")
