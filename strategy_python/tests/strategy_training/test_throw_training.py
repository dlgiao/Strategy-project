from datetime import date
from unittest.mock import Mock

from src.strategy_training.ThrowTraining import ThrowTraining


class TestThrowTraining:

    def setup_method(self, method):
        print(f"Setting up {method}")
        self.training_session_mock = Mock()
        self.training_session_mock.date = date(2024, 5, 10)
        self.training_session_mock.time_slot = "Afternoon"
        self.training_session_mock.place = "Pershing"
        self.throw_training = ThrowTraining(self.training_session_mock)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.training_session_mock
        del self.throw_training

    def test_train(self, capsys):
        self.throw_training.train()
        captured = capsys.readouterr()
        assert captured.out == """*** Throw training ***
Date: 2024-05-10
Time slot: Afternoon
Place: Pershing
"""
