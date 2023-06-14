package com.hillel.homework7;

import java.util.Scanner;

public class Helper {
    public static int getInt() {
        System.out.println("Введи целое число");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    public static char getOperation() {
        System.out.println("Введи операцию (+, -, * или /) ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неправильная операция");
        }
            return result;
        }
    }