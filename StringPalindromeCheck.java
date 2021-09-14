package stringLogic;

public class StringPalindromeCheck {
	
	
	
	public static boolean isPalindorme(String str) {
		
		
		int i =0, j= str.length()-1;
		
		
		
		while(i<j) {
			
			
			if(str.charAt(i) != str.charAt(j)) 
				
				
				return false;
				i++;
				
				j--;
			}
		
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str = "abc";
		
		
		System.out.println(isPalindorme(str));
		
		
		
		
		
		
	}

}
