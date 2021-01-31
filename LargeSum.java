package start;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {

	public static String fileName = "plik.txt";

	public static void main(String[] args) {

		BigInteger[] bigInt = new BigInteger[100];

		String[] stringFromFile = new String[100];
		stringFromFile = readFile(fileName);

		BigInteger sumOfNumbersFromFile = new BigInteger("0");

		for (int i = 0; i < 100; i++) {
			bigInt[i] = new BigInteger(stringFromFile[i]);
			sumOfNumbersFromFile = sumOfNumbersFromFile.add(bigInt[i]);
		}

		String result = sumOfNumbersFromFile.toString();

		System.out.println(result.substring(0, 10));

	}

	private static String[] readFile(String fileName) {
		int i = 0;
		String[] result = new String[100];
		File file = new File(fileName);
		if (file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				Scanner elements = new Scanner(fr);
				while (elements.hasNextLine()) {
					result[i] = elements.nextLine();
					i++;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
