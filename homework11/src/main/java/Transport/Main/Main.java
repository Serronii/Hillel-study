package Transport.Main;

import Transport.Abstraction.Transport;
import Transport.Car.Car;
import Transport.Car.DesignCar;
import Transport.Moto.Moto;

public class Main {

    public static void main(String[] args) {

         // CLASS CAR
        Car secondCar = new Car("Passanger",2013,"BMW",200,"X3",5000);
        secondCar.setEnginePower(230);
        secondCar.getEnginePower();
        System.out.println("           ");

        secondCar.getBrand();
        secondCar.getModel();
        System.out.println("           ");

        System.out.println(secondCar); //это toString метод
        System.out.println("           ");

        secondCar.setEnginePower(240);
        System.out.println("If Engine Power is " + secondCar.getEnginePower() + " = Price Car will be from " + secondCar.calculatePrice() + "$");
        System.out.println("           ");

        System.out.println("------------------------------------------------------------------------------------------------");

        // CLAS DESIGN CAR
        DesignCar firstCar = new DesignCar("Passanger",2019,"BMW",300,"x3","SUV","Black",3000);
        firstCar.setBodyType("Coupe");
        firstCar.getBodyType();
        System.out.println("           ");

        firstCar.getColor();
        System.out.println("              ");

        System.out.println(firstCar);// toString метод
        System.out.println("              ");
        System.out.println("------------------------------------------------------------------------------------------------");

        // CLASS MOTO
        Moto firstMoto = new Moto("Motocycle", 2023,0,"choper","Honda",15000);

        firstMoto.setBodyMoto(null);
        firstMoto.getBodyMoto();
        System.out.println("           ");

        firstMoto.setBrandMoto("VW");
        firstMoto.getMakeMoto();
        System.out.println("           ");

        firstMoto.getMileage();
        System.out.println("           ");

        System.out.println(firstMoto); // toString метод
        System.out.println("           ");

        firstMoto.setMileage(4450);
        System.out.println("Mileage " + firstMoto.getMilleage() + " = Price moto " + firstMoto.calculatePrice() + "$");
        System.out.println("           ");



    }
}
