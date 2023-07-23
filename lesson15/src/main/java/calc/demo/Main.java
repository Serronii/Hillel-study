package calc.demo;

import calc.impl.Calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calculator calculator = new Calculator();


//        System.out.println(calculator.sum(a, b));
        System.out.println(calculator.div(a, wrapMethod(scanner)));
    }

    public static int getNumber(Scanner scanner){
        int x = scanner.nextInt();
        if (x ==0 ){
            System.out.println("Enter not 0");
            getNumber(scanner);
        }
        return x;

    }
    //ЭТО НЕ ЗАВЕРНУТЫЙ ЕКСПЕШН, ОН НЕ ОБРАБОТАН И БУДЕТ ВЫЛЕТАТЬ КРАСНЫМ
    // сигнатура метода    =     название +  параметр.      сроус не входит в сигнатуру метода
    public static int getNumberForDivision(Scanner scanner) throws IOException {
        int x = scanner.nextInt();
        if (x == 0) {
            throw new IOException("You can`t enter on 0");
        }
        return x;
    }

    public static int wrapMethod(Scanner scanner) throws IOException{
        System.out.println("Enter not 0 number!");
        try {
            return getNumberForDivision(scanner);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
          return 0;
    }

}
