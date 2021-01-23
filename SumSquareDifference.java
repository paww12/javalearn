package start;

public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 100;

		int difference = 0;

		difference = sumOfSquares(range) - squareSum(range);

		System.out.println(difference);
	}

	private static int squareSum(int range) {
		int result = 0;
		int sum = 0;

		for (int i = 1; i <= range; i++) {
			sum += (int) Math.pow(i, 2);
		}
		result = sum;
		return result;
	}

	private static int sumOfSquares(int range) {
		int result = 0;
		int sum = 0;

		for (int i = 1; i <= range; i++) {
			sum += i;
		}

		result = (int) Math.pow(sum, 2);

		return result;
	}

}
