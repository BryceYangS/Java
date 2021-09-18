package programmers.weekly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Weekly1Test {

	private Weekly1 weekly1;

	@Before
	public void setUp() throws Exception {
		weekly1 = new Weekly1();
	}

	@Test
	public void test1() {
		assertEquals(10, weekly1.solution(3,20,4));
	}
}