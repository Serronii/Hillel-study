package org.example;

import java.util.Scanner;

public class TASK_3 {
//    Задача 3.
//    Если x любое положительное двузначное число
//    Выведите на екран его десятки и еденицы (2 числа)
//    разделенные знаком «пробел», но в обратном порядке.
//    То есть для числа 45 будет выведено на экран 5 4.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ( a > 9 && a <= 99 ) {
            int des = a /10;
            int ost = a % 10;
            System.out.println(ost +" "+des);
        }
    }
}
