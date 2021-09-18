package programmers.sort;

import java.util.Arrays;
import java.util.List;

public class Sol42748 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] command = commands[i];
			int[] ints = Arrays.copyOfRange(array, command[0] - 1, command[1]);

			int sortedNumByIdx = getSortedNumByIdx(ints, command[2] - 1);

			answer[i] = sortedNumByIdx;
		}

		return answer;
	}

	public int getSortedNumByIdx(int[] arr, int index) {

		int[] sorted = Arrays.stream(arr)
			.sorted()
			.toArray();

		return sorted[index];
	}



}
