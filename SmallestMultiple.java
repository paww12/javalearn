package start;

public class SmallestMultiple {

	public static void main(String[] args) {
		
		boolean result = false;
		int checkValue = 1;
		int range = 20;
		
		while(!result) {
			
			result = findSmallestMultiple(checkValue,range);
			
			if(!result) {
				checkValue++;
			}
			
		}
		
		System.out.println(checkValue + " jest podzielna przez wszystkie liczby od 1 do " + range + ".");

	}

	private static boolean findSmallestMultiple(int value, int range) {
		boolean result = false;
		for(int i=1;i<=range;i++) {
			
			if(value%i!=0) {
				break;
				}
			
			if(i==range) {
				result = true;
			}
		}
		
		return result;
	}
}
