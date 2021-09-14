package arrayNumber;

public class MergeSortedArray {
	
	
	public static void mergeSortedArr(int[] nums1, int m, int[] nums2, int n ) {
		
		int p1 = m-1, p2 = n-1, i = m+n-1;
		
		while(p2 >= 0) {
			if(p1 >= 0 && nums1[p1] > nums2[p2]) {
				
				
				nums1[i--] = nums1[p1--];
				
			}
			
			else {
				
				nums1[i--] = nums2[p2--];
				
				
			}
				
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums1[]  = {1, 2,3,0,0,0};
		int nums2[] = {2,5,6};
		int m = 3;
		int n = 3;
		mergeSortedArr(nums1, m, nums2, n);
		
		for(int i = 0; i< nums1.length; i++) {
			
			System.out.println(nums1[i]);
		}
		
	}

}
