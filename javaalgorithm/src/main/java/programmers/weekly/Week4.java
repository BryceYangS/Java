package programmers.weekly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week4 {
	public String solution(String[] table, String[] languages, int[] preference) {
		int[] points = new int[5]; // 총점수
		int max = 0;
		for (int i = 0; i < languages.length; i++) {
			String language = languages[i];

			for (int j = 0; j < table.length; j++) {
				if (!table[j].contains(language)) {
					continue;
				}

				String[] s = table[j].split(" ");
				for (int k = 1; k < s.length; k++) {
					if (s[k].equals(language)) {
						int point = 5 - k + 1;
						points[j] += point * preference[i];
						max = Math.max(max, points[j]);
						break;
					}
				}
			}
		}

		List<String> candidate = new ArrayList<>();
		for (int i = 0; i < points.length; i++) {
			if (points[i] == max) {
				candidate.add(table[i].split(" ")[0]);
			}
		}

		Collections.sort(candidate);

		return candidate.get(0);
	}
}
