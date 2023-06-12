package lesson_1_to_4;

public class Comparison_Operators_4 {


    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        boolean bool1 = a < b;
        boolean bool2 = a > b;
        boolean bool3 = a == b;
        boolean bool4 = a != b;

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
        System.out.println(bool4);

//        strict

        boolean b0 = a <= b;
        boolean b1 = a >= b;

        System.out.println(b0);
        System.out.println(b1);
    }
}


