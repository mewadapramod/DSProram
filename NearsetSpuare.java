package arrayNumber;

public class NearsetSpuare {
	
	
	public static int findNearestSquare(int num){

		// find the square root

		int num1 = (int) Math.sqrt(num);

		// if square root square’s is num… given number is a Perfect Square return the same //number

		if(num1 * num1 == num)

		return num;

		else{

		// else calculate floor_square and ceil_square get absolute difference between num

		// which is minimum that is the nearest square num

		int floorSquare = num1 * num1;

		int ceilingSquare = (num1 + 1) * (num1 + 1);

		if(Math.abs(floorSquare-num) < Math.abs(ceilingSquare -num) )

		return floorSquare;

		else

		return ceilingSquare;

		}

		}
	
	
	public static void main(String[]args) {
		
		
		System.out.println(findNearestSquare(23));
	}

}
