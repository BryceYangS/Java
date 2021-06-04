package basic;

import java.util.Arrays;

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

	/**
	 * 퀵정렬
	 * @param data
	 * @param start
	 * @param end
	 */
	public void quickSort(int[] data, int start, int end) {
		int part2 = partition(data, start, end);
		if (start < part2 - 1) {
			quickSort(data, start, part2 - 1);
		}
		if (part2 < end) {
			quickSort(data, part2, end);
		}

	}

	private int partition(int[] data, int start, int end) {
		int pivot = data[(start + end) / 2];
		while (start <= end) {
			while (data[start] < pivot) start++;
			while (data[end] > pivot) end--;
			if (start <= end) {
				swap(data, start, end);
				start++;
				end--;
			}
		}

		return start;
	}

	private void swap(int[] data, int start, int end) {
		int tmp = data[start];
		data[start] = data[end];
		data[end] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = {3, 9 , 4, 7, 5, 0, 1, 6, 8, 2};
		Sort s = new Sort();

		s.quickSort(arr,0, arr.length - 1);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
