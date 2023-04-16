package day9.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;
public class SampleFunc{
    
    // to store details of the employee
    private static HashMap<Integer, String> Employee = new HashMap<>();
    // add method to add employee details to the hashmap
    public static void add(String name, int ID){
        if(!Employee.containsKey(ID)){
            Employee.put(ID,name);
        }else
            System.out.println("Employee already Registered");
    }
    
    // main method
    public static void main(String[] args){
        
        // function to get the name of the employee name from its id
        Function<Integer, String> get = (Integer ID) -> {
            if(Employee.containsKey(ID)) return Employee.get(ID);
            else
                return "Invalid ID";
        };

        
        // adding elements to the hashmap
        add("Tom Jones",1045);
        add("Nancy Smith", 1065);
        add("Deborah Sprightly", 1029);
        add("Ethan Hardy", 1025);
        
        Collection<Integer> myInts = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        Collection<Integer> onlyOdds = filter(n -> n % 2 != 0, myInts);

        for (Integer integer : onlyOdds) {
			System.out.println(integer);
		}
        System.out.println("********************************");
        //filtering odd number
        Collection<Integer> result = new ArrayList<Integer>();
        for (Integer integer : myInts) {
		//ystem.out.println(integer);
			
			if((integer.intValue()%2)!= 0){
				result.add(integer);
			}
		}
        
        for (Integer integer : result) {
			System.out.println(integer);
		}
        
        
        // using get method of Function to fetch name of the employee
        System.out.println("ID = 1029, Name = "+get.apply(1029));
    }
    public static <T> Collection<T> filter(Predicate<T> predicate,
    		Collection<T> items) {
    		Collection<T> result = new ArrayList<T>();
    		for(T item: items) {
    			if(predicate.test(item)) {
    				result.add(item);
    			}
    		}
			return result;
    	} 
}

