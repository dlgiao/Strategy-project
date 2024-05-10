from datetime import datetime
from unittest.mock import Mock

from src.strategy_training.DistanceTraining import DistanceTraining


class TestDistanceTraining:

    def setup_method(self, method):
        print(f"Setting up {method}")
        self.training_session_mock = Mock()
        self.training_session_mock.date = datetime(2024, 5, 10)
        self.training_session_mock.time_slot = "Evening"
        self.training_session_mock.place = "Louis Lumiere"
        self.distance_training = DistanceTraining(self.training_session_mock)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.distance_training

    def test_train(self, capsys):
        self.distance_training.train()
        captured = capsys.readouterr()
        assert captured.out == """*** Distance training ***
Date: 2024-05-10 00:00:00
Time slot: Evening
Place: Louis Lumiere
"""
