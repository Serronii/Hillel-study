package org.example;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametr {
    Calculator calculator = new Calculator();

    @Parameters({"int_parametr_1", "int_parametr_2","int_parametr_3"})
    @Test
    public void testSumXML(int a, int b, int result) {
        int actualResult =calculator.summ(a,b);
        Assert.assertEquals(actualResult, result);
        System.out.println("Test result == Actual result");
    }

}