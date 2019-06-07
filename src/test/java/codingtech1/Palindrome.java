package codingtech1;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(    isPalindromeXianhui("kayak")  );  // true
		System.out.println(    isPalindromeXianhui("civic")  );  // true
		System.out.println(    isPalindromeXianhui("car")    );  // false
		
		String name = "nijat";
		name = "nijat" + 'a';   // implicit casting  + concatination
		
		char mystery = 'a' + 10;   // addition
		System.out.println( mystery );
		
	}
	// kayak --> true 
	// car   --> false
	// method that detects if the given word are 
	// palindrome or not

	static public boolean isPalindromeYasharway(String word) {
		int n = word.length(); 
		
		for (int i = 0; i < n / 2; i++) {
			char left = word.charAt(i);
			char right = word.charAt(n - 1 - i);
			if(left != right)
				return false;
		}
		return true;
	}
	
	// word.length() - 1
	// k  a  y  a  k 
	// 0  1  2  3  4 
	//            idx
	static public boolean isPalindromeXianhui(String word) {
		String reverse = "";
		for(int idx = word.length()-1; idx >= 0; idx--) {
			reverse += word.charAt(idx);
		}
		boolean isEqual = reverse.equals(word);
		return isEqual;
	}
}

// 