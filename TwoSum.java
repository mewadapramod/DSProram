package arrayNumber;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	
	
	public static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer>num_sum =new HashMap<>();
		
		for(int i =0;i<nums.length;i++) {
			int complement = target - nums[i];
			if(num_sum.containsKey(complement)) {
				
				return  new int[] {num_sum.get(complement), i};
				

		}
			
			
			num_sum.put(nums[i], i);
		
			
		}
		
		throw new IllegalArgumentException("no match found");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
				 int target = 9;
		
		TwoSum s = new TwoSum();
	int[] num=	s.twoSum(nums, target);
	
	
for(int i=0;i<num.length;i++) {
	
}		
		
		
		
		

	}

}
