package com.example.testcase;

// Implementation of Stream.sorted()
// to get a stream of sorted elements
// according to the provided Comparator
import java.util.*;
import java.util.stream.Stream;

class Streams {

	public static void main(String[] args)
	{

		// Creating a list of Integers
		List<Integer> list = Arrays.asList(5, -10, 7, -18, 23);

		System.out.println("The sorted stream according to provided Comparator is : ");

		// Displaying the list of Strings in
		// reverse order after sorting
		list.stream().sorted(Comparator.reverseOrder()).
						forEach(System.out::println);
	}
}
