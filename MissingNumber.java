package arrayNumber;

import java.util.HashSet;

public class MissingNumber {
	
	
	public static int missingNumber(int [] nums) {
		
		HashSet<Integer> hs = new HashSet();
		
		for(int i : nums) {
			hs.add(i);
			
			
		}
		
		for(int i =0; i<=nums.length; i++) {
			
			if(!hs.contains(i)) {
				
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,0,1,5};
		
		System.out.println(missingNumber(arr));
		

	}

}
