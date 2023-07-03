package homework.Transport.Car;

import homework.Transport.Transport;

public class Car extends Transport {

    public int enginePower;
    public String brand;
    public String model;

    public Car(String type, int yearOfProduction,int enginePower, String brand, String model){
        super(type, yearOfProduction);
        this.enginePower = enginePower;
        this.brand = brand;
        this.model = model;

    }

}
