package Solutions;

public class FrogJMP {

	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	    public int solution(int X, int Y, int D) {
	        // write your code in Java SE 8
	        
	        int solution = (int) Math.ceil((double) (Y-X)/D);
	        
	        return solution;
	    }
	
}
