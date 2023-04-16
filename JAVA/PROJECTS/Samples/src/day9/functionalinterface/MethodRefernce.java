package day9.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

interface IntPredicate {
	static boolean isOdd(Integer n) { return n % 2 != 0; }
}

public class MethodRefernce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Call with lambda expression
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> odds = (List<Integer>) filter(n -> IntPredicate.isOdd(n), numbers);
		
		//Call with Method Reference 
		List<Integer> numbersAgain =Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> oddsAgain = (List<Integer>) filter(IntPredicate::isOdd,  numbersAgain);

		
		for(Integer it : oddsAgain) {
			System.out.println(it);
		}


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
