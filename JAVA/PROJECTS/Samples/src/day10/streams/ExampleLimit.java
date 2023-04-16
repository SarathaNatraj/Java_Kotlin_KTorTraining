package day10.streams;

import java.util.ArrayList;
import java.util.List;
public class ExampleLimit
{
    public static void main(String[] args) 
    {
        List<String> names = new ArrayList<String>();
        names.add("RAM");
        names.add("Ravi");
        names.add("Sham");
        names.add("Shiv");
        names.add("Raman");
        
        // Set up the limit of elements in Stream
        names.stream().limit(3).forEach((student) -> System.out.println("Name of Student:"+ student));
    }
}
