package leetcode.greedy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Sol763Test {

	Sol763 sol;

	@Before
	public void setUp() throws Exception {
		sol = new Sol763();
	}

	@Test
	public void case1() {
		List<Integer> exp = new ArrayList<>();
		exp.add(9);
		exp.add(7);
		exp.add(8);

		assertEquals(exp, sol.partitionLabels("ababcbacadefegdehijhklij"));
	}

	@Test
	public void case2() {
		List<Integer> exp = new ArrayList<>();
		exp.add(10);

		assertEquals(exp, sol.partitionLabels("eccbbbbdec"));
	}

	@Test
	public void case3() {
		List<Integer> exp = new ArrayList<>();
		exp.add(8);
		exp.add(1);
		exp.add(1);
		exp.add(1);

		assertEquals(exp, sol.partitionLabels("abcabcabhij"));
	}
}