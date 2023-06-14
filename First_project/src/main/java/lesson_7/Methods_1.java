package lesson_7;

public class Methods_1 {
    public static void main(String[] args) {
        int[] arr = {16, 34, 25, 66, 71};
        int[] arr1 = {90, 44, 73, 88, 2};

             //Вывод полный
//            for (int q = 0; q < arr.length; q++) {
//            System.out.println(arr[q]);
//
//            //Вывод Foreach | подходит только если прогоняем массив полностю от 0 и до конца
//            for (int h : arr) {
//                System.out.println(h);
//            }
            //Вывод Foreach + калькуляция
            int x = 0;
            for (int h : arr) {
                x = x + h;
            }
            System.out.println(x);
        }
    }