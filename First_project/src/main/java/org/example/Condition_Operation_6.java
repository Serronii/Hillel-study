package org.example;

import java.util.Scanner;

public class Condition_Operation_6 {
    public static void main(String[] args) {

//    Объект класса Scanner, который позволяет нам считывать пользовательский ввод с консоли
        Scanner scanner = new Scanner(System.in);
//    Команда считывает следующее целочисленное значение, введенное пользователем
        int a = scanner.nextInt();


        if (a % 2 == 0) {
            System.out.println("Пользователь ввел четное");
        } else {
            System.out.println("Пользователь ввел не четное");


//********************************** Взаимоисключающие условия ****************************
//         1 ВАРИАНТ ГДЕ ПРОСТО ПУСТОЙ ELSE

            if (a == 0) {
                System.out.println("Ви ввели 0");
            } else {
                System.out.println("Ви ввели не 0");
//---------------------
//          2 ВАРИАНТ ГДЕ ELSE IF

                if (a == 0) {
                    System.out.println("Ви ввели 0");
                } else if (a <= 4) {
                    System.out.println("Ви ввели правильне число");
                } else if (a > 4 && a <= 7) {
                    System.out.println("Ви ввели неправильне число");
                } else if (a > 7) {
                    System.out.println("Ви ввели правильне число");

                }
//********************************** НЕ ЗАВИСИМЫЕ условия ***************************
                if (a > 0) {
                    System.out.println("a > 0");
                }
                if (a > 10) {
                    System.out.println("a > 10");
                }

            }
        }
    }
}