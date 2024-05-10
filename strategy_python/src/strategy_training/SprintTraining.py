from src.strategy_training.AthleticTraining import AthleticTraining


class SprintTraining(AthleticTraining):
    def __init__(self, training_session):
        self.training_session = training_session

    def train(self):
        print("*** Sprint training ***")
        print(f"Date: {self.training_session.date}")
        print(f"Time slot: {self.training_session.time_slot}")
        print(f"Place: {self.training_session.place}")
