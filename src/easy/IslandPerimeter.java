package easy;

/*
 * 463. Island Perimeter
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 *[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below:

 *
 * */
public class IslandPerimeter {

	class Solution {
	public int islandPerimeter(int[][] grid) {
		int preimeter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					preimeter+=4;
					preimeter-=adJacent(i, j, grid);
				}
			}
		}
		return preimeter;
	}

	private int adJacent(int i, int j, int[][] grid) {
		int adjacent = 0;
		if (i - 1 >= 0)
			adjacent += grid[i - 1][j];// up
		if (i + 1 < grid.length)
			adjacent += grid[i + 1][j];// down
		if (j - 1 >= 0) // left
			adjacent += grid[i][j - 1];
		if (j + 1 < grid[0].length) // right
			adjacent += grid[i][j + 1];
		return adjacent ;
	}
	}

	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 0, 0 },
						 { 1, 1, 1, 0 }, 
						 { 0, 1, 0, 0 },
						 { 1, 1, 0, 0 } };

		Solution s = new IslandPerimeter().new Solution();
		int ans = s.islandPerimeter(grid);
		System.out.println(ans);
	}

}
