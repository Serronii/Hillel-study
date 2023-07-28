package example.list;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> myFirstlist = new java.util.ArrayList<>();
        myFirstlist.add("Hello"); //0 индекс
        myFirstlist.add("World"); //1 индекс
        myFirstlist.add("!"); // 2 index
//        System.out.println(myFirstlist.get(1));

//        myFirstlist.set(0, "1іік"); //переписывает значение индекса 0
//        System.out.println(myFirstlist.get(0));

        myFirstlist.remove("Hello"); // удаление по значению, и на этот индекс сьежает значение что было выше
        //если у нас 2 одинаковых значения hello в 2 индексах оно удалит то что первое

        myFirstlist.remove(0); //удаление значения которое сьехало выше.


        System.out.println(myFirstlist.get(0)); //и таким образом на 0 индексе выведет значение которое было на 2 индексе,
        //так как мы удалили 2 предыдущих
        System.out.println(myFirstlist.size());// amount of indexes
        System.out.println(myFirstlist.contains("Hello")); //проверка содержания
        System.out.println(myFirstlist.isEmpty());


        List<String> newArr = new java.util.ArrayList<>(myFirstlist); // создание нового обьекта(листа) и переносим туда все ссылки со старого

        System.out.println(newArr.equals(myFirstlist));
        System.out.println(newArr.get(0));


    }
}
