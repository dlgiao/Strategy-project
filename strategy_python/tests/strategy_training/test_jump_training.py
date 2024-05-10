from datetime import date
from unittest.mock import Mock

from src.strategy_training.JumpTraining import JumpTraining


class TestJumpTraining:
    def setup_method(self, method):
        print(f"Setting up {method}")
        self.training_session_mock = Mock()
        self.training_session_mock.date = date(2024, 5, 10)
        self.training_session_mock.time_slot = "Evening"
        self.training_session_mock.place = "Alain Mimoun"
        self.jump_training = JumpTraining(self.training_session_mock)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.training_session_mock
        del self.jump_training

    def test_train(self, capsys):
        self.jump_training.train()
        captured = capsys.readouterr()
        assert captured.out == """*** Jump training ***
Date: 2024-05-10
Time slot: Evening
Place: Alain Mimoun
"""
