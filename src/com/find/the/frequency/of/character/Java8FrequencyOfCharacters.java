package com.find.the.frequency.of.character;

import java.util.HashMap;
import java.util.Map;

public class Java8FrequencyOfCharacters {

	public static void main(String[] args) {
		String inputText = "Prabhanjan";
		findEachCharacterCount(inputText);

	}

	private static void findEachCharacterCount(String inputText) {
	Map<Character, Integer> charMapCount = new HashMap<Character, Integer>();
	char[] charArray = inputText.toCharArray();
	for (char word : charArray) {
			/*
			 * charMapCount.computeIfPresent(word, (k,v)->v+1); 
			 * charMapCount.computeIfAbsent(word,v->1);
			 */
		//charMapCount.merge(word, 1, Integer::sum);
		//below code read it as put 1 under the word key if absent; otherwise, add 1 to the existing value
		charMapCount.merge(word, 1, (prev,one)->(prev+one));
	}	
	System.out.println(charMapCount);
		
	}

}
