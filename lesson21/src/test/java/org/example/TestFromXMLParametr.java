package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestFromXMLParametr {

    @Parameters({"parametr_1", "int_parametr"})
    @Test
    public void printTest(String param, int k) {
        System.out.println(param);
        System.out.println(k);
    }

}