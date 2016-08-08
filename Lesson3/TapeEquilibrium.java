package Solutions;

public class TapeEquilibrium {
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        int sum=0;
	        int auxSolution=0;
	        int bestSolution=0;
	        int auxSum=0;
	        int sumAfterP=0;
	        
	        
	        for(int i=0; i < A.length; i++){
	            sum = sum + A[i];
	            auxSum = auxSum + Math.abs(A[i]);
	            }
	            
	            bestSolution = auxSum;
	            auxSum=0;
	            
	        for(int p=0; p < A.length-1; p++){
	            auxSum = auxSum + A[p];
	            sumAfterP = sum - auxSum;
	            auxSolution = Math.abs(auxSum - sumAfterP);
	            if(auxSolution < bestSolution){
	                bestSolution = auxSolution;
	                }
	            }
	        return bestSolution;    
	            
	    }
	}

