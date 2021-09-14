package stringLogic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "GeeksForGeeks";
		
		char []c = input.toCharArray();
		
		for(int i = c.length-1; i>=0; i--) {
			
			System.out.println(c[i]);
		}

	}

}
