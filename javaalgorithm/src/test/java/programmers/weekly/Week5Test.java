package programmers.weekly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Week5Test {

	private Week5 week5;

	@Before
	public void setUp() throws Exception {
		week5 = new Week5();
	}

	@Test
	public void test1() {
		assertEquals(6, week5.solution("AAAAE"));
	}

}