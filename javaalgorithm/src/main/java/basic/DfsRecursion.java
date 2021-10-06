package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DfsRecursion {
	static class Graph {
		int vertices;
		Map<Integer, List<Integer>> adj;

		Graph(int vertices) {
			this.vertices = vertices;
			adj = new HashMap<>();
		}

		void addEdge(int source, int destination) {
			List<Integer> orDefault = adj.getOrDefault(source, new ArrayList<>());
			orDefault.add(destination);
			adj.put(source, orDefault);
		}

		void recurseDfs(int startVertex) {
			boolean[] visited = new boolean[vertices];
			dfs(startVertex, visited);
		}

		void dfs(int startVertex, boolean[] visited) {
			visited[startVertex] = true;
			System.out.print(startVertex + " ");
			List<Integer> integers = adj.getOrDefault(startVertex, new ArrayList<>());
			for (int i = 0; i < integers.size(); i++) {
				int destination = integers.get(i);
				if (!visited[destination]) {
					dfs(destination, visited);
				}
			}
		}
	}

	public static void main(String[] args) {
		int vertices = 6;
		Graph graph = new Graph(vertices);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(0,3);
		graph.addEdge(1,2);
		graph.addEdge(2,4);
		graph.recurseDfs(0);
	}
}
