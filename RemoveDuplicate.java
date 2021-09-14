package arrayNumber;

public class RemoveDuplicate {
	
	
	public  static int removeDuplicateElement(int []arr) {
		
		
		int index =1;
		
		for(int i = 0; i<arr.length-1; i++ ) {
			
			if(arr[i] != arr[i+1]) {
				
				arr[index++] = arr[i+1];
				
			}
		}
		System.out.println(index);

		 

		return index;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int[] arr = { 1, 2, 5, 5, 6,6 };
		 
		 removeDuplicateElement(arr);
		 
		 
		 
		
		

	}

}
