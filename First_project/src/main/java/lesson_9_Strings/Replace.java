package lesson_9_Strings;

public class Replace {

    public static void main(String[] args) {
        String k = "Hello ";
        //реплейс заменяет символы
        String m = k.replace ('o','e').trim(); //нужно создать новую переменную куда будет записан результат
//        System.out.println(m);
        char c = k.charAt(1);
//        System.out.println(c);

        //сравнение без учета регистров символов
//        System.out.println("Hello".equalsIgnoreCase("Hello"));


        String price = "670 $";
        char[] priceChar = {'6','7','0',' ','$'}; //как выглядит эта стринга под капотом

//        System.out.println(price.endsWith("$")); // проверяет символы в массиве\стринге cправа на лево^
//        System.out.println(price.startsWith("6")); // проверяет символы в массиве\стринге cлева на право

        String price1 = "1000 ";
        System.out.println(price1.contains("$")); //проверка тру фолс

        int indexPosition = price1.indexOf("1");
        System.out.println(indexPosition); //выведет 0, то есть на 0 индексе начинается символ 1
        


    }
}
