package arrayNumber;

public class PowerOfTwo {
	
	
	
	public static boolean isPowerOfTwo(int n) {
		
		
		long i =1;
		
		while(i<n) {
			
			i*=3;
		}
		
		
		
		return i==n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPowerOfTwo(9));
		

	}

}
