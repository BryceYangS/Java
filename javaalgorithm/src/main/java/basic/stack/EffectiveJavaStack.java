package basic.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class EffectiveJavaStack {
	private int topOfStack = 0;
	List<Integer> elements = new LinkedList<>();

	public int size() {
		return topOfStack;
	}

	public void push(int element) {
		topOfStack++;
		elements.add(element);
	}

	public int pop() {
		if (topOfStack == 0) {
			throw new NoSuchElementException();
		}

		int element = elements.get(--topOfStack);
		elements.remove(topOfStack);
		return element;
	}
}
