package arrayNumber;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZero {
	
	
	public static void duplicateZeros(int [] arr) {
		 int len = arr.length;
		 
		 Queue<Integer> queue = new LinkedList<Integer>();
		
		 
		 for(int i = 0; i<len; i++) {
			 
			 queue.offer(arr[i]);
			 if(arr[i] ==0) {
				 
				 queue.offer(0);
			 }
			 
		 }
		 for(int i =0; i<len;i++) {
			 
			 arr[i] = queue.poll();
			 
			  
		 }
		 
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}

		
	}

}
