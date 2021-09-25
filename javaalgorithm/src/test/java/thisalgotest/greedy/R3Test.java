package thisalgotest.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class R3Test {

	private R3 r3;

	@Before
	public void setUp() {
		r3 = new R3();
	}

	@Test
	public void case1() {
		assertEquals(1, r3.sol("0001100"));
	}

	@Test
	public void case2() {
		assertEquals(2, r3.sol("00011001"));
	}

	@Test
	public void case3() {
		assertEquals(0, r3.sol("1111"));
	}

	@Test
	public void case4() {
		assertEquals(1, r3.sol("110"));
	}

	@Test
	public void case5() {
		assertEquals(4, r3.sol("10101010"));
	}
}