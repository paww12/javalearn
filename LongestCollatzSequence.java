package start;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		long maxNumberOfTerms = 0;
		long startingNumber = 2;

		for (long i = 2L; i < 1000000; i++) {
			long result = findLengthOfCollatzChain(i) + 1;
			if (result > maxNumberOfTerms) {
				maxNumberOfTerms = result;
				startingNumber = i;
			}
		}
		System.out.println(startingNumber);

	}

	private static long findLengthOfCollatzChain(long inputNumber) {
		long calculationResult = 0;

		while (inputNumber != 1) {
			if (inputNumber % 2 == 0) {
				inputNumber /= 2;
				calculationResult++;
			}
			if (inputNumber % 2 != 0 && inputNumber != 1) {
				inputNumber = 3 * inputNumber + 1;
				calculationResult++;
			}
		}
		return calculationResult;
	}

}
