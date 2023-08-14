package org.example;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @BeforeAll  // то что должно быть выполнено перед раном всех тестов
    public static void init() {
        System.out.println("LETS GET STARTED");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Before running test");
    }


    @Test
    @Order(0)
    @DisplayName("Test summ a + b")
    public void testSum() {
        int a = 10;
        int b = 4;
        int result = 13;
        int actualResult = calculator.sum(a, b);
//        Assertions.assertTrue(result == actualResult,"Actual result : " + actualResult + ". Expected result is : " + result);
//        Assertions.assertFalse(result == actualResult,"Actual result : " + actualResult + ". Expected result is : " + result);
//        Assertions.assertEquals(result, actualResult,"Actual result : " + actualResult + ". Expected result is : " + result);
        Assertions.assertNotEquals(result, actualResult, "Actual result : " + actualResult + ". Expected result is : " + result);
    }


    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }


    @AfterAll
    public static void close() {
        System.out.println("All tests was finished");
    }

    @Test
    public void getException() {
        int a = 10;
        int b = 0;

//        Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(a , b)); //без результата ексепшена

        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(a , b)); //с результатом
        System.out.println(exception.getMessage());

        Assertions.assertEquals("/ by zero", exception.getMessage());

    }

}
