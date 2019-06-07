package string;

import java.util.Arrays;

public class StringExplanation {

	public static void main(String[] args) {
		
		//                 01234
		
		String apple = "Apple";
		String grape = "apple";
		
		System.out.println(  apple.compareToIgnoreCase(grape)    );
		// n1      n2
		// a       a    = 0
		// p       p    = 0
		// p       p    = 0
		// l       l    = 0
		// a       g    = -6
		
		
		//str1.comapreTo(  st2 ) ; 
		
		// negative ==> str1 comes first 
		// 0        ==> if two string is identical 
		// positive ==> str1 comes after 
		
		
		
		
	}
	
	
	static public String noWhiteSpace(String word) {
		String[] words = word.split("\\W");
		String result = "";
		for(int i = 0; i < words.length; i++) {
			result += words[i];
		}
		return result;
	}

}
