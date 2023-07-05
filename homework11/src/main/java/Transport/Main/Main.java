package Transport.Main;

import Transport.Abstraction.Transport;
import Transport.Car.Car;
import Transport.Car.DesignCar;
import Transport.Moto.Moto;

public class Main {

    public static void main(String[] args) {

         // CLASS CAR
        Car secondCar = new Car("Passanger",2013,200,"Toyota","Camry",2000);
//        secondCar.setEnginePower(230);
//        secondCar.getEnginePower();
//        System.out.println("           ");
//
//        secondCar.getBrand();
//        secondCar.getModel();
//        System.out.println("           ");

        // CLAS DESIGN CAR
        DesignCar firstCar = new DesignCar("Passanger",2019,249,"BMW","x3","SUV","Black",3000);
//        firstCar.setBodyType("Coupe");
//        firstCar.getBodyType();
//        System.out.println("           ");
//
//        firstCar.getColor();
//        System.out.println("              ");

        // CLASS MOTO
        Moto firstMoto = new Moto("Motocycle", 2023,0,"choper","Honda",15000);

//        firstMoto.setBodyMoto(null);
//        firstMoto.getBodyMoto();
//        System.out.println("           ");
//
//        firstMoto.setBrandMoto("VW");
//        firstMoto.getMakeMoto();
//        System.out.println("           ");
//
//        firstMoto.getMileage();

        firstMoto.setMileage(3500);
        System.out.println(firstMoto.calculatePrice());
    }
}