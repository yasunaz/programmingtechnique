package codingtech1;

public class ModOperator {

	/*
	 * Given a number, this method will find a divisor of this number. Note that
	 * "divisor" is a number that cleanly divides one number
	 */
	private static void printDivisor(int input) {
		int num = 1;
		while (num <= input) {
			if (input % num == 0) {
				System.out.println("divisor: " + num);
			}
			num++;
		}
	}

	/*
	 * This method will determine if the given number is odd or even
	 */
	private static void oddOrEven(int number) {
		if (number % 2 == 0) {
			System.out.println("Number: " + number + " is even number!");
		} else {
			System.out.println("Number: " + number + " is odd number!");
		}
	}

	/*
	 * This method will detect whether given number is multiple of divisible by 5
	 */
	private static void multipleOfFive(int number) {
		if (number % 5 == 0) {
			System.out.println("Yes it is multiple of 5");
		} else {
			System.out.println("No it is not multiple of 5");
		}
	}

	/*
	 * This method will print a number till the limit and when each cycle is reach
	 * it will print in next line.
	 */
	private static void cycle(int limit, int cycle) {
		int counter = 1;
		for (int i = 0; i < limit; i++) {
			if (counter % cycle == 1) {
				System.out.print("\n");
			}
			System.out.print(counter++ + " "); // <--- printing
		}
	}

	// Main method
	public static void main(String[] args) {
		// Technique 1: printing out all the divisor of giving number
		printDivisor(1312321);

		// Technique 2: detecting an odd and even number
		oddOrEven(19);

		// Technique 3: detecting an given number is multiple of 5 or not
		multipleOfFive(75);

		// Technique 4: detecting a cycle
		cycle(100, 10);
	}

}
