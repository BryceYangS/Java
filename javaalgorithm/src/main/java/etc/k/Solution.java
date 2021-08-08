package etc.k;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class Solution {
	// 1
	public static String solution(String S) {
		// write your code in Java SE 8
		if (S.length() < 2) {
			throw new IllegalArgumentException("최소한 2개 이상을 입력해주세요.");
		}

		S = S.replaceAll(" ", "");
		S = S.replaceAll("-", "");

		String rtnStr = "";

		String[] split = S.split("");

		int index = split.length;
		if (split.length % 3 == 1) {
			index -= 2;
		}

		for (int i = 0; i < index; i++) {
			rtnStr += split[i];
			if (i != split.length -1 && i % 3 == 2) {
				rtnStr += "-";
			}
		}

		if (split.length % 3 == 1) {
			rtnStr += "-" + S.substring(index);
		}
		return rtnStr;
	}

	// 2
	public static int solution(int[] T, int[] A) {
		// write your code in Java SE 8
		Map<Integer, List<Integer>> skillTree = new TreeMap<>();

		for (int i = 0; i < T.length; i++) {
			List<Integer> orDefault = skillTree.getOrDefault(T[i], new ArrayList<>());
			orDefault.add(i);
			skillTree.put(T[i], orDefault);
		}

		int rtn = 1;
		List<Integer> notYetSkills = new ArrayList<>();
		for (int skill:A) {
			if (skill != 0) {
				notYetSkills.add(skill);
			}
		}
		Collections.sort(notYetSkills);

		List<Integer> learnedSkills = new ArrayList<>(Arrays.asList(0));
		Iterator<Integer> it = skillTree.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			List<Integer> values = skillTree.get(key);

			List<Integer> willDeleteSkill = new ArrayList<>();

			for (int i = 0; i < notYetSkills.size(); i++) {
				Integer skill = notYetSkills.get(i);
				if (values.contains(skill)) {
					rtn += 1;
					learnedSkills.add(skill);
					willDeleteSkill.add(skill);
					// notYetSkills.remove(skill);
					if (!learnedSkills.contains(key)) {
						rtn += 1;
						// notYetSkills.remove(key);
						learnedSkills.add(key);
						willDeleteSkill.add(key);
					}
				}
			}

			if (willDeleteSkill.size() > 0) {
				for (Integer skill:willDeleteSkill) {
					notYetSkills.remove(skill);
				}
			}

		}

		return rtn;
	}

	// 3
	public static int solution(int[] A) {
		// write your code in Java SE 8
		if (A.length == 1 || A.length == 2) {
			return A.length;
		}

		boolean canConvert = isCanConvert(A);

		if (canConvert) {
			return A.length;
		}

		int max = 0;
		for (int i = 3; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - i + 1; j++) {
				if (isCanConvert(Arrays.copyOfRange(A, j, j + i))) {
					if (max < i) {
						max = i;
					}
				}
			}
		}

		return max;
	}

	private static boolean isCanConvert(int[] A) {
		boolean canConvert = false;
		int odd = A[1];
		int even = A[0];

		for (int i = 2; i < A.length; i++) {
			if (i % 2 == 0) {
				if (even == A[i]) {
					canConvert = true;
					continue;
				}
				canConvert = false;
			} else {
				if (odd == A[i]) {
					canConvert = true;
					continue;
				}
				canConvert = false;
			}

			if (!canConvert) {
				break;
			}
		}
		return canConvert;
	}

	public static void main(String[] args) {
		// System.out.println(solution("00-44 48 5555 8361"));
		// System.out.println(solution("0 - 22 1985 --324"));
		//
		// System.out.println(solution(new int[]{7, 4, -2, 4, -2, -9}));

		// System.out.println(solution(new int[]{0, 0, 0, 0, 2, 3, 3}, new int[]{2, 5, 6}));
		// [0, 0, 0, 0, 2, 3, 3], [2, 5, 6]
		System.out.println(solution(new int[]{0, 3, 0, 0, 5, 0, 5}, new int[]{4, 2, 6, 1, 0}));
		// 0, 3, 0, 0, 5, 0, 5], [4, 2, 6, 1, 0
	}
}

