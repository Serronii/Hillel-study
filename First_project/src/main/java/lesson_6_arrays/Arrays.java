package lesson_6_arrays;

public class Arrays {
    public static void main(String[] args) {
/////////////////////////////////////////////////////////
//        Создание массива
//        int[] arr = new int[5]; //5 ячейка имеет индекс 4, так как начинаем не с 1 а с 0
//
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 69;
//        arr[3] = 27;
//        arr[4] = 31;

//        ИЛИ МОЖНО ТАК

//        int[] arr1 = {2, 3, 4, 6, 776};
//        System.out.println(arr1);
//////////////////////////////////////////////////////////
//       Вывод массива

//            for (int i = 0; i <= 4; i++) {
//            System.out.println(arr[i]);

//            или можно написать
//                               (5 ячейка)
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//////////////////////////////////////////////////////////
        //перезапись массива
        int[] arr3 = {2, 35, 4, 20, 77};
        arr3[3] = 25;

        for (int i = 0; i < arr3.length; i++) {

            System.out.println(arr3[i]);//вывод значений индексов(ячеек)

        }
    }
}