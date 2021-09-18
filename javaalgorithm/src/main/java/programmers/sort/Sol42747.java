package programmers.sort;

import java.util.Arrays;

public class Sol42747 {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		int n = citations.length;
		for (int i = 0; i < n; i++) {
			int h = citations[i];
			int k = citations.length - i;
			if (k <= h) {
				answer = k;
				break;
			}
		}
		return answer;
	}
}
