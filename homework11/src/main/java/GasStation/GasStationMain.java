package GasStation;

import Personal.Refueller;
import Transport.Car.Car;
import Transport.Moto.Moto;

public class GasStationMain {

    public static void main(String[] args) {
        Car secondCar = new Car("Passanger",2013,"BMW",200,"X3",5000);
        Moto firstMoto = new Moto("Motocycle", 2023,0,"choper","Honda",15000);

        Refueller refueller = new Refueller();
        refueller.fill(firstMoto);
        refueller.fill(secondCar);
    }

}
