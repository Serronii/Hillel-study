package com.hillel.homework;

import java.util.Random;

public class Arrays_task_3 {

    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            mas1[i] = random.nextInt(6);
            mas2[i] = random.nextInt(6);
        }
        System.out.print("Array 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println("  ");
        System.out.print("Array 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mas2[i] + " ");
        }
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < 5; i++) {
            sum1 += mas1[i];
            sum2 += mas2[i];
        }
        double average1 = sum1 / 5;
        double average2 = sum2 / 5;
        System.out.println("  ");
        if (average1 > average2) {
            System.out.println("Average array 1 > Average array 2");
        } else if (average1 < average2) {
            System.out.println("Average array 1 < Average array 2");
        } else {
            System.out.println("Average array 1 = Average array 2");
        }

    }
}
