package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Algorithms.BubbleSort;
import Algorithms.QuickSort;
import Main.Sorts;

public class Main {
	public static Sorts choice = Sorts.QuickSort;
	//  Select which sort to run algorithm with
	
	
	public static void main(String[] args) {
		ArrayList<Integer> unsortedList = new ArrayList<Integer>();
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		//  Declare two lists, unsorted list is kept so you can check that the same numbers are 
		//  in the two lists
		
		unsortedList = takeInput();
		// Takes input of numbers to be sorted
		switch(choice){
		// Runs a sorting algorithm based on what 'choice' variable is set to
		case BubbleSort:
			sortedList = BubbleSort.run(unsortedList);
		case QuickSort:
			//QuickSort implementation uses quick sort as a object
			QuickSort sorter = new QuickSort();
			sorter.sort(unsortedList);
			sortedList = sorter.getList();
			System.out.println("QuickSort");
		}
		
		
		
		System.out.println("List is now sorted:" + sortedList.toString());
	}
	
	private static ArrayList<Integer> takeInput(){
		/* Method to deal with the handling of converting between Integers and an ArrayList
		 for taking input of individual integers,
		*/
		
		int fieldNum;
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		//Array List used so that array size can be dynamic as input size is not known
		
		System.out.println("How many fields are you entering to be sorted?");
		fieldNum = keyboard.nextInt();
		// To know how many inputs to take
		
		for (int i=0; i < fieldNum; i++) {
			// Adds *fieldNum* number of numbers to the list
			System.out.println("Enter your input for field number: " + (i+1));
			input.add(keyboard.nextInt());
		}
		return input; 
	}

}
