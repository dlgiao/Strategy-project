from abc import ABC, abstractmethod


class AthleticTraining(ABC):
    @abstractmethod
    def train(self):
        pass
