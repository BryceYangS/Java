package thisalgotest.greedy;

/**
 * 1이 될 때 까지
 */
public class Practice4 {
	public int solution(int N, int K){

		int answer = 0;
		while (true) {
			if (N == 1) {
				break;
			}

			if (N % K == 0) {
				N /= K;
			} else {
				N -= 1;
			}
			answer += 1;

		}

		return answer;
	}

	public int bookSol1(int N, int K) {
		int answer = 0;

		// N이 K 이상이라면 K로 계속 나누기
		while (N >= K) {
			// N이 K로 나누어 떨어지지 않는다면 N에서 1씩 빼기
			while (N % K != 0) {
				N -= 1;
				answer += 1;
			}
			N /= K;
			answer += 1;
		}

		// 마지막으로 남은 수에 대해 1씩 빼기
		while (N > 1) {
			N -= 1;
			answer += 1;
		}

		return answer;
	}

	public int bookSol2(int N, int K) {
		int answer = 0;

		while (true) {
			// N == K 로 나누어떨어지는 수가 될 때까지 1씩 빼기
			int target = (N / K) * K;
			answer += (N - target);
			N = target;
			// N이 K보다 작을때 반복문 탈출
			if (N < K) {
				break;
			}
			answer += 1;
			N /= K;
		}

		// 마지막으로 남은 수에 대해 1씩 빼기
		answer += (N - 1);

		return answer;
	}
}
