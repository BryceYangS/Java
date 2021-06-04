package basic;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortTest {

	private Sort sort;

	@Before
	public void init() {
		sort = new Sort();
	}

	@Test
	public void selection() throws Exception {
		// given
		int[] ints = {2, 1, 3, 4, 5};

		// when
		int[] result = sort.selectionSort(ints);

		// then
		assertArrayEquals(new int[]{1,2,3,4,5}, result);
	}

	@Test
	public void insertion() throws Exception {
		// given
		int[] ints = {9, 89, 2, 1, 10, 5, 31, 3};

		// when
		int[] result = sort.insertionSort(ints);

		// then
		assertArrayEquals(new int[]{1,2,3,5,9,10,31,89}, result);
	}

	@Test
	public void quick() throws Exception {
		// given
		int[] ints = {9, 89, 2, 1, 10, 5, 31, 3};

		// when
		// int[] result = sort.quickSort(ints);

		// then
		// assertArrayEquals(new int[]{1,2,3,5,9,10,31,89}, result);
	}
}