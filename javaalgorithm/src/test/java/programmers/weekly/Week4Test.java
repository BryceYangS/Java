package programmers.weekly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Week4Test {

	private Week4 week4;

	@Before
	public void setUp() throws Exception {
		week4 = new Week4();
	}

	@Test
	public void test1() {
		assertEquals("HARDWARE", week4.solution(
			new String[] {
				"SI JAVA JAVASCRIPT SQL PYTHON C#",
				"CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
				"PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA"},
			new String[] {"PYTHON", "C++", "SQL"},
			new int[] {7, 5, 5}));
	}

	@Test
	public void test2() {
		assertEquals("PORTAL", week4.solution(
			new String[] {
				"SI JAVA JAVASCRIPT SQL PYTHON C#",
				"CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
				"PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA"},
			new String[] {"JAVA", "JAVASCRIPT"},
			new int[] {7, 5}));
	}
}