package Transport.Car;

import Transport.Car.Car;

public final class DesignCar extends Car {

    private String bodyType;
    private String color;


    public DesignCar(String type, int yearOfProduction, String brand, int enginePower, String model, String bodyType, String color,int price) {
        super(type, yearOfProduction, brand, enginePower, model,price);
          this.bodyType =bodyType;
          this.color = color;
    }
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public String getBodyType(){
        System.out.println(this.bodyType);
        return bodyType;
    }
    public String getColor(){
        System.out.println(this.color);
        return color;
    }
    @Override
    public String toString(){
        return bodyType + " " + color;
    }
}