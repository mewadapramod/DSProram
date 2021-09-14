package arrayNumber;

public class SecondLargestElement {
	
	
	public static void secondLargestElement(int[] arr, int arr_size) {
		
		int i, second;
		
		if(arr_size < 2) {
			System.out.println("Not valid input");
			return;
			
		}
		
		 int largest = second = Integer.MIN_VALUE;
		 
		    // Find the largest element
		    for(i = 0; i < arr_size; i++)
		    {
		        largest = Math.max(largest, arr[i]);
		    }
		 
		    // Find the second largest element
		    for(i = 0; i < arr_size; i++)
		    {
		        if (arr[i] != largest)
		            second = Math.max(second, arr[i]);
		    }
		    if (second == Integer.MIN_VALUE)
		        System.out.printf("There is no second " +
		                          "largest element\n");
		    else
		        System.out.printf("The second largest " +
		                          "element is %d\n", second);
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 5, 10,4,3 };
	    int n = arr.length;
	    secondLargestElement(arr, n);
		
		
	}

}
