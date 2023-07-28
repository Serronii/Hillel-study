package example.set;

import realisation.Person;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Gamargoba");

        Set<Person> people = new HashSet<>(); // people это переменная(колекция) обьектов(полей) класа Person
        people.add(new Person("Taras",23));
        people.add(new Person("EVKAKIY",24));
        people.add(new Person("Taras",23));

        System.out.println("--------------------");
        Person p1 = new Person("Taras",23);
        Person p2 = new Person("Taras",23);
        System.out.println(p1.equals(p2));

        System.out.println(people);
        System.out.println("--------------------");
        System.out.println("--------------------");

        for(Person p : people) {
            System.out.println(p);
        }
    }
}
