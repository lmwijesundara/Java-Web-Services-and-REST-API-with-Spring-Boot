package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	// What are the beans?
	// What are the dependencies of a bean
	// Where to search for beans
	
	// Application context => place where spring manage beans

	public static void main(String[] args) {
		
		// now beans (new BinarySearchImpl()) is managed by spring
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
		
		
//		ApplicationContext applicationContext  = 
//				SpringApplication.run(SpringIn5StepsApplication.class, args);
//		BinarySearchImpl binarySearch = 
//				applicationContext.getBean(BinarySearchImpl.class);
//		int result = 
//				binarySearch.binarySearch(new int[] {12, 4, 6},  3);
//		System.out.println(result);
//		
	
		
		
	}
}
