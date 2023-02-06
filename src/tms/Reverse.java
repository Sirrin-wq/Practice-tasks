package tms;

/*
 * Reverses words in the sentence without changing their order 
 */
public class Reverse {

	public static void main(String[] args) {
		String test = "This is an example";
		System.out.println(reverseString(test));

	}
	
	static String reverseString (String original) {
		
		if (original.trim().length() == 0){
		      return original;
		} else if (original.contains(" ")) {
			String[] words = original.split(" "); // splits sentence into words
			String[] reverseWords = new String[words.length]; 
			
//			words = reverse(words);
	
			for(int i = 0; i < words.length; i++) {
				
				String[] letters = words[i].split(""); // splits words into letters
				letters = reverse(letters);
				reverseWords[i] = String.join("", letters);
			}
			return String.join(" ", reverseWords);
		} else {
			String[] rev = original.split("");
			rev = reverse(rev);
			return String.join("", rev);
	
		}
	}
	
	static String[] reverse(String[] arr) {
		String tmp;
		for(int j = 0, k = arr.length - 1; j < k; j++, k--) { // reverses order
			tmp = new String(arr[j]);
			arr[j] = new String(arr[k]);
			arr[k] = new String(tmp);
		}
		return arr;
	}

}
