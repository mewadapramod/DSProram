package arrayNumber;
class Solution {
    public static int findNumbers(int[] nums) {
        
        int count =0;
        
for(int num : nums)  
    
    if(String.valueOf(num).length() % 2 == 0){
        count++;
    }
        return count;
    }
    
    public static void main(String[]args) {
    	
    	int []arr = {12,345,2,6,7896};
    	
    	System.out.println(findNumbers(arr));
    }
}