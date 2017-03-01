package Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Algorithms.BubbleSort;

public class BubbleTest {

	@Test
	public void test() {
		ArrayList<Integer> testcase = new ArrayList<Integer>();
		ArrayList<Integer> correctsort = new ArrayList<Integer>();
		
		testcase.add(1);
		testcase.add(9);
		testcase.add(7);
		testcase.add(3);
		
		correctsort.add(1);
		correctsort.add(3);
		correctsort.add(7);
		correctsort.add(9);
		
		testcase = BubbleSort.run(testcase);
		assertEquals(testcase, correctsort);
	}

}
