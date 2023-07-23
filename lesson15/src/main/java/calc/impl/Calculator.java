package calc.impl;

import calc.abstr.Calculation;

public class Calculator implements Calculation {
    @Override
    public int sum(int a, int b) {
        return a + b ;
    }

    @Override
    public int diff(int a, int b) {
        return a - b ;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override // в методе указываем обход ексепшина, чтобы он не блочил ран и просто выбило сообщение ексепшина
    public int div(int a, int b) {
        try { //начало обхода
            return a / b; //потенциально опасный код
        } catch (ArithmeticException e) { // указываем вид возможного ексепшена
            System.out.println(e.getMessage()); //вывод сообщения ексепшена

            //Мульти кетч блок  (добавление еще одного возможного ексепшена
        } catch (RuntimeException e) { //указываем второй вид возможного ексепшена
            System.out.println(e.getMessage());  //вывод сообщения ексепшена
        }
        return 0; // в выводе даст =  / by zero и 0 из ретьорна
    }
}
