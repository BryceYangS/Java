package programmers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sol42842Test {

	private Sol42842 sol;

	@Before
	public void setUp() {
		sol = new Sol42842();
	}

	@Test
	public void case1() {
		assertArrayEquals(new int[]{4,3}, sol.solution(10,2));
	}

	@Test
	public void case2() {
		assertArrayEquals(new int[]{3,3}, sol.solution(8,1));
	}

	@Test
	public void case3() {
		assertArrayEquals(new int[]{8,6}, sol.solution(24, 24));
	}
}