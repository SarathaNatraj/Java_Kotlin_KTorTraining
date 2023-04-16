package day5.regex;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("nd the most populated city of each continent Q.2) Find the number of movies of each director Welcome JAVA CODING Q.3) Find the number of genres of each director's movies Q.4) Find the highest populated capital city Q.5) Find the highest populated capital city of each continent Q.6) Sort the countries by number of their cities in descending order Q.7)"); 
		boolean result = m.find();
	//	String result = m.replaceAll("cat");   
		if(result)
		System.out.println("Match found");
		else
			System.out.println("Match not found");
		
		//Pattern p = Pattern.compile("a*b");        
    	String[] items1 = "aabcbdabe".split("a*b"); 
    	for(String s : items1)         
    		System.out.println(s);
    	 //   ssd
    	
    	
    	Pattern p1 = Pattern.compile("dog");
    	Matcher m1 = p1.matcher("the dog runs "); 
    	String result1 = m1.replaceAll("cat");     
    	System.out.println(result1);
    	
    	String res = "the dog runs the dog runs".replaceFirst("dog","cat");
    	System.out.println(res);
    	
    //ystem.out.println(LocalDate.now(ZoneId.of("Asia/Kolkatta")));
    	
    	// create an LocalDate object 
    			LocalDate lt = LocalDate.parse("2020-05-13"); 
    			// print result 
    			System.out.println("LocalDate : "+ lt);
	}

}
