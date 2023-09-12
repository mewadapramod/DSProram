package arrayNumber;

public class Reverse {
	public static void main(String args[]) {
		int codedMessage[] = { 334, 384, 105, 222, 61, 2, 175, 228, 114, 235, 241, 213, 206, 3, 321, 152, 214, 137, 224,
				500 };
		String num;
			int message[] = new int[codedMessage.length];
		for (int i = 0; i < codedMessage.length; i++) {
			num = codedMessage[i] + "";
			if (num.length() >= 1) {
				message[i] = reverse(num);
				// System.out.println("Reverse="+message[i]);
			} else {
				message[i] = codedMessage[i];
				// System.out.println(message[i]);
			}
		}

		for (int i = message.length - 1; i >= 0; i--) {

			System.out.println(message[i]);
		}
	}

	public static int reverse(String num)

	{

		
		  int number;
		  number=Integer.parseInt(""+(new StringBuffer(num).reverse()));
		  return number;
		 

	}

}