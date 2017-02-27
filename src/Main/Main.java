package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Algorithms.BubbleSort;
import Main.Sorts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> unsortedList = new ArrayList<Integer>();
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		
		unsortedList = takeInput();
		Sorts choice = chooseMethod();
		
		switch(choice){
		case BubbleSort:
			sortedList = BubbleSort.run(unsortedList);
		}
		
		System.out.println(sortedList.toString());
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
	
	public static Sorts chooseMethod(){
	//	System.out.println
		Sorts choice;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Select a sorting method from one of the following:");
		System.out.println((Sorts.values()).toString());
		choice = keyboard.nextInt();
		
		return Sorts.BubbleSort;
	}

}
