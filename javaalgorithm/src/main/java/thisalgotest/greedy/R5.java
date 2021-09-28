package thisalgotest.greedy;

import java.util.Arrays;

public class R5 {
	public int sol(int[] k) {
		int answer = 0;

		for (int i = 0; i < k.length - 1; i++) {
			for (int j = i+1; j < k.length; j++) {
				if (k[i] != k[j]) {
					answer += 1;
				}
			}
		}

		return answer;
	}

	public int solByBook(int[] k) {

		int[] bowl = new int[k.length + 1];

		for (int i = 0; i < k.length; i++) {
			bowl[k[i]] += 1;
		}

		int result = 0;
		int max = Arrays.stream(k).max().getAsInt();

		int n = k.length;
		for (int i = 1; i < max + 1; i++) {
			n -= bowl[i];
			result += n * bowl[i];
		}

		return result;
	}
}
