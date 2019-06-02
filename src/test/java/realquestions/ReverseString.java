package realquestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String last = "Muhtar";
		String reverse = reverseString(last);
		System.out.println("Last Name:   " + last);
		System.out.println("Its Reverse: " + reverse);
	}

	static public String reverseString(String word) {
		char[] letter = word.toCharArray();
		String s1 = "";
		for(int i = letter.length-1; i >= 0; i--) {
			s1 += String.valueOf(letter[i]);
		}
		return s1;
	}
}
