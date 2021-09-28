package thisalgotest.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class R4Test {

	private R4 r4;

	@Before
	public void setUp() throws Exception {
		r4 = new R4();
	}

	@Test
	public void case1() {
		assertEquals(8, r4.sol(new int[]{3,2,1,1,9}));
	}

	@Test
	public void case2() {
		assertEquals(1, r4.sol(new int[]{35,7}));
	}
}