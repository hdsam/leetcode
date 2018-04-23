package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 500. Keyboard Row
 * 
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * 
 * 
 * 
Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
 * 
 * */
public class KeyboardRow {


	class Solution {
		final char[][] table = { 
				{ 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P' },
				{ 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L' }, 
				{ 'Z', 'X', 'C', 'V', 'B', 'N', 'M' } };
		
		public String[] findWords(String[] words) {
			List<String> stringList = new ArrayList<>();
			for (int i = 0; i < words.length; i++) {
				if (isInOneRow(words[i].toUpperCase())) {
					stringList.add(words[i]);
				}
			}
			return stringList.toArray(new String[stringList.size()]);
		}

		private boolean isInOneRow(String word) {
			boolean inOneRow = true;
			int firstLetterRow = findRow(word.charAt(0));
			for (int i = 1; i < word.length(); i++) {
				if (firstLetterRow != findRow(word.charAt(i))) {
					inOneRow = false;
					break;
				}
			}
			return inOneRow;
		}

		private int findRow(char ch) {
			int row = Integer.MIN_VALUE;
			for (int i = 0; i < table.length; i++) {
				for (char c : table[i]) {
					if (c == ch)
						row = i;
				}
			}
			return row;
		}
	}

	public static void main(String[] args) {
		Solution s = new KeyboardRow().new Solution();
		List<String> strings = new ArrayList<>();
		strings.add("AsAD");
		strings.add("Kesf");
		strings.add("kxsk");
		strings.add("WWWzW");
		String[] resultStrings = s.findWords(strings.toArray(new String[4]));
		System.out.println(Arrays.toString(resultStrings));
	}

}
