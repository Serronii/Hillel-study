package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTestPositive {
    private Calculator calculator = new Calculator();

    @BeforeClass // как бефор олл в джи юните
    public void init(){
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @Test(groups = {"smoke","regression"})
    public void summTest(){
        int a = 10;
        int b = 11;
        int result = calculator.summ(a, b);
        Assert.assertEquals(result, 21);
        System.out.println("test1");
    }
}
