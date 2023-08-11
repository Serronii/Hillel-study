package parametrizedtest;

import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorParametrizedTest {
    Calculator calculator = new Calculator();
    @ParameterizedTest
    @CsvSource({"70,7,77"})
    @DisplayName("Test sum a + b")
    public void testSumCSV(int a, int b, int result) {
        int actualResult = calculator.sum(a, b);
        Assertions.assertTrue(result == actualResult,"Actual result : " + actualResult + ". Expected result is : " + result);
    }
}
