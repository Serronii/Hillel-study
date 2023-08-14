package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();
    @Test
    public void summTest(){
        int a = 10;
        int b = 11;
        int result = calculator.summ(a, b);
        Assert.assertEquals(result, 21);

    }
}
