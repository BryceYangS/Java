package programmers.weekly;

public class Week2 {
	public String solution(int[][] scores) {
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < scores.length; i++) {
			int myScore = scores[i][i];
			boolean isNeedSkipScoreForMax = true;
			boolean isNeedSkipScoreForMin = true;
			int sum = 0;

			for (int j = 0; j < scores[i].length; j++) {
				if (j == i) {
					continue;
				}

				int num = scores[j][i];

				if (isNeedSkipScoreForMax && myScore <= num) {
					isNeedSkipScoreForMax = false;
				}

				if (isNeedSkipScoreForMin && myScore >= num) {
					isNeedSkipScoreForMin = false;
				}
				sum += num;
			}

			double avg = (sum + myScore) / (double)scores[i].length;
			if (isNeedSkipScoreForMax || isNeedSkipScoreForMin) {
				avg = sum / (double)(scores[i].length - 1);
			}

			answer.append(getGrades(avg));
		}
		return answer.toString();
	}

	private String getGrades(double avg) {
		switch ((int)(avg / 10)) {
			case 10:
			case  9:
				return "A";
			case 8:
				return "B";
			case 7:
				return "C";
			case 6:
			case 5:
				return "D";
			default:
				return "F";
		}
	}
}
