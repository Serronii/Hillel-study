package org.example;

import java.util.Scanner;

public class SwitchCase_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch(a){
            case 0:
                System.out.println("Вы ввели 0");
                break;
            case 1:
                System.out.println("Вы ввели 1");
            case 2:
                System.out.println("Вы ввели 2");
            case 3:
                System.out.println("Вы ввели 3");
            break;
            default:
                System.out.println("Что-то не так");
                break;
//    По сравнению с (if else) тут вы ограничены кейсами
        }
    }
}
