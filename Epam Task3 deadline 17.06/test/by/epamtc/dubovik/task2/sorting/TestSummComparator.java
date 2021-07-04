package by.epamtc.dubovik.task2.sorting;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.task2.sorting.SummComparator;

public class TestSummComparator {
	
	@Test
	public void compareTestFirstSumm() {
		SummComparator testComparator = new SummComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {1,1};
		int expected = 1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestSecondSumm() {
		SummComparator testComparator = new SummComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {1,7, 5};
		int expected = -1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestEqual() {
		SummComparator testComparator = new SummComparator();
		int[] array1 = {-3,5,2};
		int[] array2 = {5,1, -2};
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestHasEmpthy() {
		SummComparator testComparator = new SummComparator();
		int[] array1 = {};
		int[] array2 = {1,1, -3};
		int expected = 1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestBothEmpthy() {
		SummComparator testComparator = new SummComparator();
		int[] array1 = {};
		int[] array2 = {};
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestHasNull() {
		SummComparator testComparator = new SummComparator();
		int[] array1 = null;
		int[] array2 = {1,1, -3};
		int expected = 1;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void compareTestBothNull() {
		SummComparator testComparator = new SummComparator();
		int[] array1 = null;
		int[] array2 = null;
		int expected = 0;
		int actual = testComparator.compare(array1, array2);
		Assert.assertEquals(expected, actual);
	}
}
