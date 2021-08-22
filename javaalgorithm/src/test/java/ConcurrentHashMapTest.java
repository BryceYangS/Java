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
		Map<String, Integer> hmSyn2 = Collections.synchronizedMap(new HashMap<String, Integer>());
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();

		ExecutorService es = Executors.newFixedThreadPool(MAX_THREADS);

		for (int j = 0; j < MAX_THREADS; j++) {
			es.execute(() -> {
					for (int i = 0; i < 1000; i++) {

						String key = String.valueOf(i);

						ht.put(key, i);
						hm.put(key, i);
						chm.put(key, i);
						hmSyn2.put(key, i);

						synchronized (hmSyn) {
							hmSyn.put(key, i);
						}
					}
				}
			);
		}

		es.shutdown();
		try {
			es.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Hashtable size is " + ht.size());
		System.out.println("HashMap size is " + hm.size());
		System.out.println("ConcurrentHashMap size is " + chm.size());
		System.out.println("HashMap(synchronized) size is " + hmSyn.size());
		System.out.println("synchronizedMap size is " + hmSyn2.size());

		assertThat(ht.size()).isEqualTo(1000);
		assertThat(hm.size()).isGreaterThan(1000);
		assertThat(chm.size()).isEqualTo(1000);
		assertThat(hmSyn.size()).isEqualTo(1000);
		assertThat(hmSyn2.size()).isEqualTo(1000);
	}
}
