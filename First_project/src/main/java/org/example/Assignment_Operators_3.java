package org.example;

public class Assignment_Operators_3 {


    public static void main(String[] args) {
        int a = 10;
        a = a + 8;

        //short cut
        a = a + 3;
        a += 3;
        a -= 3;
        a *= 3;
        a /= 2;
        a %= 2;

        System.out.println(a);
    }

}