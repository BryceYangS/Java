package leetcode;

public class Solution9 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		String s = Integer.toString(x);

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
			 	return false;
			}
		}

		return true;
	}

	public boolean isPalindrome2(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int revertedNum = 0;
		while (x > revertedNum) {
			revertedNum = revertedNum * 10 + x % 10;
			x /= 10;
		}

		return x == revertedNum || x == revertedNum / 10;
	}
}
