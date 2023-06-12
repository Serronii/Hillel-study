package lesson_6;

import java.util.Random;
import java.util.Scanner;

public class ARRAY_FILL3_RANDOM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество ячеек");
        int vvod = scanner.nextInt();
        int[] arr = new int[vvod];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(40);
        }
        for (int h : arr) {
            System.out.println(h);

        }
    }
}

