package lesson_10.wineShop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //создаем обьект используя параметры с конструктора джин
        String[] ingredients = {"Juniper"};
        Gin bulldog1 = new Gin(37,"Buldog",2003,"dry",ingredients);
        System.out.println(bulldog1.alcoholProcent);
        System.out.println(bulldog1.name);
        System.out.println(bulldog1.year);
        System.out.println(bulldog1.type);
        System.out.println(Arrays.asList(ingredients));

        Wine koblevo = new Wine(14,"Saperavi","white",2013);

        SparklingWine proseco = new SparklingWine(14,"Reisling","White", 2003,"Italia","dry");
        System.out.println(proseco.region);

//        Gin Gin = new Gin();
       //Если вызываем обьект без параметров, оно будет цеплять конструктор без параметров

    }
}
