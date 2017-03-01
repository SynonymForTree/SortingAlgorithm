package Algorithms;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	
	//Used http://www.java2novice.com/java-sorting-algorithms/bubble-sort/ to help with
	//implementing bubble sort and edited it for use with ArrayList
	
	public static ArrayList<Integer> run (ArrayList<Integer> input) {
		int n = input.size();
        int k;
        ArrayList<Integer> output = new ArrayList<Integer>();
        output = input;
        
        for (int m = n; m >= 0; m--) {
        	// Loops for size of input + 1
            for (int i = 0; i < n - 1; i++) {
            	// Loops for size of input starting at 0 to access each index
            	k = i + 1;
            	// Index of next number declared so both numbers can be accessed and compared
                if (output.get(i) > output.get(k)) {
                	// Swaps numbers if they are in the incorrect positions relative to each other
                    swapNumbers(i, k, output);
                }
            }
        }
		return output;
		
	}
	
	private static void swapNumbers(int i, int j, ArrayList<Integer> input) {
		Integer temp;
        temp = input.get(i);
        input.set(i, input.get(j));
        input.set(j, temp);
        //Swapping positions of two numbers using a temp variable.
    }

}
