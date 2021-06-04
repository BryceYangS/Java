package basic.stack;

import java.util.LinkedList;
import java.util.List;

public class CustomStack implements Stack{

	List<Integer> data;

	public CustomStack() {
		data = new LinkedList<>();
	}

	@Override
	public void push(int val) {
		data.add(val);
	}

	@Override
	public int pop() {
		Integer last = peek();
		data.remove(data.size() - 1);
		return last;
	}

	@Override
	public int peek() {
		return data.get(data.size() - 1);
	}

	@Override
	public void clear() {
		data.clear();
	}

	@Override
	public boolean isEmpty() {
		return data.size() == 0;
	}

}
