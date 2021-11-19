package leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution557Test {

	Solution557 sol = new Solution557();

	@Test
	public void case1() throws Exception {
		assertEquals("s'teL ekat edoCteeL tsetnoc", sol.reverseWords("Let's take LeetCode contest"));
	}

}