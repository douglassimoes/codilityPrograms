package Solutions;

public class PermMissingElement {
	
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        int sum = 0;
	        int solution = 1;
	        int auxSum = 0;
	        int smallerValue;
	        int biggerValue=0;
	        
	        if(A.length > 0){
	        smallerValue = A[0];
	            
	            for(int number : A){
	            sum = sum + number;
	            if(smallerValue > number){
	                smallerValue = number;
	                }    
	            }
	    
	        for(int i=0; i <= A.length ; i++){
	            auxSum = auxSum + (smallerValue+i);
	            }
	        biggerValue = smallerValue + A.length;
	        solution = auxSum - sum;
	        
	        if(solution == biggerValue && smallerValue - 1 > 0){
	            solution = smallerValue -1;
	            }
	        }
	        return solution;
	    }

}
