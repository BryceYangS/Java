package programmers.bfsdfs;

import java.util.*;

public class Sol43164 {
	public String[] solution(String[][] tickets) {
		String[] answer = {};

		Map<String, List<String>> graph = new HashMap<>();

		for (String[] path : tickets) {
			String start = path[0];
			String end = path[1];

			List<String> orDefault = graph.getOrDefault(start, new ArrayList<>());
			orDefault.add(end);
			Collections.sort(orDefault);

			graph.put(start, orDefault);
		}

		return dfs(graph, "ICN");
	}

	public String[] dfs(Map<String, List<String>> graph, String start) {

		List<String> visited = new ArrayList<>();
		List<String> needVisit = new ArrayList<>();

		needVisit.add(start);

		while (needVisit.size() > 0) {

			String st = needVisit.remove(needVisit.size() - 1);
			visited.add(st);
			List<String> orDefault = graph.getOrDefault(st, new ArrayList<>());

			if (orDefault.size() > 0) {
				String s = orDefault.remove(0);
				graph.replace(st, orDefault);
				needVisit.add(s);
			}
		}

		String[] convertedArray = new String[visited.size()];
		return visited.toArray(convertedArray);
	}
}
