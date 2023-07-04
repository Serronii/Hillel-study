package Transport.Car;

import Transport.Abstraction.Transport;

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
    public void printCar(){
        System.out.println("Brand of Car " + brand);
    }
}
