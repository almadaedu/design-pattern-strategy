import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();
        calculadora.setStrategy(new Soma());
        int resultado = calculadora.executarOperacao(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        calculadora.setStrategy(new Subtracao());
        int resultado = calculadora.executarOperacao(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        calculadora.setStrategy(new Multiplicacao());
        int resultado = calculadora.executarOperacao(5, 3);
        assertEquals(15, resultado);
    }
}