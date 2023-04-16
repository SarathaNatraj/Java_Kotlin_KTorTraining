package day9.functionalinterface;

// Single Abstract Method - SAM
@FunctionalInterface
interface Sample{
    // abstract method
    int calculate(int val, int otherVal);
}
// public class
public class TestFunctional{
    public static void main(String[] args){
        
        // implementing the abstract method of the interface
    	//-> lambda expression
        Sample solution = 	(int val,int otherVal) ->{ val = val+51; 
        												return val = val +otherVal;
        
        };
        
        //int calculate(int val){
        // val = val +51;
        // return val;
        //}
        
        // calling the method
        System.out.println("Ans = "+ solution.calculate(51,2 ));
    }
}
