package lesson_8_objects.Car;

public class Main {
    public static void main(String[] args) {

    Engine engine = new Engine(250 , "N62");
    Car car = new Car("BMW  ","black  ",engine  , 2020);
    car.printCharacteristic();
        System.out.println("___________");
        System.out.println( engine);
    }
}