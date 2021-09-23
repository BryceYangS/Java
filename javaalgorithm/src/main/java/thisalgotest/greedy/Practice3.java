package thisalgotest.greedy;

import java.io.IOException;
import java.util.Arrays;

/**
 * 숫자 카드 게임
 */
public class Practice3 {

	public int solution(int[][] arr) throws IOException {

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
			max = Math.max(arr[i][0], max);
		}

		return max;
	}
}
