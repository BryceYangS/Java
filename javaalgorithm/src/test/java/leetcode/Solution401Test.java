package leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Solution401Test {

	Solution401 sol = new Solution401();

	@Test
	public void case1() throws Exception {
		assertEquals(Arrays.asList("0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"), sol.readBinaryWatch(1));

	}
}