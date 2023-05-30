package org.example;

import java.util.Scanner;

public class TASK_8 {

    public static void main(String[] args) {

//        Задача 8.
//        Если x любое положительное двузначное число выведите на экран что больше:
//        само это число или произведение его цифр.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a > 9 && a < 100) {
            //делите число на 10 и получаете остаток от деления (то что после запятой)
            int ed = a % 10;
            // остаток умножаем на (целое число от a БЕЗ ОСТАТКА)
            int result = ed * (a / 10);
            System.out.println(result);
            if (a > result) {
                System.out.println("число больше");
            } else {
                System.out.println("число меньше");
            }
        }

    }
}
