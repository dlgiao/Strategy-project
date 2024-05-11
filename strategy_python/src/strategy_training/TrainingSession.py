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
    Represents a training session for athletic training strategies.
    This data class encapsulates details of a training session including the date, time slot, and place.

Author: Dac Linh Giao NGUYEN
Date: 2024

"""
from dataclasses import dataclass
from datetime import datetime


@dataclass(frozen=True)
class TrainingSession:
    """
    Represents a training session for athletic training strategies.

    This data class encapsulates details of a training session including the date, time slot, and place.

    Attributes:
        date (datetime.date): The date of the training session.
        time_slot (str): The time slot of the training session.
        place (str): The location of the training session.
    """
    date: datetime.date
    time_slot: str
    place: str
