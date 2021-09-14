package arrayNumber;

public class ArrayMaxConsuecutiveSum {
	
	public static int arraySumConsuecutiveSum(int []arr) {
		
		int max_sum = arr[0];
		int current_sum = max_sum;
		
		for(int i = 1; i< arr.length; i++) {
			
			current_sum = Math.max(arr[i]+current_sum, arr[i]);
			
			max_sum = Math.max(current_sum,max_sum );
		}
		return max_sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(arraySumConsuecutiveSum(nums));

	}

}
 