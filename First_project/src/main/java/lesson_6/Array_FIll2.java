package lesson_6;

import java.util.Scanner;

public class Array_FIll2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество ячеек");
        int vvod = scanner.nextInt(); //создаем переменную на ввод
        int[] arr = new int[vvod]; //присваиваем массиву переменную

        //задаем условие чтобы заполнить ячейку через одну, нечетным числом.
        int j = 1; //создаем переменную нечетного числа от которого будем стартовать
        for (int i = 0; i< arr.length;i +=2,j +=2) {
            arr[i] = j; //указываем что первая ячейка равна 1
        }
        for (int h : arr) { //тут мы вытягиваем значение с каждой ячейки, h - название каждой ячейки
            System.out.println(h); //выводим значения ячеек

        }
    }
}
