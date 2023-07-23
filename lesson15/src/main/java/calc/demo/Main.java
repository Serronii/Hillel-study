package calc.demo;

import calc.impl.Calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 16;
        Calculator calculator = new Calculator();

//      System.out.println(calculator.sum(a, b1));
        System.out.println(calculator.div(a, wrapMethod(scanner)));

    }

    //метод обход ексепшена без трай кетч блока (условие если 0, выбивает тест введи не 0.
    public static int getNumber(Scanner scanner) {
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println("Enter not 0");
            getNumber(scanner);
        }
        return x;

    }

    //ЭТО НЕ ЗАВЕРНУТЫЙ ЕКСПЕШН, ОН НЕ ОБРАБОТАН И БУДЕТ ВЫЛЕТАТЬ КРАСНЫМ
    // сигнатура метода    =     название +  параметр.     (предупреждение что метод с ексепшеном,типо заверни его в трай кетч).Сроус НЕ сигнатура метода
    public static int getNumberForDivision(Scanner scanner) throws IOException {
        int x = scanner.nextInt(); //Если в методе Инпут значит IO exception
        if (x == 0) {           // не заворачиваем опасный код в трай кетч
            //   выбросить ексепшн  назв екс        конструктор екс
            throw new IOException("You can`t enter on 0"); //Если в методе Инпут значит IO exception
        }
        return x;
    }

    public static int wrapMethod(Scanner scanner) {
        System.out.println("Enter not 0 number!");
        try {
            return getNumberForDivision(scanner);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return wrapMethod(scanner); //и снова запускает этот метод пока введешь не 0
        } finally {
            System.out.println("finally");
        }
    }
}