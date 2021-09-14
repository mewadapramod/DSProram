package arrayNumber;

public class MaxConsuecutiveOnes {
	
	
	
	public static int maxOnes(int[] nums) {
		
		int max = 0;
		int current_ones = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] == 1) {
				
				current_ones += 1;
				
				max = Math.max(max, current_ones);
				
			}
			else {
				
				current_ones = 0;
			}
			
			
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {1,1,0,1,1,1};
		
		System.out.println(maxOnes(nums));

	}

}
