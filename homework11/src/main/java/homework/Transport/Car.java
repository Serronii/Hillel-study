package homework.Transport;

public class Car extends Transport {

    int enginePower;
    String brand;
    String model;

    public Car(String type, int yearOfProduction,int enginePower, String brand, String model){
        super(type, yearOfProduction);
        this.enginePower = enginePower;
        this.brand = brand;
        this.model = model;

    }

}
