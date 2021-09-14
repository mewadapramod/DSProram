package arrayNumber;

public class IncresingDecresingArray {
	
	
	
	public static void checkType(int[]arr, int n) {
		
		if(arr[0] <= arr[1] && arr[n-2] <= arr[n-1]) {
			
			
			System.out.println("Increasing");
			
		}
		
		else if(arr[0] >= arr[1] && arr[n-2] >= arr[n-1]) {
			
			System.out.println("Decreasing"); 
		}
		
		
		else if(arr[0] <= arr[1] && arr[n-2] >= arr[n-1]) {
			
			
			System.out.println("Incresing then Decreasing");
		}
		
		else {
			
			System.out.println("Decreasingthen Incresing");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[]{ 1, 2, 4,3 };
        
        int n = arr.length;
        
        
        checkType(arr, n);
	}

}
