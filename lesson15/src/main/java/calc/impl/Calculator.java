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
        try {
            return a / b;
        } catch (ArithmeticException e) { // указываем вид возможного ексепшена
            System.out.println(e.getMessage());
        } catch (RuntimeException e) { //указываем второй вид возможного ексепшена
            System.out.println(e.getMessage());
        }
        return 0; // в выводе даст =  / by zero и 0 из ретьорна
    }
}
