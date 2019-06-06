package realquestions;

public class PrimeNumbers {

	public static void main(String[] args) {

		// System.out.println( isPrime(347) );
		System.out.println(isPrime(11));

		// number : 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17
		// number : 2,3....17.....100...200...300..345,346

	}

	// number is a prime if it can be divided only
	// with 1 and number itself,
	// if the number can be divided by any other number,
	// then that number is not a prime
	// trick, just check if the number can be divided [2.....sqrt(number))
	static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
