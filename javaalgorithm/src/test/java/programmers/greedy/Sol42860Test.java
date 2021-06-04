package programmers.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Sol42860Test {

	private Sol42860 sol42860;

	@Before
	public void init() {
		sol42860 = new Sol42860();
	}

	@Test
	public void test() {
		assertEquals(56, sol42860.solution("JEROEN"));

	}

	@Test
	public void test1() {
		assertEquals(11, sol42860.solution("JAZ"));

		assertEquals(23, sol42860.solution("JAN"));
		assertEquals(7, sol42860.solution("BAAAAABBB"));

	}

}