package start;

public class Palindromy {

	private static final int DIGITS = 3;
	private static int base = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int palindrome = findPalindrome(DIGITS);
		System.out.println(palindrome);

	}

	private static int findPalindrome(double range) {
		int result = 0;
		int max = 0;
		int searching = 0;
		double h_multipliers = Math.pow(base, range);
		int multipliers = (int) h_multipliers;

		for (int i = multipliers - 1; i > 0; i--) {
			for (int j = multipliers - 1; j > 0; j--) {
				searching = i * j;
				boolean test = judgePalindrome(DIGITS, searching);
				if (test) {

					if (searching > max) {

						max = searching;
					}
				}
			}
		}
		result = max;
		return result;
	}

	private static boolean judgePalindrome(int range, int value) {
		boolean judge_result = false;

		int[] h_value_digits = new int[range * 2];
		int[] value_digits = new int[range * 2];

		int counter = 0;

		for (int i = 0; i <= value_digits.length - 1; i++) {

			value_digits[i] = (int) (value / (Math.pow(base, value_digits.length - 1 - i)));
			h_value_digits[i] = value_digits[i];

			if (i != 0) {
				value_digits[i] = value_digits[i] - (h_value_digits[i - 1] * 10);
			}
		}

		for (int j = 0; j < range; j++) {
			if (value_digits[j] == value_digits[range * 2 - 1 - j]) {
				counter++;
			}

		}

		if (counter == range) {
			judge_result = true;
		}

		return judge_result;
	}
	
	private static boolean isPalindrome(int number) {
		String numberString = String.valueOf(number);
		int numberLength = numberString.length();
		boolean isLengthOdd = numberLength % 2 != 0; //why this is needed?
		String firstHalf = numberString.substring(0, numberLength / 2);
		String secondHalf = numberString.substring(isLengthOdd ? ((numberLength + 1) / 2) : numberLength / 2, numberLength);
		String secondHalfReversed = new StringBuilder(secondHalf).reverse().toString();
		return firstHalf.equals(secondHalfReversed); //why equals is used instead of '==' operator? 
	}
}
