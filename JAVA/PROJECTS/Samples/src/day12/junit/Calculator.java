package day12.junit;

public class Calculator {
public double add(double n1, double n2) {
		
		return n1+n2;
		
	}
public static int findMax(int arr[]){  
    int max=0;  
    for(int i=1;i<arr.length;i++){  
        if(max<arr[i])  
            max=arr[i];  
    }  
    return max;  
}  

}
