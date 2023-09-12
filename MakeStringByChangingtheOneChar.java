package arrayNumber;

public class MakeStringByChangingtheOneChar {
	
	
	
	public static boolean isPalindrome(String input) {
		
		int [] count = new int[128];
		
		for(int i =0; i<input.length();i++) {
			
			
			count[input.charAt(i)]++;
			
			
		}
		
		int n = 0;
		
		for(int i =0; i<128;i++) {
			
			n+=count[i]%2;
		}
		
		return n<=1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "bbg";
		
		System.out.println(isPalindrome(str));

	}

}
