package enam;

import transport.car.DesignCar;

public class MainOfDesignCarEnam {
    public static void main(String[] args) {

        DesignCar designCar = new DesignCar("Passanger", 2019, "Toyota", 260, "Camry", 34322, "sedan", DesignCarColor.YELLOW);

        System.out.println("Price with Tax : " + designCar.calculatePriceWithTax() + "$");

    }
}