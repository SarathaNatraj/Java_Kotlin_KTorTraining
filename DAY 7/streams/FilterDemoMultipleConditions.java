package day7.streams;

import java.util.*;

public class FilterDemoMultipleConditions {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack34", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()
                .filter(p -> "jack".equalsIgnoreCase(p.getName()) && 20 == p.getAge())
                .findAny()
                .orElse(null);

        System.out.println("result 1 :" + result1.getName());

        //or like this
        Person result2 = persons.stream()
                .filter(p -> {
                    if ("abc".equals(p.getName()) && 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);

        System.out.println("result 2 :" + result2);
        if(result2!= null)
        	 System.out.println("result 2 :" + result2.getName());
    }


}