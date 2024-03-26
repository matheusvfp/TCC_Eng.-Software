using NUnit.Framework;
using calculos;

namespace calculos.tests
{
    [TestFixture]
    public class CalculadoraTest
    {
        [Test]
        public void Soma_DeveRetornarOValorCorreto()
        {
            Calculadora c = new Calculadora();
            var resultado = c.Soma(10, 20);
            Assert.That(30, Is.EqualTo(resultado));
        }

        [Test]
        public void RestoDivisao_DeveRetornarOValorCorreto()
        {
            Calculadora c = new Calculadora();
            var resultado = c.RestoDivisao(10, 3);
            Assert.Multiple(() =>
            {
                Assert.That(3, Is.EqualTo(resultado.quociente));
                Assert.That(1, Is.EqualTo(resultado.resto));
            });
        }

        [TestCase(1)]
        [TestCase(2)]
        [TestCase(3)]
        public void RestoDivisao_DeveRetornarZero(int value)
        {
            Calculadora c = new Calculadora();
            var resultado = c.RestoDivisao(12, value);
            Assert.That(0, Is.EqualTo(resultado.resto));
        }

        [Test]
        public void Subtracao_DeveRetornarOValorCorreto()
        {
            Calculadora c = new Calculadora();
            var resultado = c.Subtracao(20, 10);
            Assert.That(10, Is.EqualTo(resultado));
        }

        [Test]
        public void Divisao_DeveRetornarOValorCorreto()
        {
            Calculadora c = new Calculadora();
            var resultado = c.Divisao(100, 10);
            Assert.That(10, Is.EqualTo(resultado));
        }

        [Test]
        public void Multiplicacao_DeveRetornarOValorCorreto()
        {
            Calculadora c = new Calculadora();
            var resultado = c.Multiplicacao(5, 2);
            Assert.That(10, Is.EqualTo(resultado));
        }
    }
}