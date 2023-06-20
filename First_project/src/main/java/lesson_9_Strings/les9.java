package lesson_9_Strings;

public class les9 {
    public static void main(String[] args){
        String k = "Hello";
        int x = 10;
        System.out.println(k + " " + x + " times!"); //1 вариант
        String print = String.format("%s     %d times %c",k,x,'!'); //2 вариант
        System.out.println(print);
    }
}
