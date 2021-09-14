package arrayNumber;

import java.util.LinkedHashSet;

public class RemoveDuplicateWithSet {
	
	
	
	
	public static void removeDuplicate(int []arr) {
		
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		
		for(int i = 0 ; i< arr.length; i++) {
			
			hs.add(arr[i]);
		}
		
		System.out.println(hs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };

		
		removeDuplicate(arr);

	}

}
