package thisalgotest.dijkstra;

import org.junit.Test;

public class DijkstraTest {
	Dijkstra dij = new Dijkstra();

	@Test
	public void case1() throws Exception {
		// given
		dij.solution(6, 11, 1,
			new int[][] {{1, 2, 2}, {1, 3, 5}, {1, 4, 1}, {2, 3, 3}, {2, 4, 2}, {3, 2, 3}, {3, 6, 5}, {4, 3, 3},
				{4, 5, 1}, {5, 3, 1}, {5, 6, 2}});

		// when

		// then
	}
}