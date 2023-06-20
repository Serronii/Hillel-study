package lesson_8_objects.Car;

public class Engine {
    int horsePower;
    String brandName;

    public Engine(int horsePower, String brandName) {
        this.horsePower = horsePower;
        this.brandName = brandName;
    }

    public String printEngine() {
        return (" Horse Power " + horsePower + " Brand Name " + brandName +";");

    }

}