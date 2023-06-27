package com.hillel.homework;

public class DesignCar extends Car {

    String bodyType;
    String color;

    public DesignCar(String type, int yearOfProduction, int enginePower, String brand, String model, String bodyType, String color) {
        super(type, yearOfProduction, enginePower, brand, model);
        this.enginePower = enginePower;
        this.brand = brand;
        this.model = model;

    }
}