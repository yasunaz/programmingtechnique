package realquestions;

import java.util.HashSet;

public class MissingNumbers {

	public static void main(String[] args) {
		// V V
		int[] numbers = { 1, 2, 4, 10 };

		// Set ---> collection that does not allow duplicate element
		HashSet<String> bag = new HashSet<String>();
		bag.add("hello");
		bag.add("there");
		bag.add("hello");

		System.out.println(bag);

	}

	static void printMissingNubmers(int[] input) {
		// 1. register the content of the input array
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			set.add(input[i]);
		}

		int first = input[0];
		int last = input[input.length - 1];

		for (int num = first; num < last; num++) {
			if (set.contains(num) == false) {
				System.out.print(num + ", ");
			}
		}
	}

}
