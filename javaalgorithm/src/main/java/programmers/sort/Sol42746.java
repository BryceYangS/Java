package programmers.sort;

import java.util.Arrays;

public class Sol42746 {

	public String solution(int[] numbers) {
		String answer = "";

		String[] answerArr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			answerArr[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(answerArr, (e1, e2) -> (e2 + e1).compareTo(e1 + e2));

		if ("0".equals(answerArr[0])) {
			return "0";
		}

		for (String s : answerArr) {
			answer += s;
		}

		return answer;
	}
}
