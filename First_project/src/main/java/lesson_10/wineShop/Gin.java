package lesson_10.wineShop;


// Для того чтобы унаследовать состояние для Обьекта нужно сделать екстендс Класа (можем унаследовать только 1 клас)
public class Gin extends AlcoholBottle {

    //задаем параметры для джина
    int year;
    String type;
    String [] ingredients;

    //создаем конструктор для джина с его параметрами + параметры унаследованые от алкоголь боттл
    public Gin(int alcoholProcent,String name, int year, String type, String[] ingredients) {
        super(alcoholProcent, name); //супер позволяет унаследовать параметры с конструктора абстрактного класа
        this.year = year;
        this.type = type;
        this.ingredients = ingredients;

  }

}
