package Transport.Car;

import Transport.Abstraction.Transport;

public class Car extends Transport {

    private int enginePower;
    private String brand;
    private String model;

    public Car(String type, int yearOfProduction, String brand, int enginePower, String model, int price) {
        super(type, yearOfProduction);
        this.enginePower = enginePower;
        this.brand = brand;
        this.model = model;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        System.out.println("EnginePower - " + this.enginePower);
        return enginePower;
    }

    public String getBrand() {
        System.out.println(this.brand);
        return brand;
    }

    public String getModel() {
        System.out.println(this.model);
        return model;
    }

    @Override
    public int calculatePrice() {
        if (enginePower >= 200) {
            int price = 10000;
            setPrice(price);
            return price;

        } else if (enginePower < 200) {
            int price = 7000;
            setPrice(price);
            return price;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Type: " + getType() + "," +
                " Year of Production: " + getYearOfProduction() + "," +
                " Engine Power: " + enginePower + "," +
                " Brand: " + brand + "," +
                " Model: " + model + "," +
                " Price: " + getPrice();
    }
}