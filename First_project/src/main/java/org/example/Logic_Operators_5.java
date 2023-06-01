package org.example;

public class Logic_Operators_5 {
    public static void main(String[] args) {

        int y = 8;
        int x = 10;

//          не проверяет остальные если 1 фолс
//                     И (&&)
                        //true     //true     //false
        boolean comb = (x > y) && (x > 0) && (y < 0);

//                     И (&)
//                       проверяет каждую операцию
        boolean comb1 = (x >y) & (x >0) & (y < 0 );
        System.out.println(comb);
        System.out.println(comb1);
//--------------------------------------------------------
//                       ИЛИ ( ||) Если одно из выражений выдает тру значит результат будет ТРУ
        // если в 1 тру то оно не будет проверять дальше
        boolean or = x < 11 || x > y;
        //  если в 1 тру то оно пойдет дальше проверять
        boolean or1 = x < 11 | x > y;
    }
}
