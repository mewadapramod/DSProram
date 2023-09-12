package arrayNumber;

import java.util.Arrays;

public class RemoveDuplicateObjectFromString {
	
	
	
	public static String removeDuplicate(String str) {
		
		
		String newStr = "";
		
		for(int i =0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(newStr.indexOf(ch)== -1) {
				
				newStr+=ch;			
			}
		}
		System.out.println("before"+newStr);
		char[] tempArray = newStr.toCharArray();
        
        // sort tempArray
        Arrays.sort(tempArray);
        return new String(tempArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "india";
		
		System.out.println(removeDuplicate(s));
		

	}

}
