package programmers.greedy;

public class Sol42860 {
	public int solution(String name) {
		int answer = 0;
		int length = name.length();
		int minMove = length - 1;

		for (int i = 0; i < length; i++) {
			answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

			int next = i + 1;
			while (next < length && name.charAt(next) == 'A') {
				next++;
			}

			minMove = Math.min(minMove, i * 2 + (length - next));
		}
		return answer + minMove;
	}
}
