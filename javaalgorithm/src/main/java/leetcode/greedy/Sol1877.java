package leetcode.greedy;

import java.util.Arrays;

/**
 * Minimize Maximum Pair Sum in Array
 */
public class Sol1877 {
	public int minPairSum(int[] nums) {
		Arrays.sort(nums);

		int answer = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			answer = Math.max(answer, nums[i] + nums[nums.length - i - 1]);
		}
		return answer;
	}
}
