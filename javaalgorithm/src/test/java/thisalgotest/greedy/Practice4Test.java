package thisalgotest.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Practice4Test {

	private Practice4 pr;

	@Before
	public void setUp() throws Exception {
		pr = new Practice4();
	}

	@Test
	public void case1() {
		assertEquals(3, pr.solution(17,4));
		assertEquals(3, pr.bookSol2(17,4));
	}

	@Test
	public void case2() {
		assertEquals(2, pr.solution(25,5));
		assertEquals(2, pr.bookSol2(25,5));
	}

	@Test
	public void case3() {
		assertEquals(6, pr.solution(25,3));
		assertEquals(6, pr.bookSol2(25,3));
	}
}