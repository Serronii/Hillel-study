package Transport.Main;

import Transport.Car.Car;
import Transport.Car.DesignCar;
import Transport.Moto.Moto;

public class Main {

    public static void main(String[] args) {

         // CLASS CAR
        Car secondCar = new Car("Passanger",2013,200,"Toyota","Camry");

        secondCar.printCar();
        System.out.println("           ");

        // CLAS DESIGN CAR
        Car firstCar = new DesignCar("Passanger",2019,249,"BMW","x3","SUV","Black");
        firstCar.set

        System.out.println("              ");

        // CLASS MOTO
        Moto firstMoto = new Moto("Motocycle", 2007,1244,"choper","Honda");

        firstMoto.setBodyMoto(null);
        System.out.println(firstMoto.getBodyMoto());
        System.out.println("           ");

        firstMoto.setMakeMoto("VW");
        System.out.println(firstMoto.getMakeMoto());
        System.out.println("           ");

        firstMoto.getMileage();
    }
}
