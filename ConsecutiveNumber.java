package arrayNumber;

public class ConsecutiveNumber {
	
	
	public static int findmaxConsecutiveNumber(int []nums) {
		
		int max=0;
		int current_number_of_ones = 0;
		
		for(int i=0; i<nums.length;i++) {
		
		if(nums[i]==1) {
			
			current_number_of_ones +=1;
			max =Math.max(max, current_number_of_ones);
			
		}
		else {
			
			current_number_of_ones =0;
		}
			
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[] input = {1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1};
   
		System.out.println(findmaxConsecutiveNumber(input));
		
	}

}
