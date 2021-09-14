package arrayNumber;

public class BinarySearch {

	
	
public static int doBinarySearch(int []arr, int target) {
	
	if(arr.length == 0)return -1;
	int left = 0;
	int right  = arr.length-1;
	
	
	while(left <= right) {
		int midpoint = left+(right-left)/2;
		
		if(arr[midpoint] == target) {
			return 1;
		}
		else if(target < arr[midpoint]) {
			right = midpoint-1;
			
		}
		else {
			
			left = midpoint+1;
		}
	}
	
	return -1;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {-1,0,3,5,9,12};
		int target = 9;
		
		System.out.println(doBinarySearch(nums, target));
		
		
	}

}
