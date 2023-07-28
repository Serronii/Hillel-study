package example.list;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> list = new java.util.LinkedList<>(); // ОЬБЕКТ LinkedList Унаследывает только методы интерфейса LIST
//        list.add("Hello");
//        list.add("World");
//        list.add("!");
//        list.add(0, "Mraz'");
//
//        System.out.println(list);
//        System.out.println(list.get(0));
//        list.remove("World");
//        System.out.println(list.get(1));

        System.out.println("--------------------");
        java.util.LinkedList<String> list2 = new java.util.LinkedList<>(list); //ОБЬЕКТ LinkedList Унаследывает методы 2 интерфейсов - List и Queue
        list2.addFirst("First");
        System.out.println(list2);
    }
}
