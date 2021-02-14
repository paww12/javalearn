package start;

public class PrimeFactors {

	private static final long ZAKRES = 600851475143L;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeFactors pf = new PrimeFactors();
		long wynik = pf.maxPrimeFactor(ZAKRES);
		
		System.out.println(wynik);

	}
	
	private long maxPrimeFactor(long zakres) {
		long max_p_factor = 0L;
		long ile = 0L;

		
		for(long i=3L;i<=(int)Math.sqrt(zakres);i+=2) {
			System.out.println(i);
			for(long j=3L;j<=i;j+=2) {
				if(i%j==0) ile++;
				if(ile==1 && j<i) {
					ile=0L;
					break;}
			}
			if(ile==1 && max_p_factor<i && zakres%i==0) max_p_factor = i; 
			ile = 0L;
		} //musiałem dodać jakąś zmianę żeby komentarz wystawić, nie umiałem inaczej
		
		return max_p_factor;
	}

}
