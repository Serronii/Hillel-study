package gasStation;

import personal.Refueller;
import transport.car.Car;
import transport.moto.Moto;

public class GasStationMain {

    public static void main(String[] args) {
        Car secondCar = new Car("Passanger",2013,"BMW",200,"X3",5000);
        Moto firstMoto = new Moto("Motocycle", 2023,3000,3600,"choper","bmw",5000);

        Refueller refueller = new Refueller();
        refueller.fill(firstMoto);
        refueller.fill(secondCar);
    }

}
