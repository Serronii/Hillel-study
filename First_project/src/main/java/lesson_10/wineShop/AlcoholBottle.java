package lesson_10.wineShop;

public abstract class AlcoholBottle {
    //от абстракного класа НЕ можно создать обьект, Только наследуемся
    int alcoholProcent;
    String name;

    // ЕСЛИ создаем конструктор с параметрами ((паблик не обьязательно писать)), то дефолтный теряется
    public AlcoholBottle(int alcoholProcent, String name) {
        this.alcoholProcent = alcoholProcent;
        this.name = name;

    }
    //Если мы НЕ создаем конструктор, у нас он есть дефолтный под капотом
    public AlcoholBottle(){} //вот так он выглядит
}

