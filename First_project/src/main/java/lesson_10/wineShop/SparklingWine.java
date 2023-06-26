package lesson_10.wineShop;

public class SparklingWine extends Wine {

    String region;
    String type;

    public SparklingWine(int alcoholProcent,String name, String color, int yearOfProduction, String region, String type) {
        super(alcoholProcent, name, color, yearOfProduction); //супер позволяет унаследовать параметры с конструкторов от которых зависим
        this.region = region;
        this.type = type;

    }


}
