import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringBuilderTest {

	private List<String> strings;
	private long beforeTime;
	private long afterTime;

	@Before
	public void init() {
		strings = new ArrayList<>();
		beforeTime = System.nanoTime();
	}

	@Test
	public void test1() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 100; i++) {
			sb.setLength(0);

			sb.append("num : ")
				.append(i);
			strings.add(sb.toString());
		}

		System.out.printf("");

	}

	@Test
	public void test2() {

		for (int i = 0; i < 100; i++) {
			WeakReference<StringBuilder> sb = new WeakReference<StringBuilder>(new StringBuilder());

			StringBuilder stringBuilder = sb.get();
			StringBuilder staringBuilder = new StringBuilder();
			stringBuilder.append("num : ")
				.append(i);
			strings.add(stringBuilder.toString());
		}

		System.out.printf("");

	}

	@After
	public void after() {
		afterTime = System.nanoTime();
		System.out.println("수행시간: " + (afterTime - beforeTime) + " ns");
	}
}
