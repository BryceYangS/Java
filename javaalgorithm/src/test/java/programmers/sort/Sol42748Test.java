package programmers.sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sol42748Test {

	private Sol42748 sol;

	@Before
	public void setUp() {
		sol = new Sol42748();
	}

	@Test
	public void test1() {
		assertArrayEquals(new int[]{5, 6, 3}, sol.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
	}
}