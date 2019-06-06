package realquestions;

import java.util.Map;
import java.util.TreeMap;

public class MaxRepeatingWord {

	public static void main(String[] args) {
		// Given a paragraph, print out the
		// most repeating word and how many times it was repeated
		// in the paragraph
		String paragrah = "There are many variations! of passages of Lorem Ipsum available, "
				+ "but the majority have and suffered alteration in some form, by injected humour,"
				+ "or randomised words which don't look even and slightly believable. If you are "
				+ "going to use a passage of Lorem Ipsum, and you need to be sure there isn't "
				+ "anything and embarrassing hidden in! the middle of text. All the Lorem and Ipsum "
				+ "generators on the Internet tend to There predefined chunks as necessary, and "
				+ "making and this the first and true generator on the Internet. It uses a dictionary "
				+ "of over 200 and Latin words, combined with a handful of model sentence structures,"
				+ " to generate Lorem Ipsum which looks reasonable. The and generated Lorem Ipsum is "
				+ "therefore and always and free from repetition, injected humour, or non-characteristic";

		printMostRepreatedWord(paragrah);

	}

	static public void printMostRepreatedWord(String paragraph) {
		// step 1: turn the paragrah string into array of individual word ( string )
		String[] words = paragraph.split("\\W+");
		// step 2: process the array with for loop, for each string ( word )
		// i) determin if this word is in the hashmap
		// ii) if this word is in the hashmap, increment its value
		// iii) enter this word---->1
		Map<String, Integer> map = new TreeMap<String, Integer>();

		int max = Integer.MIN_VALUE;
		String most = "";

		for (int idx = 0; idx < words.length; idx++) {
			String curr = words[idx];
			if (map.containsKey(curr) == false) {
				map.put(curr, 1);
			} else {
				// word is already in the map
				int value = map.get(curr);
				value++;
				if (value > max) {
					most = curr;
					max = value;
				}
				map.put(curr, value);
			}
		}

		System.out.println("The most repeated word: " + most);

	}

}
