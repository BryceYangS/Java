package programmers.sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sol42747Test {

	private Sol42747 sol;

	@Before
	public void setUp() throws Exception {
		sol = new Sol42747();
	}

	@Test
	public void test1() {
		assertEquals(3, sol.solution(new int[]{3,0,6,1,5}));
	}

	@Test
	public void test2() {
		assertEquals(1, sol.solution(new int[]{1,1,1}));
	}


	@Test
	public void test3() {
		assertEquals(3, sol.solution(new int[]{0,3,6,1,5}));
	}

	@Test
	public void test4() {
		assertEquals(1, sol.solution(new int[]{0,0,0,1}));
	}

	@Test
	public void test5() {
		assertEquals(0, sol.solution(new int[]{0,0,0,0}));
	}
}