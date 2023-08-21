package calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    public void sumTest(){
        int a = 10;
        int b = 2;
        int result = 12;
        int actualResult = calculator.sum(a, b);
        Assert.assertEquals(result, actualResult);
        System.out.println("Sum test a + b");
    }

}
