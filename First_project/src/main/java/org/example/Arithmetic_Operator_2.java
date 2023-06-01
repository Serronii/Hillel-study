package org.example;

public class Arithmetic_Operator_2 {

    public static void main(String[] args) {
//      ( Присвоенные значения переменным a и b )
        int a = 10;
        int b = 12;

//***********************************ОПЕРАТОРЫ ( SUM, DIFF, Mult, DEV )**************************************
//      (Сохранение в переменную)
        int sum = a + b;

//      (Возможные варианты ВЫВОДА НА ЭКРАН АУТПУТА)
        System.out.println(sum);
        System.out.println(a+b);
        System.out.println(10+12);
//---------------------------------------------
        int diff = a - b;
        System.out.println(diff);

        int mult = a * b;
        System.out.println(mult);

        float dev = (float) a / b;
        System.out.println(dev);

//---------------------------------------------
//       % ОСТАТОК ОТ ДЕЛЕНИЯ (ЧЕТНОЕ\НЕЧЕТНОЕ)
        int c = 9;
        int d = 2;

        //        (9\2=4.1) оно берет ближайшее число которое делиться на 2 и выводит на экран остаток
        int result = c % d;

        System.out.println(result);

//-----------------------------------------------
        // DECREMENT \ INCREMEMT
        int g = 10;

        System.out.println(g--);
        System.out.println(--g);
        // response 8

        System.out.println(g++);
        System.out.println(++g);
        // response 12

        //ПРИМЕР
//        if (x >= 101 && x > 0) {
//            //уменьшаем и выводим
//            --x;
//            System.out.println(x);
//            System.out.println("число удовлетворяет условия");
//        } else if (x <= 100 && x > 0) {
//            //уменьшаем и выводим
//            --x;
//            System.out.println(x);
//            System.out.println("число не удовлетворяет условиям");
    }
}
