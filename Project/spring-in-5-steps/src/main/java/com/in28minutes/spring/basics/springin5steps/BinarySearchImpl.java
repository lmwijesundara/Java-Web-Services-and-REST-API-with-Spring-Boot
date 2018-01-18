package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/
	
	// Generate setter

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		// 1 Implementing Sorting logic
			// 1.1 Bubble Sort 
		
			// BubbleSort bubbleSort = new BubbleSort();
			int[] sortedNumbers = sortAlgorithm.sort(numbers);
			
			// or Quick Sort
		
		// 2 Search the array
		
		// 3
		return 3;
	}




}
