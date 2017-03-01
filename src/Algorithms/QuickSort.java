package Algorithms;

import java.util.ArrayList;

public class QuickSort {
	
	//QuickSort implementation by http://www.java2novice.com/java-sorting-algorithms/quick-sort/
    //edited for use with ArrayLists and to be used in my scenario
    
	private ArrayList<Integer> list = new ArrayList<Integer>();
    private int length;
 
    public void sort(ArrayList<Integer> input) {
         
        if (input.size() == 0) {
            return;
        }
        this.list = input;
        length = input.size();
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = list.get(lowerIndex+(higherIndex-lowerIndex)/2);
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (list.get(i) < pivot) {
                i++;
            }
            while (list.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
    	Integer temp;
        temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        //Swapping positions of two numbers using a temp variable.
    }
    
    public ArrayList<Integer> getList() {
    	return this.list;
    }
    
    
     
}
