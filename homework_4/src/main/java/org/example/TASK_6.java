package org.example;

import java.util.Scanner;

public class TASK_6 {
    public static void main(String[] args) {
//        Задача 6.
//        Если x любое число,выведите на экран одно из следующих сообщений:
//        Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Вы ввели положительное число");
        } else if (a == 0) {
            System.out.println("Вы ввели ноль");
        } else if (a < 0) {
            System.out.println("Вы ввели отрицательное число");
        }
    }
}
