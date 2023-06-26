package lesson_10.wineShop;

public class Wine extends AlcoholBottle {

    String color;

    int yearOfProduction;


    public Wine(int alcoholProcent,String name, String color, int yearOfProduction) {
        super(alcoholProcent, name); //супер позволяет унаследовать параметры с конструктора абстрактного класа
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }



}
