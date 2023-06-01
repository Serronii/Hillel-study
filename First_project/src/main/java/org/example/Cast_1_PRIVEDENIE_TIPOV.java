package org.example;

public class Cast_1_PRIVEDENIE_TIPOV {
    public static void main(String[] args) {
        //Character
        char a = 'a';
        //String
        String b = "chinazes";
        //Integers
        byte c = 126;
        short d = 250;
        int i = 600;
        long l = 922337203685477806L;
        //Floating-point
        float f = 10.1234567f;
        double dd = 11.12345678901234567d;

        //        **********************ПРИВЕДЕНИЕ ТИПОВ************************

//  -------------------( ЯВНОЕ ПРЯМОЕ ПРИВЕДЕНИЕ ТИПОВ )-------------------------
//        (пихаем BYTE в INT )
        int cast_byte_to_int = c;

//         (пихаем SHORT в INT)
        int cast_short_to_int = d;

//          (пихаем Float в Int)
        int cast_Float_to_Int = (int) f;

//          (пихаем Long в INT)
        int cast_Long_to_Int = (int) l;

//          (пихаем Long в Byte)
        byte cast_Long_to_Byte = (byte) l;

//           (пихаем Float в Double)
        double cast_Float_to_Double = f;

//        (пихаем Double в Float)
        float cast_Double_To_Float = (float) dd;

//        (пихаем Int в Char ) (каждая буква имеет свой номер)
        int cast_Char_to_Int = 'a';

//-----------------------------(НЕЯВНОЕ ПРИМИНЕНИЕ ТИПОВ)------------------------------
        int x = 10;
       float y = 24.34F;

       float sum = x + y;
       //       ИЛИ
      float result = x + y;

        System.out.println(cast_Char_to_Int);

    }
}