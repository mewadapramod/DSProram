package arrayNumber;

public class SumOfNaturalNumber {

	
	public static int findSum(int n) {
		
        int sum = 0;

		for(int i =0; i <=n; i++) 
			
			sum =sum+i;
			return sum;

			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findSum(4));
		
	}

}
