package stringLogic;

public class removeAllDigit {
	
	
	public static String removeAlldigitsfromString(String str) {
		
		String result = "";
		
		
		for(int i =0;i<str.length();i++) {
			
			
			if(!Character.isDigit(str.charAt(i))) {
				
				
				result = result+str.charAt(i);
				
			}
		}
		
		
		return result;
		
	}
	
	public static void main(String[]args) {
		
		
		String str = "pramod123";
		
		
		System.out.println(removeAlldigitsfromString(str));
		
	}

}
