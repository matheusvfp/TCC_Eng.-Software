import unittest
from Calculadora import Calculadora  

class TestCalculadora(unittest.TestCase):
    def setUp(self):
        self.calc = Calculadora()

    def test_soma(self):
        self.assertEqual(self.calc.soma(2, 3), 5)
        self.assertEqual(self.calc.soma(-2, 1), -1)
        self.assertEqual(self.calc.soma(0, 0), 0)

    def test_subtracao(self):
        self.assertEqual(self.calc.subtracao(3, 2), 1)
        self.assertEqual(self.calc.subtracao(0, 3), -3)
        self.assertEqual(self.calc.subtracao(10, 10), 0)

    def test_multiplicacao(self):
        self.assertEqual(self.calc.multiplicacao(2, 3), 6)
        self.assertEqual(self.calc.multiplicacao(0, 100), 0)
        self.assertEqual(self.calc.multiplicacao(5, -3), -15)

    def test_divisao(self):
        self.assertEqual(self.calc.divisao(6, 3), 2)
        self.assertEqual(self.calc.divisao(0, 100), 0)
        self.assertEqual(self.calc.divisao(10, -5), -2)

    def test_divisao_por_zero(self):
        with self.assertRaises(ValueError):
            self.calc.divisao(10, 0)

if __name__ == '__main__':
    unittest.main()
