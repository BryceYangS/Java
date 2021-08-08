package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Sol2565 {
	public static int solution(int[] prices, int[] discounts) {
		int answer = 0;

		Arrays.sort(prices);
		Arrays.sort(discounts);

		for (int i = 0 ; i < prices.length ; i++) {
			int price = prices[prices.length - i - 1];
			answer += price;

			if (discounts.length - 1 - i < 0) {
				continue;
			}

			int dc = (int)(price * (0.01 * discounts[discounts.length - 1 - i]));
			answer -= dc;
		}
		return answer;
	}

	public static String[] solution2(String s) {
		List<String> answer = new ArrayList<>();

		while (s.length() > 0) {
			int len = t(s);
			answer.add(answer.size()/2, s.substring(0, len));
			if (len == s.length()) {
				String[] rtn = new String[answer.size()];
				return answer.toArray(rtn);
			}

			answer.add(answer.size()/2, s.substring(0, len));
			s = s.substring(len, s.length() - len);
		}


		// int len = t(s);
		// if (len == s.length()) {
		// 	return new String[] {s};
		// }
		// answer.add(answer.size()/2, s.substring(0, len));
		// while (len != s.length()) {
		// 	answer.add(answer.size()/2, s.substring(0, len));
		//
		// 	s = s.substring(len, s.length() - len);
		// 	if ("".equals(s)) {
		// 		break;
		// 	}
		// 	len = t(s);
		// 	answer.add(answer.size()/2, s.substring(0, len));
		// }

		String[] rtn = new String[answer.size()];
		return answer.toArray(rtn);
	}


	public static int t(String s){
		// i는 문자열 길이
		for (int i = 1; i < s.length(); i++) {
			if (s.substring(0, i).equals(s.substring(s.length() - i))) {
				return i;
			}
		}
		return s.length();
	}

	public static int solution3(String s, String t) {
		int result = 0;

		while (s.contains(t)) {
			result += 1;

			int startIdx = s.indexOf(t);

			s = s.substring(0, startIdx) + s.substring(startIdx + t.length());
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// solution(new int[] {13000, 88000, 10000}, new int[] {30, 20});
		// solution2("abcdef");
		// solution2("abcxyqwertyxyabc");
		solution2("abcxyasdfasdfxyabc");
		// solution3("abaabbaa", "ab");

	}



}
