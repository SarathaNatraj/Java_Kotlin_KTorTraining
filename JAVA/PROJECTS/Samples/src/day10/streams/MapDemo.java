package day10.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapDemo {
public static void main(String[] args) {
	

	  List<Person> persons = Arrays.asList(
              new Person("mkyong", 30),
              new Person("jack", 20),
              new Person("lawrence", 40)
      );

      String name = persons.stream()
              .filter(x -> "jack".equals(x.getName()))
              .map(Person::getName)                        //convert stream to String
              .findAny()
              .orElse("");

      System.out.println("name : " + name);

      List<Integer> collect = persons.stream()
              .map(Person::getAge)
              .collect(Collectors.toList());

      collect.forEach(System.out::println);

  }
}
