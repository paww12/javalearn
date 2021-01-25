package start;

public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {

		System.out.println(productOfMultyplyingPythagoreanFactors());
	}

	private static int productOfMultyplyingPythagoreanFactors() {
		int productOfMultiplyFactors = 0;

		for (int a = 1; a < 1000; a++) {
			for (int b = a + 1; b < 1000; b++) {
				for (int c = b + 1; c < 1000; c++) {

					if (c * c == a * a + b * b && a + b + c == 1000) {
						productOfMultiplyFactors = a * b * c;
						return productOfMultiplyFactors;
					}
				}
			}

		}

		return 0;
	}

}
