import org.junit.Test;
import static org.junit.Assert.assertTrue;
import  com.tau.Calculator;
public class CalculatorTest {

    @Test
    public void testAddition() {
    Calculator calculator = new Calculator();;
    calculator.add(1, 2);
    assertTrue(calculator.getResult() == 3);
    }

    @Test
    public void testSubtraction() {
        Calculator  calculator = new Calculator();
        calculator.subtract(5, 3);
        assertTrue(calculator.getResult() == 2);

    }
}
