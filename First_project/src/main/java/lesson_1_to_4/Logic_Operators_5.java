package lesson_1_to_4;

public class Logic_Operators_5 {
    public static void main(String[] args) {

        int y = 8;
        int x = 10;

        //true     //true     //false
        boolean comb = (x > y) && (x > 0) && (y < 0);

        boolean comb1 = (x >y) & (x >0) & (y < 0 );
        System.out.println(comb);
        System.out.println(comb1);

//        ИЛИ
        boolean or = x < 11 || x > y;

    }
}
