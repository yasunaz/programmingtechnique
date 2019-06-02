package realquestions;

public class Palindrome {
	// main method
	public static void main(String[] args) {
		System.out.println(isPalindrome("res ser"));
	}
	
	// kayak
	static public boolean isPalindrome(String word) {
		String s = "";
		for(int i = word.length()-1; i >= 0; i--) {
			s += word.charAt(i);
		}
		return word.equalsIgnoreCase(s);
	}
}
