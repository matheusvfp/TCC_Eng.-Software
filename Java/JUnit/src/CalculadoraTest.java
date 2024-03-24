import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.soma(2, 3));
        assertEquals(-1, calc.soma(-2, 1));
        assertEquals(0, calc.soma(0, 0));
    }

    @Test
    public void testSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtracao(3, 2));
        assertEquals(-3, calc.subtracao(0, 3));
        assertEquals(0, calc.subtracao(10, 10));
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicacao(2, 3), 0.001);
        assertEquals(0, calc.multiplicacao(0, 100), 0.001);
        assertEquals(-15, calc.multiplicacao(5, -3), 0.001);
    }

    @Test
    public void testDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.divisao(6, 3), 0.001);
        assertEquals(0, calc.divisao(0, 100), 0.001);
        assertEquals(-2, calc.divisao(10, -5), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        calc.divisao(10, 0);
    }
}
