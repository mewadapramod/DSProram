package ArraysTest;

public class SearchAnArray {
	
	public static int intArray(int arr[],int n,int x) {
		
		
		for(int i=0;i<=n;i++) {
			if(arr[i]==x) 
				return i;
			
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []num= {1,2,4,5,6};
int n=num.length-1;
int check =5;
		
System.out.println(intArray(num,n,check));	
}
	

}
