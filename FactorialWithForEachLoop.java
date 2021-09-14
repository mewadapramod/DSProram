package arrayNumber;

public class FactorialWithForEachLoop {
	
	
	public static int fact(int n) {
		
		
		return (n ==1 || n == 0) ? 1 : n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		System.out.println("Factorial of " + num
	            + " is " + fact(5));

	}

}
