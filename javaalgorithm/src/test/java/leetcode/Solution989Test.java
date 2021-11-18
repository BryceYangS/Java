package leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Solution989Test {

	Solution989 sol = new Solution989();

	@Test
	public void case1() throws Exception {

		Assert.assertEquals(Arrays.asList(1,2,3,4), sol.addToArrayForm(new int[]{1,2,0,0}, 34));

	}

}