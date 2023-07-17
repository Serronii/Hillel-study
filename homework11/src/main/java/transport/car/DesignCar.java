package transport.car;

import enam.DesignCarColor;

public final class DesignCar extends Car {

    private String bodyType;
    private DesignCarColor color;


    public DesignCar(String type, int yearOfProduction, String brand, int enginePower, String model, int price, String bodyType, DesignCarColor color) {
        super(type, yearOfProduction, brand, enginePower, model, price);
        this.bodyType = bodyType;
        this.color = color;
    }
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public String getBodyType(){
        System.out.println(this.bodyType);
        return bodyType;
    }
    public DesignCarColor getColor(){
        System.out.println(this.color);
        return color;
    }
    @Override
    public String toString(){
        return bodyType + " " + color + " " + getPrice() + " " + getYearOfProduction();
    }
        public int calculatePriceWithTax(){
        int taxPerColor = this.color.getTaxPerColor();
        return taxPerColor + getPrice();
    }
}