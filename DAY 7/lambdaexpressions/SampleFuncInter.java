package day7.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleFuncInter {
	public static void main(String[] args) {

        //(aragumentList) -> (method body)
        //(ag1,ag2) -> int {
        //};
        Sample sample = () -> System.out.println("ab called");
        sample.ab();

        //void ab (){
      //  System.out.println("ab called");
    //}
		// create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
        
        
     // lambda expression to create the object
        new Thread(() -> {

            System.out.println("New thread created");
            //All programminig
        }).start();
        
        
      //  List number = Arrays.asList(2,3,4,5);
      //  List square = (List) number.stream().map(x->x+x).collect(Collectors.toList());
        
	}
}
