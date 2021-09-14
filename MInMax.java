package arrayNumber;

public class MInMax {
	
	
	public static int maxValue(int[] arr) {
		
		int maxValue = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] > maxValue) {
				
				maxValue = arr[i];
			}
		}
		
		return maxValue;
	}
	
public static int minValue(int[] arr) {
		
		int minValue = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] < minValue) {
				
				minValue = arr[i];
			}
		}
		
		return minValue;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
