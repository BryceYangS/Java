package thisalgotest.greedy;

import java.util.Arrays;

public class R1 {
	public int sol(int N, int[] K) {
		int answer = 0;
		Arrays.sort(K);
		for (int i = 0; i < N - 1; i++) {
			int k = K[i];
			int num = 1;
			for (int j = i+1; j < N; j++) {
				if (K[j] <= k && num < k) {
					num += 1;
					i += 1;
					continue;
				}
				break;
			}
			if (num == k) {
				answer += 1;
			}
		}

		return answer;
	}
}
