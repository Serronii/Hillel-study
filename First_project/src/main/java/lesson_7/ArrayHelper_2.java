package lesson_7;

public class ArrayHelper_2 {
    public static void printArray(int[] arr) {      // int - тип метода, arr - це не название массива, це рандомне название параметра для массивов
        for (int p : arr) {
            System.out.println(p);
        }
    }

    public static int getArrayValueSum(int[] arr) {
        int x = 0;
        for (int p : arr) {
            x = x + p;
        }
        return x;
    }
//              В методе может быть 2 параметра (инт арр, инт х)
    public static int getArrayValueSum(int[] arr, int x) {
        x = 10;
             for (int p : arr) {
            x = x + p;
        }
        return x;
    }
    }
