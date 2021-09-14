package stringLogic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfEachChar {
	
	
	
	public static void prCharwithFre(String s) {
		
		
		
		
		  Map<Character, Integer> d = new LinkedHashMap<Character, Integer>();
	         
	         
	        for(int i = 0; i < s.length(); i++)
	        	
	        	
	        {
	        	
	        	char c = s.charAt(i);
	            if(d.containsKey(c))
	            {
	                d.put(c, d.get(c) + 1);
	            }
	            else
	            {
	                d.put(c, 1);
	            }
	        }
	         
	        
	        System.out.println("cv"+ d);
	        // Print characters and their
	        // frequencies in same order
	        // of their appearance
	        for(int i = 0; i < s.length(); i++)
	        {
	           
	            // Print only if this
	            // character is not printed
	            // before
	        	
	        	char c = s.charAt(i);
	            if(d.get(c) > 1)
	            {
	                System.out.print(c);
	                System.out.print(d.get(c) + " ");
	               d.put(c, 0);
	            }           
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "geeksforgeeks";
		
		prCharwithFre(str);
		

	}

}
