package etc.temp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ThreadTest {
	public static void main(String[] args) {
		AtomicInteger atomicInt = new AtomicInteger(0);

		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 1000)
			.forEach(i -> executor.submit(atomicInt::incrementAndGet));

		executor.shutdown();
		// stop(executor);

		System.out.println("atomic : " + atomicInt.get());    // => 1000
	}
}
