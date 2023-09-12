package arrayNumber;

public class RotateArraybyTwo {
	
	
	public void leftRotate(int[]arr, int d, int n) {
		
		for(int i = 0; i<d; i++) {
			
			leftByOne(arr,n);
			
		}
		
		
		
	}
	public void leftByOne(int[] arr, int n) {
		
		int i, temp;
		
		temp = arr[0];
		
		for(int j = 0; j<n-1; j++) {
			
			arr[j] = arr[j+1];
			
			arr[n-1] = temp;
			
			
			
		}
		
		
	}
	
	public static void printArray(int [] arr, int n) {
		
		for(int i =0; i<n-1; i++) {
			
			
			System.out.println(arr[i]+ " ");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RotateArraybyTwo rt = new RotateArraybyTwo();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

   rt.leftRotate(arr,2, arr.length);
   
   printArray(arr, arr.length);
        
        
	}

}
