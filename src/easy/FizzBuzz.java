package easy;

import java.util.ArrayList;
import java.util.List;

/*
 * 412. Fizz Buzz
 * Write a program that outputs the string representation of numbers from 1 to n.
 *But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”
 *
 *n = 15,
Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
 *
 * */
public class FizzBuzz {

	class Solution {
		public List<String> fizzBuzz(int n) {
			String[] strings = new String[n+1];
			List<String> list = new ArrayList<>(n);
			for (int i = 1; i < strings.length; i++) {
				strings[i]=""+i;
			}
			for (int i = 3; i < strings.length; i+=3) {
				strings[i]="Fizz";
			}
			for (int i =5; i < strings.length; i+=5) {
				strings[i]="Buzz";
			}
			for (int i =15; i < strings.length; i+=15) {
				strings[i]="FizzBuzz";
			}
			for (int i = 1; i < strings.length; i++) {
				list.add(strings[i]);
			}
			return list;
		}
	}

	public static void main(String[] args) {

		Solution s = new FizzBuzz().new Solution();
		int n = 15;
		System.out.println(s.fizzBuzz(n));

	}

}
