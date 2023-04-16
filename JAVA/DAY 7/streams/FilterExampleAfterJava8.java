package day7.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExampleAfterJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "mkyong","springboot","react");
        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        //<CLASS NAME> :: <METHOD NAME>
        //
        result.forEach(System.out::println);                //output : spring, node,springboot, react
        System.out.println("With Lambda ::");
        result.forEach(s -> System.out.println(s));  
  
        }

}
