package leetcode.greedy;

import java.util.Arrays;

public class Sol807 {

	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int answer = 0;

		int[] rowMax = new int[grid.length];
		int[] colMax = new int[grid.length];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				rowMax[i] = Math.max(grid[i][j], rowMax[i]);
 				colMax[j] = Math.max(grid[i][j], colMax[j]);
			}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				answer += Math.min(rowMax[i], colMax[j]) - grid[i][j];
			}
		}

		return answer;
	}

}
