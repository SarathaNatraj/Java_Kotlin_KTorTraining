package day7.streams;

import java.util.Arrays;
import java.util.List;

public class FilterDemoExampleAfterJava8 {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()                        // Convert to steam
                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

        System.out.println(result1.getAge()+" "+result1.getName());
        
        Person result2 = persons.stream()
                .filter(x -> "abc".equals(x.getName()))
                .findAny().orElse(null);


        System.out.println(result2);

    }

}
