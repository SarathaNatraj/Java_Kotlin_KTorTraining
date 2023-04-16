package day7.streams;

import java.util.Arrays;
import java.util.List;

public class FilterFindAnyExampleBeforeJava8 {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
                 );

        Person result = getStudentByName(persons, "jack");
        System.out.println(result.getName() + result.getAge());

    }

    private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equalsIgnoreCase(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
}