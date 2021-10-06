package programmers.bfsdfs;

import java.util.Arrays;
import java.util.Stack;

public class Sol43165 {

	public int solution(int[] numbers, int target) {

		Integer sum = new Integer(0);
		Integer answer = new Integer(0);
		recursive(numbers, sum, target, answer);

		return answer;
	}

	public void recursive(int[] numbers, Integer sum, int target, Integer answer){
		if (numbers.length == 1) {
			int minus = sum - numbers[0];
			if (minus == target) {
				answer += 1;
			}

			int plus = sum + numbers[0];
			if (plus == target) {
				answer += 1;
			}
			return;
		}

		recursive(Arrays.copyOfRange(numbers, 1, numbers.length), sum - numbers[0], target, answer);
		recursive(Arrays.copyOfRange(numbers, 1, numbers.length), sum + numbers[0], target, answer);
	}

}
