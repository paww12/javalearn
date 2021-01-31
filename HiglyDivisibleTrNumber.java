package start;

public class HiglyDivisibleTrNumber {

	public static void main(String[] args) {

		int calculatingLimit = 501;
		int factorsCounter = 0;
		long triangularNumber = 10;
		long difference = 5;
		long i = 1;
		while (factorsCounter <= calculatingLimit) {
			
			if (triangularNumber % i == 0) {
				factorsCounter++;
			}

			i++;
			//System.out.println(factorsCounter);
			if(factorsCounter>=calculatingLimit/2) {
				
				break;
			}
			
			if (i >= (int) Math.sqrt(triangularNumber) && factorsCounter < calculatingLimit/2) {
				triangularNumber += difference;
				difference++;
				factorsCounter = 0;
				i = 1;
				continue;
			}
		}
		System.out.println(triangularNumber);
	}

}
