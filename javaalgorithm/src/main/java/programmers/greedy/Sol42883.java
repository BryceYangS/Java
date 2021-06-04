package programmers.greedy;

public class Sol42883 {
	public String solution(String number, int k) {
		String answer = "";

		int maxNumIdx = 0;

		for (int i = 0; i < number.length() - k; i++) {
			char num = number.charAt(i);

			maxNumIdx = num > number.charAt(maxNumIdx) ? i : maxNumIdx;
		}

		return answer;
	}
}
