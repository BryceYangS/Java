package programmers.jetbrains;

import java.util.*;

public class Solution1 {

	public static int solution1(int[] numbers) {
		int answer = 0;

		for (int i = 0; i < 10; i++) {
			int finalI = i;
			boolean b = Arrays.stream(numbers)
				.anyMatch(e -> e == finalI);

			if (!b) {
				answer += i;
			}
		}

		return answer;
	}

	public static long solution2(int a, int b, int[] g, int[] s, int[] w, int[] t) {
		long answer = -1;

		Map<Integer, Integer> goldPerTime = new HashMap<>();

		for (int i = 0; i < g.length; i++) {
			goldPerTime.put(i, w[i] / t[i]);
		}

		// 금 운반 효율성 기준 내림차순 정렬
		List<Integer> keySetList = new ArrayList<>(goldPerTime.keySet());
		Collections.sort(keySetList, (e1, e2) -> (goldPerTime.get(e2).compareTo(goldPerTime.get(e1))));

		for (int i = 0; i < keySetList.size(); i++) {
			int gold = g[i];

			// a / gold
		}


		return answer;
	}

	public static void main(String[] args) {
		// System.out.println(solution2(10, 10, new int[]{100}, new int[]{100}, new int[]{7}, new int[]{10}));
		System.out.println(solution2(90, 500, new int[]{70,70,0}, new int[]{0,0,500}, new int[]{100,100,2}, new int[]{4,8,1}));

	}

}
