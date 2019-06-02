package realquestions;

import java.util.Arrays;

public class Anagram {
	// main method
	public static void main(String[] args) {
		String first = "Tom Marvolo Riddle ";
		String second = "I am Lord Voldemort";
	
		boolean result = isAnagram(first, second);
		
		System.out.println(result);   // true
	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		
		// 1. make sure they have same number of letters 
		if(s1.length() != s2.length())
			return false;
		
		// 2. converting each string to lower case
		char[] first = s1.toLowerCase().toCharArray();
		char[] second = s2.toLowerCase().toCharArray();
		
		// 3. sort both array and compare 
		Arrays.sort(first);
		Arrays.sort(second);
		
		return Arrays.equals(first, second);
	}
}
