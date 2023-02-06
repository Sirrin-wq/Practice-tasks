package tms;

import java.util.HashMap;

/*
 * Counts how many times each word appears in a certain String 
 */
public class WordCounterWithMap {
	public static void main(String[] args) {
		String sentence = "One two three four five two three three four four four five five five five";
		String[] words = sentence.split(" ");
		
		HashMap<String, Integer> wordCounter = new HashMap<>();
		
		for (int i = 0; i <= words.length - 1; i++) {
			if (wordCounter.containsKey(words[i])) { 
				int counter = wordCounter.get(words[i]);
				wordCounter.put(words[i], counter + 1);
			}
			else {
				wordCounter.put(words[i], 1); 
			}
		}
		
		for (String i: wordCounter.keySet()) {
			System.out.println("key: " + i + " value: " + wordCounter.get(i));
		}
	}

}
