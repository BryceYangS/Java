package basic.queue;

import java.util.Stack;

/**
 * Queue : FIFO(선입선출)
 */
public class CustomQueue<T> {
	private Stack<T> in;
	private Stack<T> out;

	public CustomQueue() {
		this.in = new Stack<>();
		this.out = new Stack<>();
	}

	public void enQueue(T val) {
		in.push(val);
	}

	public T deQueue() {
		if (!out.empty()) {
			return out.pop();
		}

		while (!in.empty()) {
			out.push(in.pop());
		}
		return out.pop();
	}
}
