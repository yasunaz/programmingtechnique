package realquestions;

import java.util.HashMap;

public class CountNumberOfChars {

	public static void main(String[] args) {
		String word = "K ay ak";
		
		String strWithouSpace = word.replaceAll("\\s", "");
		System.out.println(strWithouSpace);
		
		
		//numberOfEachChar(word);
	}

	static public void numberOfEachChar(String word) {
		String copy = String.valueOf( word.toLowerCase().toCharArray() );
		
		HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
		
		for (int i = 0; i < copy.length(); i++) 
		{
			char temp = copy.charAt(i);
			if (m1.containsKey(temp)) {
				int count = m1.get(temp);
				count++;
				m1.put(temp, count);
			} else {
				m1.put(temp, 1);
			}
		}
		System.out.println(m1);
	}
}


/*

k ===> 2
a ===> 2
y ===> 1
*/