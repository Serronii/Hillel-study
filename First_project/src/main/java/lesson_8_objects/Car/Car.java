package lesson_8_objects.Car;

public class Car {

    String brand;
    String color;
    Engine engine;
    int yearOfProduction;

    public Car(String brand, String color, Engine engine, int yearOfProduction) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.yearOfProduction = yearOfProduction;
    }
    public void printCharacteristic(){
        System.out.println("Brand :" + brand + "Color :" + color + " Engine :" + engine.printEngine() + "  Production Year :" + yearOfProduction);
    }
}

