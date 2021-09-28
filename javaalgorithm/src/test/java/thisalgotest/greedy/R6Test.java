package thisalgotest.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class R6Test {

	private R6 r6;

	@Before
	public void setUp() throws Exception {
		r6 = new R6();
	}

	@Test
	public void case1() {
		assertEquals(1, r6.solution(new int[]{3,1,2}, 5));
	}

}