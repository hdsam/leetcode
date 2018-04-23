package easy;


/*
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, 
 * judge if this robot makes a circle, which means it moves back to the original place.
 * 
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
 * The output should be true or false representing whether the robot makes a circle.
 */
public class JudgeRouteCircle {

	class Solution {
		public boolean judgeCircle(String moves) {
			int x = 0;
			int y = 0;
			if (moves.length() % 2 != 0) {
				return false;
			}
			char[] chs = moves.toCharArray();
			for (int i = 0; i < chs.length; i++) {
				switch (chs[i]) {
				case 'L':
					x--;
					break;
				case 'R':
					x++;
					break;
				case 'U':
					y++;
					break;
				case 'D':
					y--;
					break;
				default:
					return false;
				}
			}
			return x == 0 && y == 0;
		}

	}

	public static void main(String[] args) {

		Solution s = new JudgeRouteCircle().new Solution();
		String moves = "LRLRRRRLLLUDR";
		System.out.println(s.judgeCircle(moves));
	}

}
