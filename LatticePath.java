package start;

public class LatticePath {

	private static int counter = 0;
	private static long[][] table = new long[21][21];
	private static long limitX;
	private static long limitY;

	public static void main(String[] args) {
		limitX = 20;
		limitY = 20;

		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 20; j++) {
				table[i][j] = -1;
			}

		}

		long number = start(0, 0);
		System.out.println(number);

	}

	private static long start(int a, int b) {
		long index = 0;

		if (a == limitX && b == limitY) {
			return 1;
		}

		if (table[a][b] != -1) {
			return table[a][b];
		}

		if (a != limitX) {
			index += start(a + 1, b);
		}

		if (b != limitY) {
			index += start(a, b + 1);
		}

		table[a][b] = index;
		return index;

	}

}
