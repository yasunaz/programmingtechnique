package codingtech1;

public class ConditionaLogic {

	/*
	 * Given a 3 integer, this method will return the biggest number
	 */
	private static int biggest(int num1, int num2, int num3) {
		// Conditional logic
		// vairable = ( logic)? case_true_value : case_false_value;
		int bigger = (num1 > num2) ? num1 : num2;

		if (bigger > num3) {
			return bigger;
		} else {
			return num3;
		}
	}

	// Main method
	public static void main(String[] args) {
		// write a program that give the biggest number given 3 integers
		int result = biggest(10, 20, 100);
		System.out.println(result);
	}
}
