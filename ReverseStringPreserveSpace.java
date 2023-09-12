package arrayNumber;

public class ReverseStringPreserveSpace {
	
	
	
	public static void preserveSpace(String str) {
		
		
		int n = str.length();
		
		int start = 0;
		int end = n-1;
		
		char [] input = str.toCharArray();
		
		while(start < end) {
			
			
			if(input[start] ==' ') {
				
				
				start++;
				
				continue;
			}
			
			else if(input[end] == ' ') {
				
				end--;
				continue;
			}
			
			else {
				
				char temp = input[start];
				input[start] = input[end];
				
				input[end] = temp;
				start++;
				end --;
				
			}
		}
		
	    System.out.println(String.valueOf(input));

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String str = "internship at peeks at peeks";

	    preserveSpace(str);

	}

}
