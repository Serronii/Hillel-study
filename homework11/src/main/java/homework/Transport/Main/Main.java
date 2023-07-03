package homework.Transport.Main;

import homework.Transport.Car.Car;
import homework.Transport.Car.DesignCar;
import homework.Transport.Moto.Moto;

public class Main {

    public static void main(String[] args) {
      Car firstCar = new DesignCar("Passanger",2019,249,"BMW","x3","SUV","Black");
        System.out.println(firstCar.model);
        System.out.println(firstCar.brand);
        System.out.println("              ");
        Moto firstMoto = new Moto("Motocycle", 2007,1244,"choper","Honda");
        System.out.println(firstMoto.type);
        System.out.println(firstMoto.mileage);

    }
}
