package calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void init() {
        System.out.println("Testing has been starting");
    }

    @Test
    @DisplayName("Test sum a + b")
    public void testSum() {
        int a = 10;
        int b = 5;
        int result = 15;
        int actualResult = calculator.sum(a, b);
        Assertions.assertEquals(result, actualResult, "Actual result : " + actualResult + ". Expected result is : " + result);

    }
    @Test
    @DisplayName("Test subtraction a - b")
    public void testSubstraction() {
        int a = 10;
        int b = 5;
        int result = 5;
        int actualResult = calculator.subtraction(a, b);
        Assertions.assertTrue(result == actualResult, "Actual result : " + actualResult + ". Expected result is : " + result);
    }
    @Test
    @DisplayName("Test multiplication a * b")
    public void multiplication() {
        int a = 10;
        int b = 5;
        int result = 50;
        int actualResult = calculator.multiplication(a, b);
        Assertions.assertTrue(result == actualResult, "Actual result : " + actualResult + ". Expected result is : " + result);
    }

    @Test
    @DisplayName("Test division a / b")
    public void div() {
        int a = 10;
        int b = 5;
        int result = 2;
        int actualResult = calculator.div(a, b);
        Assertions.assertTrue(result == actualResult, "Actual result : " + actualResult + ". Expected result is : " + result);
    }

    @Test
    @DisplayName("Test Division by 0")
    public void divisionException(){
        int a = 10;
        int b = 0;
        Exception exception = Assertions.assertThrows(ArithmeticException.class,() -> calculator.div(a, b));
        System.out.println("Division by 0 is not possible. " + "Exception message : "+ exception.getMessage());

    }
    @AfterAll
    public static void close() {
        System.out.println("All tests completed");
    }
}
