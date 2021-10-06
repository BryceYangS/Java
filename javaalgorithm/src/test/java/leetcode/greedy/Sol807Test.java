package leetcode.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sol807Test {

	Sol807 sol807;

	@Before
	public void setUp() throws Exception {
		sol807 = new Sol807();
	}

	@Test
	public void case1() {
		assertEquals(35, sol807.maxIncreaseKeepingSkyline(new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}}));
	}

	@Test
	public void case2() {
		assertEquals(117, sol807.maxIncreaseKeepingSkyline(new int[][]{{59,88,44},{3,18,38},{21,26,51}}));
	}
}