package programmers.bfsdfs;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Sol43164Test {

	private Sol43164 sol43164;

	@Before
	public void init() {
		sol43164 = new Sol43164();
	}

	@Test
	public void first() {
		String[] solution = sol43164.solution(new String[][] {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
		assertTrue(Arrays.equals(solution, new String[] {"ICN", "JFK", "HND", "IAD"}));
	}

	@Test
	public void second() {
		String[] solution = sol43164.solution(new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}}	);
		assertTrue(Arrays.equals(solution, new String[] {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}));
	}

	@Test
	public void third(){
		String[] solution = sol43164.solution(new String[][] {{"ICN", "AOO"}, {"AOO", "BOO"}, {"BOO", "COO"}, {"COO", "DOO"}, {"DOO", "EOO"}, {"EOO", "DOO"}, {"DOO", "COO"}, {"COO", "BOO"}, {"BOO", "AOO"}});
		assertTrue(Arrays.equals(solution, new String[] {"ICN", "AOO", "BOO", "COO", "DOO", "EOO", "DOO", "COO", "BOO", "AOO"}));

	}


}