package programmers.weekly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Week3Test {

	private Week3 week3;

	@Before
	public void setUp() throws Exception {
		week3 = new Week3();
	}

	@Test
	public void test1() {
		int[][] gameBoard = new int[][] {{1, 1, 0, 0, 1, 0}, {0, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 0, 1}, {1, 1, 0, 1, 1, 1},
			{1, 0, 0, 0, 1, 0}, {0, 1, 1, 1, 0, 0}};

		int[][] table = new int[][] {{1, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 1, 1}, {0, 0, 1, 0, 0, 0},
			{1, 1, 0, 1, 1, 0}, {0, 1, 0, 0, 0, 0}};

		assertEquals(14, week3.solution(gameBoard, table));
	}

	@Test
	public void test2() {
		int[][] gameBoard = new int[][] {{0,0,0}, {1,1,0}, {1,1,1}};

		int[][] table = new int[][] {{1, 1, 1}, {1, 0, 0}, {0, 0, 0}};

		assertEquals(0, week3.solution(gameBoard, table));
	}
}