package ArraysTest;

public class RemoveDuplicateFromTheArray {
	
   static int remDuplicate(int arr[],int n) {
	   
	   int temp[]= new int[n];
	   temp[0] =arr[0];
	   int res =1;
	   for(int i=1;i<n;i++) {
		   if(temp[res-1]!=arr[i]) {
			   temp[res]=arr[i];
			   res++;
			   
		   }
	   }
	   for(int i=0;i<res;i++) {
		   arr[i] =temp[i];
		   System.out.println(arr[i]);
	   }
	   return res;

	   
   }
 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int n=arr.length;
		
		System.out.println(remDuplicate(arr,n));
		System.out.println();
		
		}

	}


