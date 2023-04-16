package day10.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst
{
    public static void main(String[] args) 
    {
        List<Integer> listOfNumber = Arrays.asList(10, 5, 6, 11, 8);
        
        List<String> names = new ArrayList<String>();
        names.add("RAM");
        names.add("Ravi");
        names.add("Sham");
        names.add("Shiv");
        names.add("Raman");
        
        // Finding the first element from Stream
        Optional<Integer> number = listOfNumber.stream().findFirst();
        if(number.isPresent())
            System.out.println("First element from Stream : "+ number.get());
        else
            System.out.println("Stream is empty");
        
        
        //pipelined operations - 1. filter, 2. findFirst
        //filter - based on condition, we are coonstructing array list
        //findFirst - return first element 
        // Find first name start with R
        Optional<String> nameFrom = names.stream().filter(s -> s.startsWith("R")).findFirst();
        if(nameFrom.isPresent())
            System.out.println("Name start from R:"+nameFrom.get());
        else
            System.out.println("There is not name start from R:"+nameFrom.get());
    }

}
