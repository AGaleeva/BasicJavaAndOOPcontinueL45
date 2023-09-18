package homework44_OV;

import java.util.*;

public class MapListToPersons {
    /*
    ** Задача 2 **
    Дан Map<Integer, List> - ключ возраст, значение список имен людей этого возраста.
    Необходимо получить список объектов Person{String name, int age}.

    1. Перебираем Map
    2. Перебираем List
    3. Для каждой записи создаем Person.
    */

    public static void main(String[] args) {

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(10, List.of("Jack", "John"));
        map.put(20, List.of("Jack", "Ann", "Roman"));
        map.put(30, List.of("Lena", "Nick"));

        System.out.println(mapAgeListNamesToListPerson(map));
    }

    public static List<Person> mapAgeListNamesToListPerson(Map<Integer, List<String>> map) {
        List<Person> result = new ArrayList<>();
        if (map == null) return result;
        for (Map.Entry<Integer, List<String>> e : map.entrySet()) {
            Integer age = e.getKey();
            for (String name : e.getValue()) {
                result.add(new Person(name, age));
            }
        }
        return result;
    }
}
