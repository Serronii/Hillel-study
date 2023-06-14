package lesson_7;

public class Printer_3 {
    public static void main(String[] args) {
        int[] arr = {6, 23, 55, 467, 4};
        int[] arr2 = {32, 11, 64, 124, 53};

//      Пишем название класа "ArrayHelper" + в котором лежит метод "printArray" + (название массива)
//        ArrayHelper_2.printArray(arr2);
//        ArrayHelper_2.printArray(arr);
//
//        Вывод метода
//        int XY = ArrayHelper_2.getArrayValueSum(arr);
//        System.out.println(XY);

//        Вывод того же метода только с другим параметром (перегрузка)
          int y = ArrayHelper_2.getArrayValueSum(arr2,0);
          System.out.println(y);

//          Если мы хотим просто вывести результат метода и не работать с этим значением дальше, то можно вынести без
//                переменной -просто вставить название метода в принтИн
          System.out.println(ArrayHelper_2.getArrayValueSum(arr2,0));

    }
}