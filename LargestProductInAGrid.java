package start;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class LargestProductInAGrid {

	public static String fileName = "plik.txt";
	public static int[] fileDimensions = new int[2];
	public static int adjacentNumbers = 2;

	public static void main(String[] args) {

		calculateLinesNumberAndAllElementsInFile(fileName);

		fileDimensions = calculateLinesNumberAndAllElementsInFile(fileName);
		int numberOfElementsInRow = fileDimensions[0] / fileDimensions[1];

		int[][] tableOfValues = new int[fileDimensions[1]][numberOfElementsInRow];

		tableOfValues = getFileContent(fileDimensions[1], numberOfElementsInRow, fileName);

		long poziom = getMaxProductAdjacentHorizontally(tableOfValues, adjacentNumbers, fileDimensions[1],
				numberOfElementsInRow);

		System.out.println(poziom);

		long pion = getMaxProductAdjacentVertically(tableOfValues, adjacentNumbers, fileDimensions[1],
				numberOfElementsInRow);

		System.out.println(pion);

		long przekatna = getMaxProductAdjacentDiagonally(tableOfValues, adjacentNumbers, fileDimensions[1],
				numberOfElementsInRow);

		System.out.println(przekatna);

	}

	private static long getMaxProductAdjacentDiagonally(int[][] inputTable, int numberOfAdjacentNumbers, int arrayX,
			int arrayY) {
		long nextProduct = 0;
		long maxProduct = 0;

		for (int i = 0; i < arrayX - numberOfAdjacentNumbers + 1; i++) {
			for (int j = 0; j < arrayY - numberOfAdjacentNumbers + 1; j++) {
				for (int k = i, l = j; k < i + numberOfAdjacentNumbers && l < j + numberOfAdjacentNumbers; k++, l++) {
					if (k == i && l == j) {
						nextProduct = inputTable[k][l];
					} else {
						nextProduct *= inputTable[k][l];
					}

				}
				if (maxProduct < nextProduct) {
					maxProduct = nextProduct;
				}
				nextProduct = 0;

			}

		}

		for (int i = 0; i < arrayX - numberOfAdjacentNumbers + 1; i++) {
			for (int j = arrayY - 1; j > numberOfAdjacentNumbers - 1; j--) {
				for (int k = i, l = j; k < i + numberOfAdjacentNumbers && l > j - numberOfAdjacentNumbers; k++, l--) {
					if (k == i && l == j) {
						nextProduct = inputTable[k][l];
					} else {
						nextProduct *= inputTable[k][l];
					}
				}
				if (maxProduct < nextProduct) {
					maxProduct = nextProduct;
				}
				nextProduct = 0;
			}

		}

		return maxProduct;
	}

	private static long getMaxProductAdjacentVertically(int[][] inputTable, int numberOfAdjacentNumbers, int arrayX,
			int arrayY) {
		long nextProduct = 0;
		long maxProduct = 0;

		for (int j = 0; j < arrayY; j++) {
			for (int i = 0; i < arrayX - numberOfAdjacentNumbers + 1; i++) {
				for (int k = i; k < i + numberOfAdjacentNumbers; k++) {

					if (k == i) {
						nextProduct = inputTable[k][j];
					} else {
						nextProduct *= inputTable[k][j];
					}

				}
				if (maxProduct < nextProduct) {
					maxProduct = nextProduct;
				}
				nextProduct = 0;

			}

		}

		return maxProduct;
	}

	private static long getMaxProductAdjacentHorizontally(int[][] inputTable, int numberOfAdjacentNumbers, int arrayX,
			int arrayY) {
		long nextProduct = 0;
		long maxProduct = 0;

		for (int i = 0; i < arrayX; i++) {
			for (int j = 0; j < arrayY - numberOfAdjacentNumbers + 1; j++) {
				for (int k = j; k < j + numberOfAdjacentNumbers; k++) {

					if (k == j) {
						nextProduct = inputTable[i][k];
					} else {
						nextProduct *= inputTable[i][k];
					}

				}
				if (maxProduct < nextProduct) {
					maxProduct = nextProduct;
				}
				nextProduct = 0;

			}

		}

		return maxProduct;
	}

	private static int[][] getFileContent(int arrayX, int arrayY, String fileName) {
		int i = 0;
		int j = 0;

		int[][] resultTableFromFile = new int[arrayX][arrayY];

		File file = new File(fileName);
		if (file.exists()) {

			try {
				FileReader fr = new FileReader(file);
				Scanner elements = new Scanner(fr);

				while (elements.hasNextInt()) {

					resultTableFromFile[i][j] = elements.nextInt();

					if (j >= arrayY - 1 && i < arrayX - 1) {
						j = 0;
						i++;
					} else {
						j++;
					}

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}

		return resultTableFromFile;
	}

	private static int[] calculateLinesNumberAndAllElementsInFile(String fileName) {
		int[] resultOfMethod = new int[2];
		int lineNumberCount = 0;
		int elementsNumberCount = 0;
		File file = new File(fileName);
		if (file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				FileReader fr2 = new FileReader(file);
				LineNumberReader lr = new LineNumberReader(fr);
				Scanner elements = new Scanner(fr2);
				try {
					while (elements.hasNextInt()) {
						elements.nextInt();
						elementsNumberCount++;
					}

					while (lr.readLine() != null) {
						lineNumberCount++;
					}

					resultOfMethod[0] = elementsNumberCount;
					resultOfMethod[1] = lineNumberCount;

				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return resultOfMethod;
	}
}
