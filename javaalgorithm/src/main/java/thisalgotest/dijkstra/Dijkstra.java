package thisalgotest.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijkstra {

	public int[] solution(int N, int V, int start, int[][] data) {
		// 방문한 적이 있는지 체크하는 목적의 리스트 만들기
		boolean[] visited = new boolean[N + 1];

		// 최단 거리 테이블을 모두 무한으로 초기화
		int[] distance = new int[N + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);

		// 각 노드에 연결되어 있는 노드에 대한 정보를 담는 그래프 만들기
		Map<Integer, List<Data>> graph = new HashMap<>();

		for (int[] datum : data) {
			List<Data> orDefault = graph.getOrDefault(datum[0], new ArrayList<>());
			orDefault.add(new Data(datum[1], datum[2]));
			graph.put(datum[0], orDefault);
		}

		// 시작 노드에 대해서 초기화
		distance[start] = 0;
		visited[start] = true;
		for (Data graphData : graph.get(start)) {
			distance[graphData.end] = graphData.weight;
		}

		// 시작 노드를 제외한 전체 n - 1개의 노드에 대해서 반복
		for (int i = 0; i < N - 1; i++) {
			// 현재 최단 거리가 가장 짧은 노드를 꺼내서, 방문 처리
			int now = getSmallestNode(N, distance, visited);
			visited[now] = true;
			// 현재 노드와 연결된 다른 노드를 확인
			for (Data graphData : graph.getOrDefault(now, Collections.emptyList())) {
				int cost = distance[now] + graphData.weight;
				// 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧은 경우
				if (cost < distance[graphData.end]) {
					distance[graphData.end] = cost;
				}
			}
		}

		return distance;
	}

	/**
	 * 방문하지 않은 노드 중에서, 가장 최단 거리가 짧은 노드의 번호를 반환
	 * @param N : 노드 수
	 * @param distance : 거리
	 * @param visited : 방문여부
	 * @return : 짧은 노드 index
	 */
	public int getSmallestNode(int N, int[] distance, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		int index = 0; // 가장 최단 거리가 짧은 노드(인덱스)
		for (int i = 1; i < N + 1; i++) {
			if (distance[i] < min && !visited[i]) {
				min = distance[i];
				index = i;
			}
		}
		return index;
	}

	public int[] simpleSolution(int N, int V, int start, int[][] data) {
		// 방문한 적이 있는지 체크하는 목적의 리스트 만들기
		boolean[] visited = new boolean[N + 1];

		// 최단 거리 테이블을 모두 무한으로 초기화
		int[] distance = new int[N + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);

		// 각 노드에 연결되어 있는 노드에 대한 정보를 담는 그래프 만들기
		Map<Integer, List<Data>> graph = new HashMap<>();
		for (int[] datum : data) {
			List<Data> orDefault = graph.getOrDefault(datum[0], new ArrayList<>());
			orDefault.add(new Data(datum[1], datum[2]));
			graph.put(datum[0], orDefault);
		}

		// 시작 노드로 가기 위한 최단 경로는 0으로 설정하여 큐에 삽입
		PriorityQueue<Data> pq = new PriorityQueue<>();
		pq.offer(new Data(start, 0));
		distance[start] = 0;

		while (!pq.isEmpty()) { // 큐가 비어있지 않다면
			// 가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
			Data poll = pq.poll();
			// 현재 노드가 이미 처리된 적이 있는 노드라면 무시
			if (distance[poll.end] < poll.weight) {
				continue;
			}
			// 현재 노드와 연결되 다른 인접한 노드들을 확인
			for (Data data1 : graph.getOrDefault(poll.end, Collections.emptyList())) {
				int cost = poll.weight + data1.weight;
				// 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
				if (cost < distance[data1.end]) {
					distance[data1.end] = cost;
					pq.offer(new Data(data1.end, cost));
				}
			}
		}
		return distance;
	}

	static class Data implements Comparable{
		public int end;
		public int weight;

		public Data(int end, int weight) {
			this.end = end;
			this.weight = weight;
		}

		@Override
		public int compareTo(Object o) {
			return this.weight - ((Data)o).weight;
		}
	}

}
