package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculatorParametrizedTest {

    private Calculator calculator = new Calculator();
//    @BeforeAll     // не работает на параметризированых тестах
//    public static void init() {
//        System.out.println("LETS GET STARTED");
//    }

    @ParameterizedTest
    @MethodSource("getValues") // бери значение из колекции getValues (ищет его по имени)
    @DisplayName("Test summ a + b")
    public void testSum(int a, int b, int result ) {
        int actualResult = calculator.sum(a, b);
        Assertions.assertTrue(result == actualResult,"Actual result : " + actualResult + ". Expected result is : " + result);
    }

    //создаем колекцию (табличку) со строками(аргументами) а, б , резалт
    public static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(2,3,5),  //1 аргумент
                Arguments.of(4,10,14) //2 аргумент
        );
    }
    @ParameterizedTest
    @CsvSource({"2,3,5",
              "4,10,14"
    })
    @DisplayName("Test summ1 a + b")
    public void testSumCSV(int a, int b, int result ) {
        int actualResult = calculator.sum(a, b);
        Assertions.assertEquals(result, actualResult,"Actual result : " + actualResult + ". Expected result is : " + result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"HEllo","World","!"})
    public void testShow(String string){
        System.out.println(string);
    }

    @Test
    public void assertAllShow(){
        Assertions.assertAll(
                () -> Assertions.assertTrue(true),
                () -> Assertions.assertFalse(true),
                () -> Assertions.assertTrue(false)
        );
    }
    @Test
    public void assertAllShow1() {
              Assertions.assertTrue(true);
              Assertions.assertFalse(true);
              Assertions.assertTrue(false);
    }
}
