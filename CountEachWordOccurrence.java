package arrayNumber;


import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachWordOccurrence {
	
	public static void countWords(String input) {
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
        
		

		
		if(input != null) {
			
			String[] separate = input.split(" ");
			
			for(String str : separate) {
				if(map.containsKey(str)) {
					
					map.put(str, map.get(str)+1 );
				}
				else {
					
					map.put(str, 1);
				}
				
				
			}
			
		}
		
		System.out.println(map);
		
		

	}

	public static void main(String[] args) {
		
		String str = "find spring tutorial, java tutorial how to java articles spring articles and may more";

		countWords(str);		
	}

}
