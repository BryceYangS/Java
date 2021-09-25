package thisalgotest.greedy;

public class R2 {
	public int sol(String S) {
		int answer = Character.getNumericValue(S.charAt(0));

		for (int i = 1; i < S.length(); i++) {
			int num = Character.getNumericValue(S.charAt(i));

			if (num <= 1 || answer <= 1) {
				answer += num;
				continue;
			}
			answer *= num;
		}

		return answer;
	}
}
