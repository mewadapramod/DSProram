package stringLogic;

public class LongestCommonPrefix {
	
	
	public static String longestSubString(String[] strs) {
		
		
		if(strs.length ==0)
			return "";
		
		String prefix = strs[0];
		
		for(int i = 1; i<prefix.length();i++) {
			while(strs[i].indexOf(prefix) !=0) {
				
				prefix = prefix.substring(0,prefix.length()-1);
			}
			
			
		}
		
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []strs= {"flower","flow","flight"};
		
		System.out.println(longestSubString(strs));

	}

}
