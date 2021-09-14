package ArraysTest;

public class ReverseEachElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codedMessage[] = { 334, 384, 105, 222, 61, 2, 175, 228, 114, 235, 241, 213, 206, 3, 321, 152, 214, 137, 224,
				500 };
		
		int []message = new int[codedMessage.length];
		
		String num;
		
		for(int i =0;i<codedMessage.length;i++) {
			
			num = codedMessage[i]+"";
			
			if(num.length()>=1) {
				
				message[i] = reverse(num);
				
			}
			else {
				message[i] = codedMessage[i];
				
			}
			}
		for(int i=message.length-1;i>=0;i--) {
			
			 
			System.out.println(message[i]);
		}
		
		
		}
		
		
		
		
		public static int reverse(String num) {
			
			int number = Integer.parseInt(""+(new StringBuffer(num).reverse()));
			
			return number;
			
		}

	}


