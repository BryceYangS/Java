package programmers.jetbrains;

public class Sol1 {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 1) {
				return i;
			}
		}
		
		return answer;
	}
}