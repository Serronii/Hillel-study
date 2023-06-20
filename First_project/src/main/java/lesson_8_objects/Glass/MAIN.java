package lesson_8_objects.Glass;

public class MAIN {

    public static void main(String[] args) {

                 //  CОЗДАНИЕ ОБЬЕКТА
       int x =10;
//   (название класа Glass - название- NEW название конструктора ( в скобках значение параметров конструктора)
                      Glass glass4 = new Glass(250,"black","plastic");
//                          glass4 - это ссылка на параметры (волюм,колор,материал) которые находяться в кучи (heap)
//                          System.out.println(glass4); //вывод ссылки

//      Копирование по значению (инт), оно будет передавать значение в мейне, даже если в методе есть другое значение
        printX(x);
        System.out.println(x);
        System.out.println("--------------------");

//      Копирование по ссылке (glass4), тут наоборот значение в методе обновляет значение в мейне
        changeGlassVolume(glass4);
        System.out.println(glass4.volume);

    }
    public static void printX (int x) {
        System.out.println(x);
       x = 13;
    }
    public static void changeGlassVolume (Glass g) {
        g.volume = 300;

    }
}
