package basic.stack;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class CustomStackTest {

	@Test
	public void test() throws Exception {
		// given
		CustomStack stack = new CustomStack();

		// when
		stack.push(1);
		stack.push(2);
		stack.push(1);
		stack.push(5);
		stack.push(8);

		// then
		assertThat(stack.peek()).isEqualTo(8);

		assertThat(stack.pop()).isEqualTo(8);
		assertThat(stack.pop()).isEqualTo(5);
		assertThat(stack.pop()).isEqualTo(1);
		assertThat(stack.pop()).isEqualTo(2);
		assertThat(stack.pop()).isEqualTo(1);
		assertThat(stack.isEmpty()).isEqualTo(true);
	}

}