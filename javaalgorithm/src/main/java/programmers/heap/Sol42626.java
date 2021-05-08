package programmers.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Sol42626 {
	public static void main(String[] args) {

		System.out.println(solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		Queue<Integer> queue = new PriorityQueue<>();
		for (int sc : scoville) {
			queue.add(sc);
		}

		while (queue.peek() < K) {
			if (queue.size() <= 1) {
				return -1;
			}
			queue.add(queue.poll() + queue.poll() * 2);
			answer += 1;
		}
		return answer;
	}
}
