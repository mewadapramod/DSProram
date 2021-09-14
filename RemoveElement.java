package arrayNumber;

public class RemoveElement {
	
	
	public static int removeElement(int[]arr, int val) {
		
		if(arr.length == 0) return 0;
		
		int valid_Size = 0;
		
		for(int i =0; i< arr.length; i++) {
			
			if(arr[i] != val) {
			
			arr[valid_Size] = arr[i];
			
			
			valid_Size++;
			
			
			}
			
			
		}
		
		
		return valid_Size;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[]nums = {3,2,2,3};
	int val = 3;
		
		System.out.println(removeElement(nums, val));
		
		
		/*
		 * for(int i = 0;i<nums.length; i++) {
		 * 
		 * System.out.println(nums[i]); }
		 */

	}

}
