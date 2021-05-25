package basic;

public class Sort {

	/**
	 * 선택정렬
	 * @param input
	 * @return
	 */
	public int[] selectionSort(int[] input) {

		for (int i = 0; i < input.length - 1; i++) {
			int minIdx = i;
			int min = input[i];

			for (int j = i + 1; j < input.length; j++) {
				if (min > input[j]){
					minIdx = j;
				}
			}

			if (minIdx != i){
				int tmp = input[i];
				input[i] = input[minIdx];
				input[minIdx] = tmp;
			}
		}

		return input;
	}

	/**
	 * 삽입정렬
	 * @param input
	 * @return
	 */
	public int[] insertionSort(int[] input) {

		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j - 1] > input[j]) {
					int tmp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = tmp;
				}
			}
		}

		return input;
	}
}
