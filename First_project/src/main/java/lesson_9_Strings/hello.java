package lesson_9_Strings;

public class hello {
    public static void main(String[] args) {

        char[] arr = {'H', 'e', 'l', 'l', 'o'}; //создается массив символов
        String str = new String(arr);//создается новая строка str с использованием конструктора String(char[])
        char c = str.charAt(0);
        char c1 = arr[0];
        System.out.println(c);
        System.out.println(c1);

        //стринга = чар массиву
//        String str1 = "Hello"; //string pool
//        String str2 = new String ("Hello");//. При использовании конструктора создается объект строки в "кучe"
//        String str3 = "   Hello  ";
//
//        System.out.println(str2==str1);//"==" выступает как ссылка,а
//
//        //сравнение с учетом регистров
//        System.out.println(str1.equals(str2));//иквелс проверяет само значение (1 ВАРИАНТ)
//        System.out.println("Hello".equals("Hello"));//сравнение код символов,в каждой цифре есть код (2 ВАРИАНТ)
//
//        //сравнение без учета регистров символов
//        System.out.println("Hello".equalsIgnoreCase("Hello"));
//
//        System.out.println(str1.compareTo(str2)); //сравнивает и выдает число ( 0 = равно, - меньше, + больше
//        System.out.println(str3.trim()); //убирает пробелы

    }
}