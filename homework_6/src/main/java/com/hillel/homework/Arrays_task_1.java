package com.hillel.homework;

public class Arrays_task_1 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0, num = 2; i < arr.length; i++, num += 2) {
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.println(num + " ");
        }
    }
}
