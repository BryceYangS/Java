package thisalgotest.greedy;

import java.util.Arrays;

public class R4 {
	public int sol(int[] coins) {

		Arrays.sort(coins);

		int target = 1;
		for (int coin : coins) {
			if (target < coin) {
				break;
			}
			target += coin;
		}

		return target;
	}
}
