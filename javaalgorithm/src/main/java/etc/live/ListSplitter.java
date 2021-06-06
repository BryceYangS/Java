package etc.live;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSplitter {

	public static List<List<Integer>> split(List<Integer> list, int n) {

		List<List<Integer>> rtn = new ArrayList<>();

		for(int i = 0; i < list.size(); i++) {
			if(i % n == 0) {
				rtn.add(new ArrayList<>());
			}
			rtn.get(rtn.size() - 1).add(list.get(i));
		}

		return rtn;
	}

	public static void main(String[] args) {
		List<List<Integer>> split = split(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3);
		split.forEach(System.out::println);
	}

}
