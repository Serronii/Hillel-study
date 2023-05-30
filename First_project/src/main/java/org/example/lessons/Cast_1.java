package org.example.lessons;

public class Cast_1 {
    public static void main(String[] args) {
        //Character
        char a = 'a';
        //String
        String b = "chinazes";
        //Integers
        byte c = 126;
        short d = 250;
        int i = 600;
        long l = 34242435523432425L;
        //Floating-point
        float f = 10.1234567f;
        double dd = 11.12345678901234567d;
        //Boolean
        boolean boolt = true;
        boolean boolf = false;

        int castByToInt = c;
        int castShortToInt = d;
        int castLongToInt = (int) l;
        byte castLongToByte = (byte) l;
        int castFloatToInt = (int) f;

        double castFloatToDouble = f;
        float castFoubleToFloat = (float) dd;

        System.out.println(castLongToInt);

    }
}