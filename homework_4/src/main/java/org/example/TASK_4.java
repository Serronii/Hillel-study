package org.example;

import java.util.Scanner;

public class TASK_4 {
    public static void main(String[] args) {
//        Если x любое положительное двузначное число
//        Выведите на екран его в «полном виде»: например,
//        для числа 34 это будет выглядеть как 30+4.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 10 && a <= 99) {
            int cel = (a / 10) * 10;
            int des = a % 10;

            System.out.println(cel + " + " + des);
        }
            if (a > 99) {
                System.out.println("Вы ввели неправильное число");
            }
        }
    }

