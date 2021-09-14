package ArraysTest;

public class Snippet {
	public static void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        int n=arr.length;
        arr[n-1]=element;
        int lenght = arr.length;
        for(int i=0; i<=arr.length-1;i++) {
        	System.out.println(arr[i]);
        }
        
    }
	public static void main(String[]args) {
		
		int []arra= {1, 2, 3, 4, 5};
		insertAtEnd(arra, arra.length-1,50);
		
	}
		
	}


