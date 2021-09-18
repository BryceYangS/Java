package programmers.weekly;

public class Weekly1 {
	public long solution(int price, int money, int count) {
		long answer = -1;

		long allPrice = price * ((long)count * (count + 1) / 2);
		answer = money - allPrice;

		if (answer >= 0) {
			return 0;
		}

		return -1 * answer;
	}
}
