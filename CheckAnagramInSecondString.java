package arrayNumber;

import java.util.Arrays;

public class CheckAnagramInSecondString {
	
	
	public static boolean isAnagram(String s1, String s2) {
		
		
		int s1Hash [] = new int [26];
		
		int s2Hash[] = new int [26];
		
		int s1len = s1.length();
		int s2len = s2.length();
		
		if(s1len > s2len)
			return false;
		
		int left = 0, right = 0;
		
		while(right < s1len) {
			
			s1Hash[s1.charAt(right) - 'a']+=1;
			s2Hash[s2.charAt(right) - 'a']+=1;
			
			right++;
			
		}
		
		right -=1;
		
		while(right < s2len) {
			
			if(Arrays.equals(s1Hash, s2Hash)) 
				
				return true;
			right++;
			

		      if (right != s2len)
		    	  s2Hash[s2.charAt(right) -'a']+=1;
		          s2Hash[s2.charAt(left) -'a'] -=1;
		          
		          left++;
		
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "ab";
		String s2 = "bbpobac";
		
		if(isAnagram(s1,s2)) 
			System.out.println("Anagram");
		
		
		else
			System.out.println("not anagram");

	}

}
