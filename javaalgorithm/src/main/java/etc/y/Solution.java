package etc.y;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	// int expectedSum = A.length * (A.length + 1) / 2;
	// int realSum = Arrays.stream(A).sum();

	public static int solution(String G) {
		// write your code in Java SE 8

		List<Character> gestures = new ArrayList<Character>(Arrays.asList('P', 'S', 'R'));

		int max = 0;
		for (int i = 0; i < gestures.size(); i++) {

			int sum = 0;
			if (i == 0) { // 보
				for (int j = 0; j < G.length(); j++) {
					int rspIndex = gestures.indexOf(G.charAt(j));
					if (rspIndex == 0) { // 보
						sum += 1;
					} else if (rspIndex == 1) { // 가위
						sum += 0;
					} else { // 주먹
						sum += 2;
					}
				}
				max = Math.max(max, sum);
			} else if (i == 1) { // 가위
				for (int j = 0; j < G.length(); j++) {
					int rspIndex = gestures.indexOf(G.charAt(j));
					if (rspIndex == 0) { // 보
						sum += 2;
					} else if (rspIndex == 1) { // 가위
						sum += 1;
					} else { // 주먹
						sum += 0;
					}
				}
				max = Math.max(max, sum);
			} else {
				for (int j = 0; j < G.length(); j++) {
					int rspIndex = gestures.indexOf(G.charAt(j));
					if (rspIndex == 0) { // 보
						sum += 0;
					} else if (rspIndex == 1) { // 가위
						sum += 2;
					} else { // 주먹
						sum += 1;
					}
				}
				max = Math.max(max, sum);
			}
		}
		return max;
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8

		int expectedSum = A.length * (A.length + 1) / 2;
		int realSum = Arrays.stream(A).sum();
		return Math.abs(expectedSum - realSum);
	}

	public static int solution(String L1, String L2) {
		// write your code in Java SE 8
		return 0;
	}

	public static void main(String[] args) {
		// System.out.println(solution("RSPRS"));
		// System.out.println(solution(new int[] {6, 2, 3, 5, 6, 3}));
		// System.out.println(solution());
	}
}
