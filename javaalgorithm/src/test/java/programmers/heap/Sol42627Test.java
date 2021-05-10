package programmers.heap;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class Sol42627Test {

	private Sol42627 sol42627;

	@Before
	public void init() {
		sol42627 = new Sol42627();
	}

	@Test
	public void 테스트1() {

		//given
		int[][] input = {
			{
				0, 3
			}, {
			1, 9
		}, {
			2, 6
		}
		};
		//when

		//then
		assertThat(sol42627.solution(input)).isEqualTo(9);
	}

}