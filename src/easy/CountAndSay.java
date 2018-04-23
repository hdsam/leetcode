package easy;

public class CountAndSay {

	public static String countAndSay(int n) {
		if (n == 1) {
			return "1";
		} else {
			String s = countAndSay(n - 1);
			StringBuilder say = new StringBuilder();
			char[] chs = s.toCharArray();
			int count = 1;
			char digit = chs[0];
			for (int i = 1; i < chs.length; i++) {
				if (chs[i]== digit)
					count++;
				else {
					say.append(count).append(digit);
					count = 1;
					digit = chs[i];
				}
			}
			return say.append(count).append(digit).toString();
		}
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(n);
		System.out.println(countAndSay(n));
	}

}
