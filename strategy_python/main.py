from datetime import datetime

from src.context import Context
from src.strategy_training.DistanceTraining import DistanceTraining
from src.strategy_training.JumpTraining import JumpTraining
from src.strategy_training.SprintTraining import SprintTraining
from src.strategy_training.ThrowTraining import ThrowTraining
from src.strategy_training.TrainingSession import TrainingSession

if __name__ == '__main__':
    context = Context()
    context.do_training()

    sprint_training = TrainingSession(datetime.today(), "Morning", "Insep")
    context.athletic_training = SprintTraining(sprint_training)
    context.do_training()

    distance_training = TrainingSession(datetime.today(), "Evening", "Louis Lumiere")
    context.athletic_training = DistanceTraining(distance_training)
    context.do_training()

    jump_training = TrainingSession(datetime.today(), "Evening", "Alain Mimoun")
    context.athletic_training = JumpTraining(jump_training)
    context.do_training()

    throw_training = TrainingSession(datetime.today(), "Afternoon", "Pershing")
    context.athletic_training = ThrowTraining(throw_training)
    context.do_training()
