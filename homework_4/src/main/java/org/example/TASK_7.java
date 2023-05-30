package org.example;

import java.util.Scanner;

public class TASK_7 {
    public static void main(String[] args) {
//        Задача 7.
//        Если x любое число,
//        если оно как минимум трехзначное и положительное,
//                уменьшает его на 1 и выводит на экран.

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x >= 101 && x > 0) {
            //уменьшаем и выводим
            --x;
            System.out.println(x);
            System.out.println("число удовлетворяет условия");
        } else if (x <= 100 && x > 0) {
            //уменьшаем и выводим
            --x;
            System.out.println(x);
            System.out.println("число не удовлетворяет условиям");
        }
    }
}
