package leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution13Test {
	Solution13 sol = new Solution13();

	@Test
	public void case1() throws Exception {
		assertEquals(3, sol.romanToInt("III"));
	}

	@Test
	public void case2() throws Exception {
		assertEquals(4, sol.romanToInt("IV"));
	}

	@Test
	public void case3() throws Exception {
		assertEquals(1994, sol.romanToInt("MCMXCIV"));
	}

}