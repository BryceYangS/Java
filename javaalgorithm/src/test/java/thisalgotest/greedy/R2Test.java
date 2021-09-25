package thisalgotest.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class R2Test {

	private R2 r2;

	@Before
	public void setUp() throws Exception {
		r2 = new R2();
	}

	@Test
	public void case1() {
		assertEquals(576, r2.sol("02984"));
	}

	@Test
	public void case2() {
		assertEquals(210, r2.sol("567"));
	}

	@Test
	public void case3() {
		assertEquals(217, r2.sol("5617"));
	}
}