package programmers;

public class Sol42842 {
	public int[] solution(int brown, int yellow) {
		int totalCnt = brown + yellow;

		for (int column = totalCnt - 1; column > 2; column--) {
			int rest = totalCnt % column;
			if (rest != 0) {
				continue;
			}

			int row = totalCnt / column;

			for (int i = 1; i < column; i++) {
				int i1 = i * 2;
				int innerColumn = column - i1;
				int innerRow = row - i1;

				if (innerRow <= 0) {
					break;
				}

				int innserCnt = (innerColumn) * (innerRow);
				if (innserCnt == yellow) {
					return new int[] {column, row};
				}
			}
		}
		return new int[]{};
	}
}
