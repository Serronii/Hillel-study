package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestDependsOn {
    @Test(dependsOnMethods = {"test2"})
    public void test1() {
        System.out.println("test 1");
        Assert.assertEquals(1, 1);
    }

    @Test(dependsOnMethods = {"test3"})
    public void test2() {
        System.out.println("test 2");
        Assert.assertEquals(1, 1);
    }
    @Test
    public void test3() {
        System.out.println("test 3");
        Assert.assertEquals(1, 1);

    }
}