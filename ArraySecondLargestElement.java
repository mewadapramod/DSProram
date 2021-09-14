package arrayNumber;

public class ArraySecondLargestElement {
	
	
	public static int getSecondLargestElement(int []arr) {
		
		
		int temp;
		
		for(int i =0; i< arr.length; i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]> arr[j]) {
					
					temp = arr[i];
					
					arr[i] = arr[j];
					arr[j] = temp;
					
					
					
				}
			}
			
		}
		return arr[arr.length-2];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,6,3,2};  

		
		
System.out.println(getSecondLargestElement(a));
	}

}
