package stringLogic;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "i like this program very much";
		
		String [] word = s.split(" ");
		
		String reverse = "" ;
		
		for(int i = word.length-1; i>=0; i--) {
			
			reverse  += word[i] +" ";
			
			
		}

		System.out.println("Reverse string");
		
		System.out.println(reverse);
		
		System.out.println(reverse.substring(0, reverse.length()-1));
	}

}
