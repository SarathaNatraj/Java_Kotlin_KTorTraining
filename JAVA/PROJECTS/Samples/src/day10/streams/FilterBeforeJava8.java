package day10.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterBeforeJava8 {
	 public static void main(String[] args) {

	        List<String> lines = Arrays.asList("spring", "node", "mkyong","springboot","react");
	        List<String> result =  getFilterOutput(lines, "mkyong");
	        
	      //  lines.for(FilterExampleBeforeJava8::getFilterOutput("mkyong"));
	        for (String temp : result) {
	            System.out.println(temp);    //output : spring, node,springboot, react
	        }

	    }

	    private static List<String> getFilterOutput(List<String> lines, String filter) {
	        List<String> result = new ArrayList<>();
	        for (String line : lines) {
	            if (!filter.equals(line)) { // we dont like mkyong
	                result.add(line);
	            }
	        }
	        return result;
	    }


}
