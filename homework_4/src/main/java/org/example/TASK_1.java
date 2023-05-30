package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TASK_1 {
    public static void main(String[] args) {

//Во многих странах для измерения небольших размеров используется не только
//единица длины «сантиметр», но и такая единица,
//как «дюйм» (1 дюйм = 2.54 сантиметра).
//Выведите в консоль 10 см,равное размеру в дюймах,
//и затем 25 дюймов,но в сантиметрах.

     double duim1_to_sant = 2.54;
     double sant = 10.0;
     double duim = 25.0;

     double sant_to_duim = sant / duim1_to_sant;
     double duim25_to_sant = duim * duim1_to_sant;

        System.out.println(sant_to_duim);
        System.out.println(duim25_to_sant);

//                      ИЛИ

        double sant10_to_duim = 10 / 2.54;
        double duim25_to_santim = 25.0 * 2.54;

        System.out.println(sant10_to_duim);
        System.out.println(duim25_to_santim);
    }
}