package day10.streams;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ReduceDemo {
	public static void main(String[] args) {
		//Math operations
				int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

				int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);    // 55; sum =0, sum = sum + a + b; sum = 0+1+2; sum = 3+4+5; sum = 12+6+7
				System.out.println("sum : "+sum);
				int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum);      // 55
				System.out.println(" sum2  :"+sum2);

				int sum3 = Arrays.stream(numbers).reduce(0, (a, b) -> a - b);   // -55 sum =0, sum = sum - a - b; sum = 0-1-2; sum = -3-4-5; sum = -12-6-7
				System.out.println("  sum3 :"+sum3);
				int sum4 = Arrays.stream(numbers).reduce(1, (a, b) -> a * b);   // 0, initial is 0, 0 * whatever = 0; sum4 = 0* a*b; sum4=0*1*2
				System.out.println(" sum4  :"+sum4);
				double sum5 = Arrays.stream(numbers).reduce(0, (a, b) -> a / b);  // sum4 = 0/a/b;
				System.out.println("sum5 ::: "+sum5);//sum =0, sum = sum + a + b; sum = 0+1+2; sum = 3+4+5; sum = 12+6+7
				
				
				//Min, max

				int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);  // 10
				int max1 = Arrays.stream(numbers).reduce(0, Integer::max);            // 10
				System.out.println(max);
				System.out.println(max1);

				int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);  // 0
				int min1 = Arrays.stream(numbers).reduce(0, Integer::min);       
				
				
				
				//Join strings
				String[] strings = {"a", "b", "c", "d", "e"};

				  // |a|b|c|d|e , the initial | join is not what we want
				  String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
				  System.out.println(reduce);
				  

				  // a|b|c|d|e, filter the initial "" empty string
				  String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
				      if (!"".equals(a)) {
				          return a + "|" + b;
				      } else {
				          return b;
				      }
				  });
				  System.out.println(reduce2);
				  
				  // a|b|c|d|e , better uses the Java 8 String.join :)
				  String join = String.join("|", strings);
				  System.out.println(join);
				  
				  
				  
				  
				  //Map & Reduce
				  List<Invoice> invoices = Arrays.asList(
			                new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
			                new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
			                new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
			        );

			        BigDecimal sumOfInvoice = invoices.stream()
			                .map(x -> x.getQty().multiply(x.getPrice()))    // map
			                .reduce(BigDecimal.ZERO, BigDecimal::add);      // reduce

			        System.out.println(sumOfInvoice);    // 49.955
			        System.out.println(sumOfInvoice.setScale(2, RoundingMode.HALF_UP));  // 49.96
			        
			        
			        

			        //Gives an expensive Car
			        List<Car> carList = Arrays.asList(new Car("Skoda", 18544),
			                new Car("Volvo", 22344),
			                new Car("Fiat", 23650),
			                new Car("Renault", 19700));

			        Optional<Car> car = carList.stream().reduce((c1, c2)
			                -> c1.getPrice() > c2.getPrice() ? c1 : c2);

			        System.out.println("Expensive Car :");
			        car.ifPresent(System.out::println);
			        System.out.println(" Car list :");
			        carList.forEach(System.out::println);

			        
			        
			        //Calculates the oldest user
			        List<User> users = new ArrayList<>();
			        users.add(new User("Frank", LocalDate.of(1979, 11, 23)));
			        users.add(new User("Peter", LocalDate.of(1985, 1, 18)));
			        users.add(new User("Lucy", LocalDate.of(2002, 5, 14)));
			        users.add(new User("Albert", LocalDate.of(1996, 8, 30)));
			        users.add(new User("Frank", LocalDate.of(1967, 10, 6)));
			        
			        
			        //45,37,20,24,55
			        int maxAge = users.stream().mapToInt(User::getAge)
			                .reduce(0, (a1, a2) -> a1 > a2 ? a1 : a2);
			        //45
			        
			  //      Optional<User> usr = users.stream().reduce((c1, c2)
			    //            -> c1.getPrice() > c2.getPrice() ? c1 : c2);

			        //car.ifPresent(System.out::println);
			        
			        System.out.println("The oldest user's age: "+ maxAge);;
			        

	}

}
