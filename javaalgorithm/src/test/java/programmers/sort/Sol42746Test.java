package programmers.sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sol42746Test {

	private Sol42746 sol;

	@Before
	public void setUp() throws Exception {
		sol = new Sol42746();
	}

	@Test
	public void test1() {
		assertEquals("6210", sol.solution(new int[]{6,10,2}));
	}

	@Test
	public void test2() {
		assertEquals("9534330", sol.solution(new int[]{3, 30, 34, 5, 9}));
	}
}