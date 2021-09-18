package programmers.weekly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Week2Test {

	private Week2 week2;

	@Before
	public void setUp() throws Exception {
		week2 = new Week2();
	}

	@Test
	public void test1() {
		assertEquals("DA", week2.solution(new int[][]{{50,90},{50,87}}));
	}
	
	@Test
	public void test2() {
		assertEquals("FBABD", week2.solution(new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}}));
	}

	@Test
	public void test3() {
		assertEquals("CFD", week2.solution(new int[][]{{70,49,90},{68,50,38},{73,31,100}}));
	}

	@Test
	public void test4() {
		assertEquals("DDDD", week2.solution(new int[][]{{70, 70, 70, 70}, {50, 50, 50, 50}, {70, 70, 70, 70}, {50, 50, 50, 50}}));
	}
	
	@Test
	public void test5() {
		assertEquals("BBBB", week2.solution(new int[][] {{90, 90, 90, 90}, {70, 70, 70, 70}, {90, 90, 90, 90}, {70, 70, 70, 70}}));
	}
	
}