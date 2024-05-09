from src.strategy_training.AthleticTraining import AthleticTraining


class DistanceTraining(AthleticTraining):
    def __init__(self, training_session):
        self.training_session = training_session

    def train(self):
        print("*** Distance training ***")
        print("Date: {}".format(self.training_session.date))
        print("Time slot: {}".format(self.training_session.time_slot))
        print("Place: {}".format(self.training_session.place))
