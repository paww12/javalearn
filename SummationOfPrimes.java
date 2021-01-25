package start;

public class SummationOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfNPrimes(2000000));

	}

	private static long sumOfNPrimes(int upperLimit) {
		long sumOfNPrimes = 0;

		for (int i = 3; i < upperLimit; i += 2) {

			if (isPrime(i)) {

				sumOfNPrimes += i;
			}
		}

		return sumOfNPrimes + 2;
	}

	private static boolean isPrime(int value) {

		for (int i = 2; i * i <= value; i++) {
			if (value % i == 0) {
				return false;
			}
		}

		return true;
	}

}
