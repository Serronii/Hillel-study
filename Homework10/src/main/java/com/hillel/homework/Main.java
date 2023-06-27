package com.hillel.homework;

public class Main {

    public static void main(String[] args) {
      Car firstCar = new DesignCar("Passanger",2019,249,"BMW","x3","4x4","Black");
        System.out.println(firstCar.model);
        System.out.println(firstCar.brand);

        Moto firstMoto = new Moto("motocycle", 2007,1244,"choper","Honda");
        System.out.println(firstMoto.type);
        System.out.println(firstMoto.mileage);
    }
}
