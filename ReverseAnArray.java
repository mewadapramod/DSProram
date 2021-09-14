package ArraysTest;

public class ReverseAnArray {
	
	static void reverseArray(int arr[],int start, int end) {
		int temp;
		while(start<end) {
			temp= arr[start];
			arr[start]= arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {1, 2, 3, 4, 5, 6};
	        printArray(arr);

	        reverseArray(arr,0,arr.length-1);
	        System.out.println("After reverse");
	        printArray(arr); 
	}

}
