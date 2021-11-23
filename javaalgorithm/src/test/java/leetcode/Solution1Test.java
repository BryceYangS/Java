package leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution1Test {

	Solution1 sol = new Solution1();

	@Test
	public void case1() throws Exception {
		assertArrayEquals(new int[]{0,1}, sol.twoSum(new int[]{2,7,11,15}, 9));
	}

}