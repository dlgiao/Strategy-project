from src.strategy_training.DefaultTraining import DefaultTraining


class TestDefaultTraining:

    def setup_method(self, method):
        print(f"Setting up {method}")
        self.default_training = DefaultTraining()

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.default_training

    def test_train(self, capsys):
        self.default_training.train()
        captured = capsys.readouterr()
        assert captured.out == """*** Default training ***
...
"""
