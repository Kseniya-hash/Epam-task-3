package by.epamtc.dubovik.task2.sorting;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.task2.sorting.MinComparator;

public class TestMinComparator {
	
	@Test
	public void compareTestFirstMin() {
		MinComparator testComparator = new MinComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {1,1};
		int expected = -1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestSecondMin() {
		MinComparator testComparator = new MinComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {1,1, -5};
		int expected = 1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestEqual() {
		MinComparator testComparator = new MinComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {1,1, -3};
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestHasEmpthy() {
		MinComparator testComparator = new MinComparator();
		int[] array1 = {};
		int[] array2 = {1,1, -3};
		int expected = 1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestBothEmpthy() {
		MinComparator testComparator = new MinComparator();
		int[] array1 = {};
		int[] array2 = {};
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestHasNull() {
		MinComparator testComparator = new MinComparator();
		int[] array1 = null;
		int[] array2 = {1,1, -3};
		int expected = 1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestBothNull() {
		MinComparator testComparator = new MinComparator();
		int[] array1 = null;
		int[] array2 = null;
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
}
