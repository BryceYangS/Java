package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution989 {

	public List<Integer> addToArrayForm2(int[] num, int k) {

		List<Integer> rtn = new ArrayList<>();

		int i = num.length;
		int cur = k;

		while (--i >= 0 || cur > 0) {
			if (i >= 0) {
				cur += num[i];
			}
			rtn.add(cur % 10);
			cur /= 10;
		}

		Collections.reverse(rtn);
		return rtn;
	}



	public List<Integer> addToArrayForm(int[] num, int k) {

		int l1 = num.length - 1;
		int carry = 0;

		List<Integer> rtn = new ArrayList<>();

		while (l1 >= 0 || k > 0 || carry > 0) {

			int arrNum = 0;
			if (l1 >= 0) {
				arrNum = num[l1];
			}

			int sum = arrNum + k % 10 + carry;

			carry = sum / 10;

			k /= 10;

			rtn.add(sum % 10);

			l1--;
		}

		Collections.reverse(rtn);
		return rtn;
	}
}