package basic.queue;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class CustomQueueTest {

	@Test
	public void 테스트() throws Exception {
		// given
		CustomQueue<Integer> queue = new CustomQueue<>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);

		assertThat(queue.deQueue()).isEqualTo(1);

		queue.enQueue(4);
		queue.enQueue(5);

		assertThat(queue.deQueue()).isEqualTo(2);

		queue.enQueue(6);

		assertThat(queue.deQueue()).isEqualTo(3);

		queue.enQueue(7);
		assertThat(queue.deQueue()).isEqualTo(4);

		assertThat(queue.deQueue()).isEqualTo(5);
	}
}