package lesson_6_arrays;

import java.util.Scanner;

public class ARRAY_Fill {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество ячеек");
        int vvod = scanner.nextInt(); //создаем переменную на ввод
        int[] arr = new int[vvod]; //присваиваем массиву переменную

        for (int i = 0; i < arr.length; i++) { //делаем цикл заполнения на число ввода +1
            System.out.println("введите число заполнения");
            arr[i] = scanner.nextInt();
        }
        for(int p : arr) { //вывести заполнение идексов (чтобы не расписывать for для вывода)
            //            или расписанный вариант
//            for (int index = 0; index < arr.length; index++) {
//                int p = arr[index];
//            System.out.println("Заполнение индекса " + index + " = " + p)
            System.out.println("Заполнение индексов" + " = " + p);

        }
        System.out.println("Количество ячеек" + " = " + arr.length);
    }
}
