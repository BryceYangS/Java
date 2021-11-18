package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution401 {
	public List<String> readBinaryWatch(int turnedOn) {
		List<String> rtn = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 60; j++) {
				int count = Integer.bitCount(i) + Integer.bitCount(j);
				if (count == turnedOn) {
					rtn.add(String.format("%d:%02d", i, j));
				}
			}
		}
		return rtn;
	}
}