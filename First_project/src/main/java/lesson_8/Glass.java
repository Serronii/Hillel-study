package lesson_8;

public class Glass {
    // ПОЛЯ СОСТОЯНИЯ ОБЬЕКТА. ТУТ МЫ НЕ УКАЗЫВАЕМ ПЕРЕМЕННЫЕ
    int volume;
    String color;
    String material;
//---------------------------------------------------------------------------------------------------------------
//    КОНСТРУКТОРЫ

//   (модификатор доступа Public - не имеет возвращаеого значение - название как у класа Glass)
//    конструктор создаем для создание (переменных параметров) для (полей состояния)
    public Glass(int volume, String color, String material) {
        this.volume = volume;
        this.color = color;
        this.material = material;
    }
    public Glass(){} //Конструктор который ничего не сетит

    public Glass(int volume, String color) {
        this.volume = volume;
        this.color = color;
    }
//--------------------------------------------------------------------------------------------------------
//    МЕТОДЫ\ПОВЕДЕНИЕ
    public void printVolume() {
        System.out.println(volume);

    }
    public void keepWater(int volume) {
        fillGlass(volume); // МЫ МОЖЕМ ПИХАТЬ В ЛОГИКУ МЕТОДА ЕЩЕ ОДИН МЕТОД как в этом примере мы засунули клас тот что ниже
        System.out.println("Стакан Полон" + volume);
    }

    public void fillGlass(int volume1) {
        if (this.volume < volume1) {
            System.out.println("Стакан переполнен");
        }
    }
}
    
