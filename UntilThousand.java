package start;
import java.util.Scanner;


public class UntilThousand {

	public static void main(String[] args) {
		
		int rozmiar = 0;
		System.out.println("Podaj zakres: ");
		
		Scanner scanner = new Scanner(System.in);
		rozmiar = scanner.nextInt();
		
		UntilThousand untilThousand = new UntilThousand();
		int uTSum = untilThousand.findSum(rozmiar);
		
		System.out.println("Dla wartosci " + rozmiar + " suma wynosi: " + uTSum);
		
	}

	
	private int findSum(int rozmiar) {
		
		int sum = 0;
		int h_sum_3 = 0;
		int h_sum_5 = 0;
		int h_sum_3_5 = 0;
		int crossed = 0;
		
		int trojki = rozmiar/3;
		int piatki = rozmiar/5;
		
		if (rozmiar%3==0) trojki -= 1;
		if (rozmiar%5==0) piatki -= 1;
		
		
			for(int j=1;j<=trojki;j++) {
				h_sum_3 += j*3;
				}
			for(int k=1;k<=piatki;k++) {
				h_sum_5 += k*5;
			}
			for(int l=1;l<=trojki;l++) {
				crossed = l*3;
				if(crossed%3==0 && crossed%5==0) h_sum_3_5 += crossed;
			}
		
		sum = h_sum_3 + h_sum_5 - h_sum_3_5;
		
		return sum;
	}
}
