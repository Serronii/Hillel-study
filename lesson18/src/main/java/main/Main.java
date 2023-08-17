package main;

import functionalinterface.PrintKAL;
import person.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Pidoru");

        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(str -> System.out.println(str));

    }
    //вызов метода из анонимного класа
    PrintKAL printKAL123 = () -> System.out.println("idu naxyu");
}
