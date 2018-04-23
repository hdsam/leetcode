package easy;


//557. Reverse Words in a String III
/*
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 * 
 * */
public class ReverseWordsInAStringIII {

	class Solution {
		public String reverseWords(String s) {
			final StringBuilder sbr = new StringBuilder();
			for (String arr : s.split(" ")) {
				final char[] chs = arr.toCharArray();
				for (int i = 0; i < chs.length/2; i++) {
					char ch=chs[i];
					chs[i]=chs[chs.length-1-i];
					chs[chs.length-1-i]=ch;
				}
				sbr.append(chs).append(" ");
			}
			return sbr.toString().trim();
		}
	}

	public static void main(String[] args) {
		Solution s=new ReverseWordsInAStringIII().new Solution();
		String str="Let's take LeetCode contest";
		String reverseResult=s.reverseWords(str);
		System.out.println(reverseResult);
		
		System.out.println("a a ".trim().length());
		
		
	}

}
