package easy;

public class MyAtoi {
	public static int myAtoi(String str) {
		if (str == null||(str=str.trim()).equals("")) {
			return 0;
		} 
		if (str.charAt(0) == '-' || str.charAt(0) == '+' || Character.isDigit(str.charAt(0))) {
			if (Character.isDigit(str.charAt(0))) {
				str = "+" + str;
			}
			int flag = str.charAt(0) == '-' ? -1 : 1;
			long result = 0;
			for (int i = 1; i < str.length(); i++) {
				if (!Character.isDigit(str.charAt(i))) {
					break;
				}
				result = result * 10L + flag * (str.charAt(i) - '0');
				if (result >= Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				} else if (result <= Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
			}
			return (int) result;
		}
		return 0;
	}

	public static void main(String[] args) {
		String str = "     -42";
		System.out.println(myAtoi(str));
		
		int a=2,b=3;
		System.out.println(a|b+a&b);
		
	}
}
