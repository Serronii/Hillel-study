package enam;

import Transport.Car.DesignCar;
import enam.DesignCarColor;

import java.sql.Array;
import java.util.Arrays;

public class MainOfDesignCarEnam {
    public static void main(String[] args) {

        DesignCar designCar = new DesignCar("Passanger",2019,"Toyota",260,"Camry",24699,"sedan", DesignCarColor.BLACK);
        DesignCar designCar1 = new DesignCar("Passanger",2019,"Lexus",260,"Camry",24699,"sedan", DesignCarColor.RED);
        DesignCar designCar2 = new DesignCar("Passanger",2019,"BMW",260,"Camry",24699,"sedan", DesignCarColor.GRAY);
        DesignCar designCar3 = new DesignCar("Passanger",2019,"Mercedes",260,"Camry",24699,"sedan", DesignCarColor.WHITE);
        DesignCar designCar4 = new DesignCar("Passanger",2019,"Audi",260,"Camry",24699,"sedan", DesignCarColor.BLUE);


        System.out.println("-----------------------------");
        System.out.println(DesignCarColor.RED);
//        System.out.println(DesignCarColor.RED.getName());
//        System.out.println(DesignCarColor.WHITE);
//        System.out.println(DesignCarColor.WHITE.getName());
//        DesignCarColor.BLACK.printEnum();
        System.out.println("-----------------------------");

        System.out.println(DesignCarColor.valueOf("BLUE"));

        DesignCarColor.valueOf("RED").printEnum(); //Дай мне обьект класа DesignCarColor по стринге РЕД и сделай с ним принтЕнам

        System.out.println(Arrays.toString(DesignCarColor.values())); // возвращает все обьекты Енама и пихает их в Ерей
 }

}



