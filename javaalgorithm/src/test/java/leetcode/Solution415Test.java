package leetcode;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Solution415Test {

	Solution415 sol = new Solution415();

	@Test
	public void case1() throws Exception {
		Assert.assertEquals("134", sol.addStrings("11", "123"));
	}

	@Test
	public void case2() throws Exception {
		Assert.assertEquals("533", sol.addStrings("456", "77"));
	}
}