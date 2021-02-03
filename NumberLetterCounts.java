package start;

public class NumberLetterCounts {

	public static String[] oneToNineteen = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	public static String[] twentyToNinety = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
			"eighty", "ninety" };

	public static String hundred = "hundred";

	public static String and = "and";

	public static void main(String[] args) {

		int sumOfLetters = 0;

		for (int i = 1; i <= 1000; i++) {

			sumOfLetters += countSumOfLetters(i);
		}

		System.out.println(sumOfLetters);
	}

	private static int countSumOfLetters(int inputValue) {
		int result = 0;

		String hundreds = "";
		String tens = "";
		String ones = "";
		String tensOnes = "";
		String resultString = "";

		int tenss = inputValue - (int) (inputValue / 100) * 100;

		if ((int) inputValue / 100 > 0) {

			hundreds = oneToNineteen[(int) inputValue / 100] + hundred;
		}

		if ((int) tenss / 10 > 0) {

			if ((int) tenss / 10 == 1) {

				tens = oneToNineteen[tenss % 10 + 10];
			} else {
				tens = twentyToNinety[(int) tenss / 10];
				if (tenss % 10 > 0) {

					tens = tens + oneToNineteen[tenss % 10];
				}
			}
		}

		if ((int) tenss / 10 == 0) {
			ones = oneToNineteen[inputValue % 10];
		}

		if (hundreds != "" && (tens != "" || ones != "")) {

			resultString = hundreds + and + tens + ones;
		} else {
			resultString = hundreds + tens + ones;
		}

		if (inputValue / 1000 > 0) {

			resultString = "onethousand";
		}

		result = resultString.length();

		return result;

	}

}
