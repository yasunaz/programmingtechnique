package realquestions;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s1 = "Hello hi nice to meet you";
		System.out.println( "s1: " + s1);
		System.out.println( "v1: " + noWhiteSpace1(s1)  );
		System.out.println( "v2: " + noWhiteSpace2(s1)  );
	}
	
	static public String noWhiteSpace1(String word) {
		return word.replaceAll("\\s", "");
	}
	
	
	static public String noWhiteSpace2(String word) {
		String[] words = word.split("\\W+");
		String result = "";
		for(int i = 0; i < words.length; i++) {
			result += words[i];
		}
		return result;
	}

}
