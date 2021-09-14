package stringLogic;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "howtodoinjava dot com";
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] Chars = str.toCharArray();
		
		for(char c : Chars) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}
			else {
				
				map.put(c, 1);
			}
		}
		System.out.println(map);
		System.out.println("Duplicate objects");
		
		for(char c : map.keySet()) {
			if(map.get(c) > 1) {
			
			System.out.println(c);
			}
		}
		
		System.out.println("Print duplicate object exculding white space");
		
		for(char c: map.keySet()) {
			
			if(map.get(c) > 1 && !Character.isWhitespace(c)) {
				
				System.out.println(c);
			}
			
			
		}
		
        System.out.println("Distinct characters:");
        
        for(char c : map.keySet()) {
        	
        	if(map.get(c) ==1) {
        		
        		System.out.println(c);
        	}
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
        	
        	if(entry.getKey() != ' ') {
        		
        		 System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());        	}
        }
            
        
        
	}

}
