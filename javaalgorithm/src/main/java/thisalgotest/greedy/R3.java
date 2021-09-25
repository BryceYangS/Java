package thisalgotest.greedy;

public class R3 {
	public int sol(String S) {
		int answer = 0;

		char st = S.charAt(0);
		for (int i = 1; i < S.length(); i++) {
			if (st != S.charAt(i) && S.charAt(i - 1) != S.charAt(i)) {
				answer += 1;
			}
		}

		return answer;
	}
}
