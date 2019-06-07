package codingtech1;

import java.util.Arrays;

public class ArrayPorcessing {
	public static void main(String[] args) {

		double[] money = { 10.9, 19.9, 88.9, 7.4 };

		// Technique 1. printing the array content
		for (int i = 0; i < money.length; i++) {
			System.out.print(money[i] + ", ");
		}
		System.out.println();

		// Technique 2. find the max number in array
		double max = Double.MIN_VALUE; // before procession, variable max holds smallest number
		for (int i = 0; i < money.length; i++) {
			if (money[i] > max)
				max = money[i];
		}
		System.out.println(max);

		// Technique 3. compute the average of the array
		double sum = 0;
		for (int i = 0; i < money.length; i++) {
			sum += money[i];
		}
		System.out.println(sum / money.length);

		// Technique 4. String array processing, dividing one string into array of
		// string
		String paragrah = "There are? many variations! of passages of Lorem Ipsum available, "
				+ "but the majority have suffered alteration in some form, by injected humour,"
				+ "or randomised words which don't look even slightly believable. If you are "
				+ "going to use a passage of Lorem Ipsum, you need to be sure there isn't "
				+ "anything embarrassing hidden in! the middle of text. All the Lorem Ipsum "
				+ "generators on the Internet tend to repeat predefined chunks as necessary, "
				+ "making this the first true generator on the Internet. It uses a dictionary "
				+ "of over 200 Latin words&, combined with a handful of model sentence structures,"
				+ " to generate Lorem Ipsum which looks(* reasonable. The generated Lorem Ipsum is "
				+ "therefore always free from repetition, injected humour%$, or non-characteristic words etc.";

		String[] words = paragrah.split("\\W+"); // extract each word from a string and turn these into String array
		System.out.println(Arrays.toString(words));

		// Technique 5. string array processing, turning String to character array
		String fullname = "Nijat Muhtar";
		char[] letters = fullname.toUpperCase().toCharArray(); // string array processing
		System.out.println(Arrays.toString(letters));

		// Technique 6. reverse the values of array
		int[] ages = { 10, 12, 14, 16, 20, 21, 25 };
		//         idx 0    1   2  [3]  4   5   6
		
		int n = ages.length;  
		for (int i = 0; i < n / 2; i++) {
			int temp = ages[i];
			ages[i] = ages[n - 1 - i];
			ages[n - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(ages));

	}
}
