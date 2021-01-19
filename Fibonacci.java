package start;

public class Fibonacci {

	private static final int ZAKRES = 4000000;
	
	
	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci();
		int suma = fib.fibonacciSum(ZAKRES);
		
		System.out.println("Suma wynosi: " + suma + "!!!");
		
	}

	private int fibonacciSum(int zakres) {

		int h_sum = 0;
		int h_sum2 = 0;
		int sum = 0;
		int t1 = 1;
		int t2 = 2;
		
		while(t2<zakres) {
			h_sum = t1+t2;
			t1=t2;
			t2=h_sum;
			if(t2<zakres) {
			if(t2%2==0) {	
			h_sum2+=t2;
			}
			}
		
		}
		
		sum=h_sum2 + 2;
		return sum;
	}

}
