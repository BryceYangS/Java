package thisalgotest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 그리디
 * 실전문제 2.
 * 큰 수의 법칙
 */
public class Practice2 {

	// 5 8 3
	// 2 4 5 4 6
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cond = br.readLine().split(" ");

		int M = Integer.parseInt(cond[1]);
		int K = Integer.parseInt(cond[2]);

		String[] arr = br.readLine().split(" ");

		int answer = mySolution(M, K, arr);
		int answer2 = bookSolution(M, K, arr);
		int answer3 = bookSolution2(M, K, arr);
		System.out.println(answer);
		System.out.println(answer2);
		System.out.println(answer3);
	}

	public static int mySolution(int M, int K, String[] arr) {
		Arrays.sort(arr, (e1, e2) -> e2.compareTo(e1));

		int count = 0;
		int total = 0;
		for (int i = 0; i < M; i++) {
			if (count == 3) {
				total += Integer.parseInt(arr[1]);
				count = 0;
				continue;
			}

			count += 1;
			total += Integer.parseInt(arr[0]);
		}

		return total;
	}

	public static int bookSolution(int M, int K, String[] arr) {
		Arrays.sort(arr, (e1, e2) -> e2.compareTo(e1));

		int first = Integer.parseInt(arr[0]);
		int second = Integer.parseInt(arr[1]);

		int total = 0;

		while (true) {
			for (int i = 0; i < K; i++) {
				if (M == 0) {
					break;
				}
				total += first;
				M -= 1;
			}
			if (M == 0) {
				break;
			}
			total += second;
			M -= 1;
		}

		return total;
	}

	public static int bookSolution2(int M, int K, String[] arr) {
		Arrays.sort(arr, (e1, e2) -> e2.compareTo(e1));

		int first = Integer.parseInt(arr[0]);
		int second = Integer.parseInt(arr[1]);

		int firstCount = M / (K + 1) * K;
		firstCount += M % (K + 1);
		int secondCount = M - firstCount;
		return first * firstCount + secondCount * second;
	}
}
