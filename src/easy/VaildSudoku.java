package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VaildSudoku {

	public static boolean isValidSudoku(char[][] board) {
		if (board.length != board[0].length || board.length % 9 != 0) {
			return false;
		}
		int len = board.length;
		for (int i = 0; i < len; i++) {
			List<Character> rs = new ArrayList<>(); // for each row num
			List<Character> cs = new ArrayList<>(); // for each col num
			for (int j = 0; j < len; j++) {
				if (board[i][j] != '.') {
					rs.add(board[i][j]);
				}
				if (board[j][i] != '.') {
					cs.add(board[j][i]);
				}
			}
			if (isRepeated(rs))
				return false;
			if (isRepeated(cs))
				return false;
		}
		for (int i = 0; i < len / 3; i++) {
			for (int j = 0; j < len / 3; j++) {
				List<Character> sub = new ArrayList<>();
				for (int k = 0; k < len / 3; k++) {
					for (int m = 0; m < len / 3; m++) {
						if (board[3 * i + k][3 * j + m] != '.') {
							sub.add(board[3 * i + k][3 * j + m]);
						}
					}
				}
				if (isRepeated(sub))
					return false;
			}
		}
		return true;
	}

	public static boolean isRepeated(List<Character> chs) {
		Set<Character> set = new HashSet<>(chs);
		return set.size() < chs.size();
	}

	public static void main(String[] args) {
		char[][] board = { { '.', '8', '7', '6', '5', '4', '3', '2', '1' },
				{ '2', '.', '.', '.', '.', '.', '.', '.', '.' }, { '3', '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '4', '.', '.', '.', '.', '.', '.', '.', '.' }, { '5', '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '6', '.', '.', '.', '.', '.', '.', '.', '.' }, { '7', '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '8', '.', '.', '.', '.', '.', '.', '.', '.' }, { '9', '.', '.', '.', '.', '.', '.', '.', '.' } };

		System.out.println(isValidSudoku(board));
		int a =Integer.MAX_VALUE;
		System.out.println(a/10);
		System.out.println((a*10+1));
	}
	

}
