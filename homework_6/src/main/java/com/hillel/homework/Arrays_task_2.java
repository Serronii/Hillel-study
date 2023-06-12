package com.hillel.homework;

public class Arrays_task_2 {
    public static void main(String[] args) {
        
        int[] arr = new int[50];
        for (int i = 0, num = 1; i < arr.length; i++, num += 2) {
            arr[i] = num;
        }
        System.out.println("Вывод : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("           ");
        System.out.println("Вывод в обратном порядке : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
