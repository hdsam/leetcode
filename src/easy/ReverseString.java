package easy;

/*
 * 344. Reverse String
 *	Write a function that takes a string as input and returns the string reversed.
Example:
Given s = "hello", return "olleh". 
 * */
public class ReverseString {

	class Solution {
	    public String reverseString(String s) {
	    	char[] chs=s.toCharArray();
	    	for (int i = 0; i < chs.length/2; i++) {
				char temp=chs[i];
				chs[i]=chs[chs.length-1-i];
				chs[chs.length-1-i]=temp;
			}
			return new String(chs);
	    }
	}
	
	
	public static void main(String[] args) {
		String str="Hello World!";
		Solution s=new ReverseString().new Solution();
		String reversedString=s.reverseString(str);
		System.out.println(reversedString);
	}

}
