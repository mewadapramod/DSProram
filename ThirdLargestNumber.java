package arrayNumber;

public class ThirdLargestNumber {
	
	
	
	public static int thirdlargestNumber(int[]arr, int total) {
		
		
		int temp;
		
		for(int i =0;i<total; i++) {
			
			for(int j =i+1; j<total; j++) {
				
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		return arr[total-3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[]={44,66,99,77,33,22,55,77};  

	System.out.println(thirdlargestNumber(b,b.length));
	}

}
