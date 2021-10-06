package programmers.bfsdfs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sol43165Test {

	Sol43165 sol;

	@Before
	public void setUp() throws Exception {
		sol = new Sol43165();
	}

	@Test
	public void case1() throws Exception {
		assertEquals(5, sol.solution(new int[]{1,1,1,1,1}, 3));
	}
}	