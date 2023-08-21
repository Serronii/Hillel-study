package org.example;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @BeforeSuite
    public void init1(){
        calculator = new Calculator();
        System.out.println("Before suite");
    }

    @BeforeMethod
    public void beforeTestMethod(){
        System.out.println("Before Method ");
    }


    @BeforeClass // как бефор олл в джи юните
    public void init(){
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @Test
    public void summTest(){
        int a = 10;
        int b = 11;
        int result = calculator.summ(a, b);
        Assert.assertEquals(result, 21);
        System.out.println("test1");
    }

    @Test(groups = {"smoke"})
    public void summTest1(){
        int a = 10;
        int b = 11;
        int result = calculator.summ(a, b);
        Assert.assertEquals(result, 21);
        System.out.println("test2");
    }
    @Test(groups = {"regression"})
    public void divTest1(){
        int a = 10;
        int b = 2;
        int result = calculator.div(a, b);
        Assert.assertEquals(result, 5);
        System.out.println("test2");
    }
    @Test(groups = {"regression"})
    public void subtractionTest(){
        int a = 10;
        int b = 2;
        int result = calculator.subtraction(a, b);
        Assert.assertEquals(result, 8);
        System.out.println("test2");
    }


    @AfterClass
    public void afterTestClass(){
        System.out.println("After class");
    }
    @AfterMethod
    public void afterTestMethod(){
        System.out.println("After Each ");
    }

}