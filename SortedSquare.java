package arrayNumber;

import java.util.Arrays;

public class SortedSquare {
	
	
	public static int[] sortedSquare(int[]nums) {
        int temp = 0;    

		
		for(int i= 0; i< nums.length; i++) {
			
			nums[i] = nums[i] * nums[i];
			
		}
		 for (int i = 0; i < nums.length; i++) {     
	            for (int j = i+1; j < nums.length; j++) {     
	               if(nums[i] > nums[j]) {    
	                   temp = nums[i];    
	                   nums[i] = nums[j];    
	                   nums[j] = temp;    
	               }     
	            }     
	        } 		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr = {-4,-1,0,3,10};
		sortedSquare(arr);
		
		for(int i=0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}

	}

}
