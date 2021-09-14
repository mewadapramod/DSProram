package arrayNumber;

import java.util.Arrays;

public class ArrayTripletsJavaProgram 
{
    private static void getArrayTriplets(int[] inputArray)
    {
        System.out.println("Input Array : "+Arrays.toString(inputArray));
         
        System.out.println("Array triplets with sum of first two elements equals third :");
         
        for (int i = 0; i < inputArray.length-2; i++) 
        {
            for (int j = i+1; j < inputArray.length-1; j++) 
            {
                for (int k = j+1; k < inputArray.length; k++)
                {
                    //Checking sum of any two elements equals third
                     
                    if (inputArray[i] + inputArray[j] == inputArray[k]) 
                    {   
                        System.out.println("["+inputArray[i]+", "+inputArray[j]+", "+inputArray[k]+"]");
                    }
                   // else if (inputArray[i] + inputArray[k] == inputArray[j]) 
                    //{
                     //   System.out.println("["+inputArray[i]+", "+inputArray[k]+", "+inputArray[j]+"]");
                    //}
                    //else if (inputArray[j] + inputArray[k] == inputArray[i])
                    //{
                      //  System.out.println("["+inputArray[j]+", "+inputArray[k]+", "+inputArray[i]+"]");
                    //}
                } 
            }
        }
    }
     
    public static void main(String[] args) 
    {
        getArrayTriplets(new int[] {21, 13, 47, 61, 34, 40, 55, 71, 87});
         
       // System.out.println("===========================================");
         
       // getArrayTriplets(new int[] {-1, 3, -2, 1, -4, 0, 5, 2, -3});
         
       // System.out.println("===========================================");
         
        //getArrayTriplets(new int[] {1, 3, 9, 2, 6, 4, 8, 5, 7});
    }
}