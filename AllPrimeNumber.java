package arrayNumber;

public class AllPrimeNumber {

	public static boolean isPrime(int n) {
		
		
		if(n <=1) 
			return false;
		
		
		for(int i = 2; i< n; i++) 
			
			
			if(n%i == 0) 
				
				return false;
				
				return true;
			
		
	}
	
	public static void printPrimeNumber(int n) {
		
		
		for(int i =2; i<=n; i++) {
			
			if(isPrime(i)) {
				
				System.out.println(i);
			}
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		printPrimeNumber(9);
	}

}
