package mapstype.main;

import mapstype.person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        Person person = new Person("Karen", 46);
        Person person1 = new Person("Tolya",30);
//        map.put("1",person);
//        map.put("1",person1); //мапа перезаписывает
//        System.out.println(map);
//        System.out.println(map.size());


        Map<Person,String> map1 = new LinkedHashMap<>();
        map1.put(person1, "Tolya");
        map1.put(person1, "Tolya2");
        map1.put(person, "Karen");
        System.out.println(map1);


    }
}
