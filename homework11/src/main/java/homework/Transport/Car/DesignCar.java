package homework.Transport.Car;

import homework.Transport.Car.Car;

public class DesignCar extends Car {

    public String bodyType;
    public String color;

    public DesignCar(String type, int yearOfProduction, int enginePower, String brand, String model, String bodyType, String color) {
        super(type, yearOfProduction, enginePower, brand, model);
        this.enginePower = enginePower;
        this.brand = brand;
        this.model = model;

    }
}