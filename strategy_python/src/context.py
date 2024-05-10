from src.strategy_training.DefaultTraining import DefaultTraining


class Context:
    def __init__(self):
        self.athletic_training = DefaultTraining()

    def do_training(self):
        print("=== Training session ===")
        self.athletic_training.train()
        print("---")
