package thisalgotest.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class R1Test {

	private R1 r1;

	@Before
	public void setUp() throws Exception {
		r1 = new R1();
	}

	@Test
	public void case1() {
		assertEquals(2, r1.sol(5, new int[]{2,3,1,2,2}));
	}

	@Test
	public void case2() {
		assertEquals(1, r1.sol(5, new int[]{5,5,5,5,5}));
	}

	@Test
	public void case3() {
		assertEquals(2, r1.sol(4, new int[]{1,3,3,3}));
	}
}