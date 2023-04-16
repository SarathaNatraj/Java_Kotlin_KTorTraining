package day10.streams;

import java.util.Arrays;
import java.util.List;





public class FilterAfterJava8 {
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
                .findAny()
                .orElse(null);

        System.out.println(result2);
        
        
        //Filter with multiple conditions
        
       

        Person resultObj = persons.stream()
                .filter(p -> "jack".equals(p.getName()) && 20 == p.getAge())
                .findAny()
                .orElse(null);

        System.out.println("result 1 :" + resultObj.getName());

        //or like this
        Person resultObject = persons.stream()
                .filter(p -> {
                    if ("abc".equals(p.getName()) && 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);

        System.out.println("result 2 :" + resultObject);
        if(resultObject!= null)
        	 System.out.println("result 2 :" + resultObject.getName());
    }

    }

