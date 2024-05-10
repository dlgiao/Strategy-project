from datetime import date
from unittest.mock import Mock

from src.strategy_training.SprintTraining import SprintTraining


class TestSprintTraining:
    def setup_method(self, method):
        print(f"Setting up {method}")
        self.training_session_mock = Mock()
        self.training_session_mock.date = date(2024, 5, 10)
        self.training_session_mock.time_slot = "Morning"
        self.training_session_mock.place = "Insep"
        self.sprint_training = SprintTraining(self.training_session_mock)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.training_session_mock
        del self.sprint_training

    def test_train(self, capsys):
        self.sprint_training.train()
        captured = capsys.readouterr()
        assert captured.out == """*** Sprint training ***
Date: 2024-05-10
Time slot: Morning
Place: Insep
"""
