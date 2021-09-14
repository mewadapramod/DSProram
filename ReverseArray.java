package arrayNumber;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr = {1, 2, 3, 4, 5};
		
		for(int i =0; i< arr.length; i++) {
			System.out.println("Original array "+ arr[i]);
		}
		
		System.out.println( );
		
		for(int j = arr.length-1; j>=0; j--) {
			
			
			System.out.println("reverse array "+ arr[j]);
		}

	}

}
