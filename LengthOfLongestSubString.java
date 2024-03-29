package arrayNumber;

import java.util.HashSet;

public class LengthOfLongestSubString {
	
	
	public  int lenghtOfLognestSubStringM(String s) {
		
		int a_pointer = 0;
		int b_pointer = 0;
		
		int max =0;
		
		HashSet<Character>hash_set =new HashSet();
		
		while(b_pointer < s.length()) {
			
			if(!hash_set.contains(s.charAt(b_pointer))) {
				hash_set.add(s.charAt(b_pointer));
				b_pointer++;
				
				max = Math.max(hash_set.size(), max);
			}
			else {
				hash_set.remove(s.charAt(a_pointer));
				a_pointer++;
			}
		}
		return max;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ababcabcd";

		
		LengthOfLongestSubString test =new LengthOfLongestSubString();
		System.out.println(test.lenghtOfLognestSubStringM(input));
		

	}

}
