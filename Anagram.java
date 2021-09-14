package stringLogic;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	
	public static boolean isAnagram(String x, String y) {
		
		if(x.length()!= y.length()) 
		{ 
			return  false;
		}
		
       int[] count = new int[26];
       
       for(int i =0; i < x.length(); i++) {
    	   
    	   count[x.charAt(i) - 'a']++;
    	   count[y.charAt(i) - 'a'] --;
    	   
       } 
       
       for(int i : count) {
            if(i !=0 ) 
       { 
    	   return false;
       }
       }
	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String X = "keeps";        // Tom Marvolo Riddle
	        String Y = "peeks";

		System.out.println(isAnagram(X, Y));
		
	}

}
