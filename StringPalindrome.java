package stringLogic;

public class StringPalindrome {
	
	
	public static void isPalindrome(String str) {
		
		String reverse ="";
		
		
		for(int i = str.length()-1; i>=0; i--) {
			
			reverse = reverse+str.charAt(i);
			
		}
		
		if(str.toLowerCase().equals(reverse.toLowerCase())) {
			
			System.out.println("String is palindrome");
		}
		else
			System.out.println("String is not palindrome");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aba";
			
		
		
		isPalindrome(str);

	}

}
