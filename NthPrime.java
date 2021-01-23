package start;

public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int checkValue = 1;
		int range = 10001;
		int index = 1;
		int result = 0;

		while (index <= range) {

			if (judgePrime(checkValue)) {

				index++;
				result = checkValue;
			}
			checkValue++;
		}

		System.out.println(result);

	}

	private static boolean judgePrime(int value) {
		boolean result = false;
		int counter = 0;
		for (int i = 2; i <= value; i++) {
			if (value % i == 0) {
				counter++;
			}
			if (i < value && counter > 0) {

				result = false;
				break;
			}

			if (i == value && counter == 1) {

				result = true;
			}

		}

		return result;
	}

}
