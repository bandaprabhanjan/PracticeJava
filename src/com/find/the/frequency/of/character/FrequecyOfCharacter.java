package com.find.the.frequency.of.character;

import java.util.HashMap;
import java.util.Map;

public class FrequecyOfCharacter {

	public static void main(String[] args) {
		String inputText = "Prabhanjan Banda";
		findEachCharacterCount(inputText);

	}

	private static void findEachCharacterCount(String inputText) {
		Map<Character, Integer> charMapCount = new HashMap<Character, Integer>();
		char[] charArray = inputText.toCharArray();
		for (char c : charArray) {
			if(c == ' ') {
				continue;
			}
			if (charMapCount.containsKey(c)) {
				charMapCount.put(c, charMapCount.get(c) + 1);
			} else {
				charMapCount.put(c, 1);
			}
		}
		charMapCount.forEach((k, v) -> System.out.println(k + ":" + v));

	}

}
