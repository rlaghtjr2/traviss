import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private static final double DELTA = 0.0001d;

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        assertEquals(6.0d, calculator.add(2, 4), DELTA);
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(-2.0d, calculator.subtract(2, 4), DELTA);
    }
    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(8.0d, calculator.multiply(2, 4), DELTA);
    }



    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        assertEquals(0.5d, calculator.divide(2, 4), DELTA);
    }
}
