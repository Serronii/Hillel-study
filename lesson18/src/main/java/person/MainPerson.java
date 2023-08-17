package person;

import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Larisa",35),
                new Person("Nastya",30),
                new Person("Natasha",29));

                  //набор методов стрим
//        personList.forEach(p -> System.out.println(p));




        personList.stream()
//                filter(p -> p.getAge() > 24 && p.getName().startsWith("T")) //фильтр возвращает стрим обьекта и поэтому юзаэем стрим фор ич
                    .forEach(person -> System.out.println(person.getName().));

        //p и person это просто переменная (обзывание ячейки)
    }
}
