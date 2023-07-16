package enam;

import Transport.Car.DesignCar;
import enam.DesignCarColor;

import java.sql.Array;
import java.util.Arrays;

public class MainOfDesignCarEnam {
    public static void main(String[] args) {

        DesignCar designCar = new DesignCar("Passanger", 2019, "Toyota", 260, "Camry", 24699, "sedan", DesignCarColor.YELLOW);

        System.out.println(designCar.calculatePriceWithTax());



    }
}