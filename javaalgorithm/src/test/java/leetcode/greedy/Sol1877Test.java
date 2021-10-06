package leetcode.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sol1877Test {

	Sol1877 sol;

	@Before
	public void setUp() throws Exception {
		sol = new Sol1877();
	}

	@Test
	public void case1() throws Exception {
		assertEquals(7, sol.minPairSum(new int[]{3,5,2,3}));
	}

	@Test
	public void case2() throws Exception {
		assertEquals(8, sol.minPairSum(new int[]{3,5,4,2,4,6}));
	}
}