package lesson_5_loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//                                          (возращает интовое значение)
        do { System.out.println("Scanner" + scanner.nextInt());}
//             (тру или фолс - проверяет вводит ли пользователь интовое значение)
        while (scanner.hasNextInt());
        }
    }

