package arrayNumber;

import java.util.*;

public class Main {
  
  
  public static boolean checkAnagraminSecondString(String x, String y){
    
    if(x.length()> y.length()){
       
       return false;
    }
    
    Map<Character,Integer> map = new HashMap<>();
    
    for(int i = 0; i<y.length(); i++){
      if(map.containsKey(y.charAt(i))){
        
        map.put(y.charAt(i), map.get(y.charAt(i))+1);
      }
      else{
        map.put(y.charAt(i), 1);
      }
    }
    
    for(int i =0; i<x.length(); i++){
      
      if(!map.containsKey(x.charAt(i))){
        
        return false;
      }
    
    }
    return true;
  }
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
     System.out.println( checkAnagraminSecondString("pqw","abcded"));
      
    }
  }
