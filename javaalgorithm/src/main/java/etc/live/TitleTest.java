package etc.live;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TitleTest {

	public static <T extends Title> List<T> solution(List<T> titles, int count){
		Comparator<Title> comp = (p1, p2) -> p1.getRegistered().compareTo(p2.getRegistered());
		return titles.stream().sorted(comp)
			.limit(count)
			.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Title> titles = new ArrayList<>();

		Title title1 = new ChallengeTitle();
		title1.setTitleNo(1);
		title1.setRegistered(LocalDateTime.of(2021, 01,01, 00,00));
		titles.add(title1);

		Title title2 = new ChallengeTitle();
		title2.setTitleNo(2);
		title2.setRegistered(LocalDateTime.of(2020,10,01,00,00));
		titles.add(title2);

		Title title3 = new TranslateTitle();
		title3.setTitleNo(3);
		title3.setRegistered(LocalDateTime.of(1999,01,01,00,00));
		titles.add(title3);

		Title title4 = new TranslateTitle();
		title4.setTitleNo(4);
		title4.setRegistered(LocalDateTime.of(1993,01,01,00,00));
		titles.add(title4);

		List<Title> solution = solution(titles, 3);

		solution.forEach(System.out::println);
	}
}