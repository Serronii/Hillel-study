package main;

import compatarors.CompareByAge;
import person.Person;

import java.awt.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {

        List<Person> personList = List.of(new Person("Larisa",35),
                new Person("Nastya",30),new Person("Natasha",29));

        Comparator<Person> comparator1 = new CompareByAge(); // тут создаем обьект класа
        Collections.sort(personList,comparator1);


        Collections.sort(personList,Comparator.comparing(p -> p.getName())); // второй способ сортировки


    }
}
