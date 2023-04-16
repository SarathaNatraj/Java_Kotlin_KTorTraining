package day7.streams;

//a simple program to demonstrate the use of stream in java
import java.util.*;
import java.util.stream.*;

class StreamDemo {
	public static void main(String args[]) {

		
		//Example - 1 map
		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		//Example - 2 map
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

		List<Integer> listOfIntegers = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());

		System.out.println(listOfIntegers);
		
		//Example - 3 map shows distinct salary
		List<Employee> employeesList = Arrays.asList(new Employee(1, "Alex", 100), new Employee(2, "Brian", 100),
				new Employee(3, "Charles", 200), new Employee(4, "David", 200), new Employee(5, "Edward", 300),
				new Employee(6, "Frank", 300));

		//100, 100, 200, 200, 300, 300 - e.empSalary
		//100, 200, 300 - distinct salary
		List<Double> distinctSalaries = employeesList.stream().map(e -> e.getSalary()).distinct()
				.collect(Collectors.toList());

		System.out.println("DISTINCT SALARY "+distinctSalaries);

		
		
		
		// Example 1 - create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Strings");

		// Stream, Strings
		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
		//Example 2 - filtering long names
		List<String> namesList = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
		
		//Creating the stream of all names
		Stream<String> allNames = namesList.stream();
			
		//Creating another stream by filtering long names using filter()
		Stream<String> longNames = allNames.filter(str -> str.length() > 6);
			
		//displaying the long names
		longNames.forEach(str->System.out.print(str+" "));


		// demonstration of sorted method
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);

		//Example 1 - 
		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
		
		// demonstration of forEach method
				number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(squareSet);
		
		//Example 2 - Filter Map by Keys
		Map<Integer, String> hmap = new HashMap<Integer, String>(); 
	      hmap.put(11, "Apple"); 
	      hmap.put(22, "Orange"); 
	      hmap.put(33, "Kiwi");  
	      hmap.put(44, "Banana"); 

	      Map<Integer, String> resultNames = hmap.entrySet() 
	          .stream() 
	          .filter(map -> map.getKey().intValue() <= 22) 
	          .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  
	  
	      System.out.println("Result: " + resultNames);
	      
	      //Example 3 - Filter Map by Values
	      Map<Integer, String> hmapFruits = new HashMap<Integer, String>();
	      hmapFruits.put(11, "Apple");
	      hmapFruits.put(22, "Orange");
	      hmapFruits.put(33, "Kiwi");
	      hmapFruits.put(44, "Banana");

	      Map<Integer, String> resultFruits = hmapFruits.entrySet()
	      .stream()
	      .filter(map -> "Orange".equals(map.getValue()))
	      .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

	      System.out.println("Result: " + resultFruits);

	      //Example 4 - filter map by both keys & values
	      Map<Integer, String> hmapLetters = new HashMap<Integer, String>();
	      hmapLetters.put(1, "ABC");
	      hmapLetters.put(2, "XCB");
	      hmapLetters.put(3, "ABB");
	      hmapLetters.put(4, "ZIO");

	      Map<Integer, String> resultLetters = hmapLetters.entrySet()
	         .stream()
	         .filter(p -> p.getKey().intValue() <= 2) //filter by key
	         .filter(map -> map.getValue().startsWith("A")) //filter by value
	         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

	     System.out.println("Result: " + resultLetters);
	     
	     //Example 5 - filter null values
	     List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
	 	List<String> resultNotNulls = list.stream()
	 			.filter(str -> str!=null)
	 			.collect(Collectors.toList());
	 	resultNotNulls.forEach(System.out::println);      


	      
	      

		// demonstration of reduce method
		// ans,i = ans+i;

		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);
	}
}
