package thisalgotest.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class R5Test {

	private R5 r5;

	@Before
	public void setUp() throws Exception {
		r5 = new R5();
	}

	@Test
	public void case1() {
		assertEquals(8, r5.sol(new int[]{1,3,2,3,2}));
		assertEquals(8, r5.solByBook(new int[]{1,3,2,3,2}));
	}

	@Test
	public void case2() {
		assertEquals(25, r5.sol(new int[]{1,5,4,3,2,4,5,2}));
		assertEquals(25, r5.solByBook(new int[]{1,5,4,3,2,4,5,2}));
	}
}