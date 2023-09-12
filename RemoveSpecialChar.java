package arrayNumber;

public class RemoveSpecialChar {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This#string%contains^special*characters9&.";
		
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(str);

	}

}
