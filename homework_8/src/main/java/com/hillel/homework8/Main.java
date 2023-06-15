package com.hillel.homework8;

public class Main {

    public static void main(String[] args) {
        Forecast forecast = new Forecast(2.3,"недели");
        Arestovich arestovich = new Arestovich(47,"Украины","Блоггер", forecast);
        arestovich.printReview();

        System.out.println("_________________");

        Arestovich arestovich1 = new Arestovich(47,"Мужчина");
        arestovich1.printReview2();

    }
}
