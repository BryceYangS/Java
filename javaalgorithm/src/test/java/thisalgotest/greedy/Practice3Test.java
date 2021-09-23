package thisalgotest.greedy;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class Practice3Test {

	private Practice3 pr;

	@Before
	public void setUp() throws Exception {
		pr = new Practice3();
	}

	@Test
	public void case1() throws IOException {
		assertEquals(2, pr.solution(new int[][]{{3,1,2}, {4,1,4}, {2,2,2}}));
	}

	@Test
	public void case2() throws IOException {
		assertEquals(3, pr.solution(new int[][]{{7,3,1,8}, {3,3,3,4}}));
	}
}