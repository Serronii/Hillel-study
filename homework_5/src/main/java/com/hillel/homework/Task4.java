package com.hillel.homework;

import java.util.Scanner;

public class Task4 {
     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);
    }
}

