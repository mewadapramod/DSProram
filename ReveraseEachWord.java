package arrayNumber;

public class ReveraseEachWord {

	public static void main(String[] args) {

		String str = "Java programming";
		String[] words = str.split(" ");
		String reverse = "";
		
		for(int i= 0; i< words.length; i++) {
			
			String word = words[i];
			String revWord = "";
			
			for(int j = word.length()-1; j>=0; j-- ) {
				
				revWord = revWord+word.charAt(j);
				
			}
			
			reverse = reverse+revWord+" ";
			
		}
		System.out.println(reverse);
		
	}

}
