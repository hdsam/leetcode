package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorse {

	public static int uniqueMorseRepresentations(String[] words) {
		if (words == null || words.length < 1) {
			return 0;
		}
		if (words.length == 1) {
			return 1;
		}
		String[] ref = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		StringBuilder[] encoded = new StringBuilder[words.length];
		Set<String> result = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			encoded[i] = new StringBuilder();
			for (char letter : words[i].toCharArray()) {
				if (letter - 'z' > 0)
					break;
				encoded[i].append(ref[letter - 'a']);
			}
			result.add(encoded[i].toString());
		}
		return result.size();
	}

	public static void main(String[] args) {
		String[] words= {"gin", "zen", "gig", "msg"};
		int nums = uniqueMorseRepresentations(words);
		System.out.println(nums);
		

	}

}
