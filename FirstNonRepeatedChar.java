package stringLogic;

import java.util.HashMap;

public class FirstNonRepeatedChar {

	public static char firstNonRepeated(String word) {
		
		
		

		HashMap<Character, Integer> scoreboard = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.containsKey(c)) {
				scoreboard.put(c, scoreboard.get(c) + 1);
			} else {
				scoreboard.put(c, 1);
			}
		}
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.get(c) == 1) {
				return c;
			}
		}
		throw new RuntimeException("Undefined behaviour");

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";

		System.out.println(firstNonRepeated(s));

	}

}
