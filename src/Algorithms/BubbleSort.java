package Algorithms;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	
	public static ArrayList<Integer> run (ArrayList<Integer> input) {
		int n = input.size();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
            	k = i + 1;
            	//System.out.println("Numbers being examined are: " + input.get(i) + " " 
            	//+ input.get(k) + " Input size is: " + input.size());
            	
                if (input.get(i) > input.get(k)) {
                    swapNumbers(i, k, input);
                }
            }
        }
		return input;
	}
	
	private static void swapNumbers(int i, int j, ArrayList<Integer> input) {
		//System.out.println("Number being swapped are: " + input.get(i) + " " + input.get(j));
		Integer temp;
        temp = input.get(i);
        input.set(i, input.get(j));
        input.set(j, temp);
    }

}
