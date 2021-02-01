package start;

import java.math.BigInteger;

public class PowerDigitSum {

	public static void main(String[] args) {

		BigInteger number = new BigInteger("2");

		int exponent = 1000;

		BigInteger result = new BigInteger("0");
		result = number.pow(exponent);
		BigInteger[] bigInt = new BigInteger[result.toString().length()];
		String a = result.toString();

		BigInteger sum = new BigInteger("0");
		for (int i = 0; i < result.toString().length(); i++) {
			bigInt[i] = new BigInteger(a.substring(i, i + 1));
			sum = sum.add(bigInt[i]);
		}
		System.out.println(sum);
	}
}
