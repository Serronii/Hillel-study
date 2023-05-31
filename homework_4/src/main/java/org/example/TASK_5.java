package org.example;

import java.util.Scanner;

public class TASK_5 {

    public static void main(String[] args) {
//        Задача 5.
//        Назовем весом числа сумму его цифр.
//        Если x любое положительное двузначное число
//        Выведите на екран его «вес».

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 10 && a <= 99) {
            int cel = a / 10;
            int des = a % 10;

            int weight = cel + des;

            System.out.println(weight);
        } else {
            System.out.println("Вы ввели некорректное число.");

        }
    }
}
