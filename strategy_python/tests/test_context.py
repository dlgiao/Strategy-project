from unittest.mock import Mock

from src.context import Context


class TestContext:
    def setup_method(self, method):
        print(f"Setting up {method}")
        self.athletic_training_mock = Mock()
        self.context = Context()
        self.context.athletic_training = self.athletic_training_mock

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.athletic_training_mock
        del self.context

    def test_do_training(self, capsys):
        self.context.do_training()
        self.athletic_training_mock.train.assert_called_once()
        captured = capsys.readouterr()
        assert captured.out == """=== Training session ===
---
"""
