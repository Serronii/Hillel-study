package com.hillel.homework7;

public class Calculator {
    public static void main(String[] args) {
        int number1 = Helper.getInt();
        int number2 = Helper.getInt();
        char operation = Helper.getOperation();

        int result = Helper.calc(number1,number2,operation);
        System.out.println("Результат: " + result);

    }
}
