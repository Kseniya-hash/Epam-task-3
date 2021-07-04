package by.epamtc.dubovik.task1.logic;

import org.junit.*;

import by.epamtc.dubovik.task1.entity.Array;
import by.epamtc.dubovik.task1.logic.ArraySort;

public class TestArraySort {
	private static Array actualArrayPositive;
	private static Array actualArrayWithNegative;
	private static Array actualArrayEmpthy;
	private static Array actualArrayNull;
	
	private static Array expectedArrayPositive = new Array(0, 1, 2, 5, 5, 7, 9);
	private static Array expectedArrayWithNegative = new Array(-13, -7, 0, 1, 2, 5, 9);
	private static Array expectedArrayEmpthy = new Array();
	private static Array expectedArrayNull = null;
	
	@Before
	public void initArrays() {
		actualArrayPositive = new Array(1, 7, 2, 5, 9, 5, 0);
		actualArrayWithNegative = new Array(1, -7, 2, 5, -13, 9, 0);
		actualArrayEmpthy = new Array();
		actualArrayNull = null;
	}
	
	@Test
	public void bubbleSortTestPositive() {
		ArraySort.bubbleSort(actualArrayPositive);
		Assert.assertEquals(expectedArrayPositive, actualArrayPositive);
	}
	
	@Test
	public void bubbleSortTestWithNegative() {
		ArraySort.bubbleSort(actualArrayWithNegative);
		Assert.assertEquals(expectedArrayWithNegative, actualArrayWithNegative);
	}
	
	@Test
	public void bubbleSortTestEmpthy() {
		ArraySort.bubbleSort(actualArrayEmpthy);
		Assert.assertEquals(expectedArrayEmpthy, actualArrayEmpthy);
	}
	
	@Test
	public void bubbleSortTestNull() {
		ArraySort.bubbleSort(actualArrayNull);
		Assert.assertEquals(expectedArrayNull, actualArrayNull);
	}
	
	@Test
	public void quickSortTestPositive() {
		ArraySort.quickSort(actualArrayPositive);
		Assert.assertEquals(expectedArrayPositive, actualArrayPositive);
	}
	
	@Test
	public void quickSortTestWithNegative() {
		ArraySort.quickSort(actualArrayWithNegative);
		Assert.assertEquals(expectedArrayWithNegative, actualArrayWithNegative);
	}
	
	@Test
	public void quickSortTestEmpthy() {
		ArraySort.quickSort(actualArrayEmpthy);
		Assert.assertEquals(expectedArrayEmpthy, actualArrayEmpthy);
	}
	
	@Test
	public void quickSortTestNull() {
		ArraySort.quickSort(actualArrayNull);
		Assert.assertEquals(expectedArrayNull, actualArrayNull);
	}
	
	@Test
	public void shakerSortTestPositive() {
		ArraySort.quickSort(actualArrayPositive);
		Assert.assertEquals(expectedArrayPositive, actualArrayPositive);
	}
	
	@Test
	public void shakerSortTestWithNegative() {
		ArraySort.quickSort(actualArrayWithNegative);
		Assert.assertEquals(expectedArrayWithNegative, actualArrayWithNegative);
	}
	
	@Test
	public void shakerSortTestEmpthy() {
		ArraySort.quickSort(actualArrayEmpthy);
		Assert.assertEquals(expectedArrayEmpthy, actualArrayEmpthy);
	}
	
	@Test
	public void shakerSortTestNull() {
		ArraySort.quickSort(actualArrayNull);
		Assert.assertEquals(expectedArrayNull, actualArrayNull);
	}
}
