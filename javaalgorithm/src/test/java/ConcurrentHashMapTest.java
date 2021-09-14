import static org.assertj.core.api.Assertions.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class ConcurrentHashMapTest {

	@Test
	public void put_test() {

		final int MAX_THREADS = 10;

		Hashtable<String, Integer> ht = new Hashtable<>();
		HashMap<String, Integer> hm = new HashMap<>();
		HashMap<String, Integer> hmSyn = new HashMap<>();
		Map<String, Integer> synm = Collections.synchronizedMap(new HashMap<String, Integer>());
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();

		ExecutorService es = Executors.newFixedThreadPool(MAX_THREADS);

		HashMap<String, Long> time = new HashMap<>();

		for (int j = 0; j < MAX_THREADS; j++) {
			long start = System.nanoTime();
			es.execute(() -> {
				for (int i = 0; i < 1000; i++) {

						String key = String.valueOf(i);

						ht.put(key, i);
						hm.put(key, i);
						chm.put(key, i);
						synm.put(key, i);

						synchronized (hmSyn) {
							hmSyn.put(key, i);
						}
					}
			});
			time.put(String.valueOf(j), System.nanoTime() - start);
		}

		es.shutdown();
		try {
			es.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(time);

		assertThat(ht.size()).isEqualTo(1000);
		assertThat(hm.size()).isGreaterThan(1000);
		assertThat(chm.size()).isEqualTo(1000);
		assertThat(hmSyn.size()).isEqualTo(1000);
		assertThat(synm.size()).isEqualTo(1000);
	}


	@Test
	public void time_test() {

		final int MAX_THREADS = 10;
		final int MAP_SIZE = 100000;

		HashMap<String, Integer> hmSyn = new HashMap<>();
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
		Map<String, Integer> synm = Collections.synchronizedMap(new HashMap<String, Integer>());

		ExecutorService es = Executors.newFixedThreadPool(MAX_THREADS);
		HashMap<String, Long> time = new HashMap<>();

		long start = System.nanoTime();
		for (int j = 0; j < MAX_THREADS; j++) {
			es.execute(() -> {
				for (int i = 0; i < MAP_SIZE; i++) {

					String key = String.valueOf(i);
					synchronized (hmSyn) {
						hmSyn.put(key, i);
					}
				}
			});
		}
		time.put("Synchronized", System.nanoTime() - start);

		start = System.nanoTime();
		for (int j = 0; j < MAX_THREADS; j++) {
			es.execute(() -> {
				for (int i = 0; i < MAP_SIZE; i++) {

					String key = String.valueOf(i);
					chm.put(key, i);
				}
			});
		}
		time.put("Concurrent", System.nanoTime() - start);

		start = System.nanoTime();
		for (int j = 0; j < MAX_THREADS; j++) {
			es.execute(() -> {
				for (int i = 0; i < MAP_SIZE; i++) {

					String key = String.valueOf(i);
					synm.put(key, i);
				}
			});
		}
		time.put("Collections.Syn", System.nanoTime() - start);

		es.shutdown();
		try {
			es.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(time);

		assertThat(chm.size()).isEqualTo(MAP_SIZE);
		assertThat(hmSyn.size()).isEqualTo(MAP_SIZE);
		assertThat(synm.size()).isEqualTo(MAP_SIZE);
	}
}
