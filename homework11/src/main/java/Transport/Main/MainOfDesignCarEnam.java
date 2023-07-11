package Transport.Main;

import Transport.Car.DesignCar;
import enam.DesignCarColor;

public class MainOfDesignCarEnam {
    public static void main(String[] args) {

        DesignCar designCar = new DesignCar("Passanger",2019,"Toyota",260,"Camry",24699,"sedan", DesignCarColor.BLACK);
        DesignCar designCar1 = new DesignCar("Passanger",2019,"Toyota",260,"Camry",24699,"sedan", DesignCarColor.RED);
        DesignCar designCar2 = new DesignCar("Passanger",2019,"Toyota",260,"Camry",24699,"sedan", DesignCarColor.GRAY);
        DesignCar designCar3 = new DesignCar("Passanger",2019,"Toyota",260,"Camry",24699,"sedan", DesignCarColor.WHITE);
        DesignCar designCar4 = new DesignCar("Passanger",2019,"Toyota",260,"Camry",24699,"sedan", DesignCarColor.BLUE);

        System.out.println(DesignCarColor.RED.getName());


    }
}
