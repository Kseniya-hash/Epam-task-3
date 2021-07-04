package by.epamtc.dubovik.task2.sorting;

import org.junit.*;

import by.epamtc.dubovik.task2.sorting.JaggedArraySorting;

public class TestJaggedArraySorting {
	private static int[][] actualArray;
	private static int[][] actualArrayHasEmpthy;
	private static int[][] actualArrayHasNull;
	private static int[][] actualArrayEmpthy;
	private static int[][] actualArrayNull;
	
	@Before
	public void initArrays() {
		actualArray = new int[3][];
		actualArray[0] = new int[2];
		actualArray[0][0] = -5; actualArray[0][1] = 3;
		actualArray[1] = new int[4];
		actualArray[1][0] = 1; actualArray[1][1] = 1; actualArray[1][2] = 11; actualArray[1][3] = 2;
		actualArray[2] = new int[3];
		actualArray[2][0] = 3; actualArray[2][1] = 4; actualArray[2][2] = 1;
		
		actualArrayHasEmpthy = new int[3][];
		actualArrayHasEmpthy[0] = new int[2];
		actualArrayHasEmpthy[0][0] = -5; actualArrayHasEmpthy[0][1] = 3;
		actualArrayHasEmpthy[1] = new int[0];
		actualArrayHasEmpthy[2] = new int[3];
		actualArrayHasEmpthy[2][0] = 3; actualArrayHasEmpthy[2][1] = 4; actualArrayHasEmpthy[2][2] = 1;
		
		actualArrayHasNull = new int[3][];
		actualArrayHasNull[0] = new int[2];
		actualArrayHasNull[0][0] = -5; actualArrayHasNull[0][1] = 3;
		actualArrayHasNull[1] = new int[3];
		actualArrayHasNull[1][0] = 3; actualArrayHasNull[1][1] = 4; actualArrayHasNull[1][2] = 1;
		actualArrayHasNull[2] = null;
		
		actualArrayEmpthy = new int[0][0];
		actualArrayNull = null;
	}
	
	@Test
	public void sortBySummIncTestArray(){
		int[][] expected = {{-5,3},{3,4,1},{1,1,11,2}};
		JaggedArraySorting.sortBySummInc(actualArray);
		assertEqualsJaggedArray(expected, actualArray);
	}
	
	@Test
	public void sortBySummIncTestHasEmpthy(){
		int[][] expected = {{-5,3},{},{3,4,1}};
		JaggedArraySorting.sortBySummInc(actualArrayHasEmpthy);
		assertEqualsJaggedArray(expected, actualArrayHasEmpthy);
	}
	
	@Test
	public void sortBySummIncTestHasNull(){
		int[][] expected = {{-5,3},null,{3,4,1}};
		JaggedArraySorting.sortBySummInc(actualArrayHasNull);
		assertEqualsJaggedArray(expected, actualArrayHasNull);
	}
	
	@Test
	public void sortBySummIncTestArrayEmpthy(){
		int[][] expected = {};
		JaggedArraySorting.sortBySummInc(actualArrayEmpthy);
		assertEqualsJaggedArray(expected, actualArrayEmpthy);
	}
	
	@Test
	public void sortBySummIncTestArrayNull(){
		JaggedArraySorting.sortBySummInc(actualArrayNull);
		Assert.assertNull(actualArrayNull);
	}
	
	@Test
	public void sortBySummDecTestArray(){
		int[][] expected = {{1,1,11,2},{3,4,1},{-5,3}};
		JaggedArraySorting.sortBySummDec(actualArray);
		assertEqualsJaggedArray(expected, actualArray);
	}
	
	@Test
	public void sortBySummDecTestHasEmpthy(){
		int[][] expected = {{3,4,1},{},{-5,3}};
		JaggedArraySorting.sortBySummDec(actualArrayHasEmpthy);
		assertEqualsJaggedArray(expected, actualArrayHasEmpthy);
	}
	
	@Test
	public void sortBySummDecTestHasNull(){
		int[][] expected = {{3,4,1},null,{-5,3}};
		JaggedArraySorting.sortBySummDec(actualArrayHasNull);
		assertEqualsJaggedArray(expected, actualArrayHasNull);
	}
	
	@Test
	public void sortBySummDecTestArrayEmpthy(){
		int[][] expected = {};
		JaggedArraySorting.sortBySummDec(actualArrayEmpthy);
		assertEqualsJaggedArray(expected, actualArrayEmpthy);
	}
	
	@Test
	public void sortBySummDecArrayNull(){
		JaggedArraySorting.sortBySummDec(actualArrayNull);
		Assert.assertNull(actualArrayNull);
	}
	
	@Test
	public void sortByMaxIncTestArray(){
		int[][] expected = {{-5,3},{3,4,1},{1,1,11,2}};
		JaggedArraySorting.sortByMaxInc(actualArray);
		assertEqualsJaggedArray(expected, actualArray);
	}
	
	@Test
	public void sortByMaxIncTestHasEmpthy(){
		int[][] expected = {{},{-5,3},{3,4,1}};
		JaggedArraySorting.sortByMaxInc(actualArrayHasEmpthy);
		assertEqualsJaggedArray(expected, actualArrayHasEmpthy);
	}
	
	@Test
	public void sortByMaxIncTestHasNull(){
		int[][] expected = {null,{-5,3},{3,4,1}};
		JaggedArraySorting.sortByMaxInc(actualArrayHasNull);
		assertEqualsJaggedArray(expected, actualArrayHasNull);
	}
	
	@Test
	public void sortByMaxIncTestArrayEmpthy(){
		int[][] expected = {};
		JaggedArraySorting.sortByMaxInc(actualArrayEmpthy);
		assertEqualsJaggedArray(expected, actualArrayEmpthy);
	}
	
	@Test
	public void sortByMaxIncTestArrayNull(){
		JaggedArraySorting.sortByMaxInc(actualArrayNull);
		Assert.assertNull(actualArrayNull);
	}
	
	@Test
	public void sortByMaxDecTestArray(){
		int[][] expected = {{1,1,11,2},{3,4,1},{-5,3}};
		JaggedArraySorting.sortByMaxDec(actualArray);
		assertEqualsJaggedArray(expected, actualArray);
	}
	
	@Test
	public void sortByMaxDecTestHasEmpthy(){
		int[][] expected = {{3,4,1},{-5,3},{}};
		JaggedArraySorting.sortByMaxDec(actualArrayHasEmpthy);
		assertEqualsJaggedArray(expected, actualArrayHasEmpthy);
	}
	
	@Test
	public void sortByMaxDecTestHasNull(){
		int[][] expected = {{3,4,1},{-5,3},null};
		JaggedArraySorting.sortByMaxDec(actualArrayHasNull);
		assertEqualsJaggedArray(expected, actualArrayHasNull);
	}
	
	@Test
	public void sortByMaxDecTestArrayEmpthy(){
		int[][] expected = {};
		JaggedArraySorting.sortByMaxDec(actualArrayEmpthy);
		assertEqualsJaggedArray(expected, actualArrayEmpthy);
	}
	
	@Test
	public void sortByMaxDecTestArrayNull(){
		JaggedArraySorting.sortByMaxDec(actualArrayNull);
		Assert.assertNull(actualArrayNull);
	}
	
	@Test
	public void sortByMinIncTestArray(){
		int[][] expected = {{-5,3},{1,1,11,2},{3,4,1}};
		JaggedArraySorting.sortByMinInc(actualArray);
		assertEqualsJaggedArray(expected, actualArray);
	}
	
	@Test
	public void sortByMinIncTestHasEmpthy(){
		int[][] expected = {{-5,3},{},{3,4,1}};
		JaggedArraySorting.sortByMinInc(actualArrayHasEmpthy);
		assertEqualsJaggedArray(expected, actualArrayHasEmpthy);
	}
	
	@Test
	public void sortByMinIncTestHasNull(){
		int[][] expected = {{-5,3},null,{3,4,1}};
		JaggedArraySorting.sortByMinInc(actualArrayHasNull);
		assertEqualsJaggedArray(expected, actualArrayHasNull);
	}
	
	@Test
	public void sortByMinIncTestArrayEmpthy(){
		int[][] expected = {};
		JaggedArraySorting.sortByMinInc(actualArrayEmpthy);
		assertEqualsJaggedArray(expected, actualArrayEmpthy);
	}
	
	@Test
	public void sortByMinIncTestArrayNull(){
		JaggedArraySorting.sortByMinInc(actualArrayNull);
		Assert.assertNull(actualArrayNull);
	}
	
	@Test
	public void sortByMinDecTestArray(){
		int[][] expected = {{3,4,1},{1,1,11,2},{-5,3}};
		JaggedArraySorting.sortByMinDec(actualArray);
		assertEqualsJaggedArray(expected, actualArray);
	}
	
	@Test
	public void sortByMinDecTestHasEmpthy(){
		int[][] expected = {{3,4,1},{},{-5,3}};
		JaggedArraySorting.sortByMinDec(actualArrayHasEmpthy);
		assertEqualsJaggedArray(expected, actualArrayHasEmpthy);
	}
	
	@Test
	public void sortByMinDecTestHasNull(){
		int[][] expected = {{3,4,1},null,{-5,3}};
		JaggedArraySorting.sortByMinDec(actualArrayHasNull);
		assertEqualsJaggedArray(expected, actualArrayHasNull);
	}
	
	@Test
	public void sortByMinDecTestArrayEmpthy(){
		int[][] expected = {};
		JaggedArraySorting.sortByMinDec(actualArrayEmpthy);
		assertEqualsJaggedArray(expected, actualArrayEmpthy);
	}
	
	@Test
	public void sortByMinDecTestArrayNull(){
		JaggedArraySorting.sortByMinDec(actualArrayNull);
		Assert.assertNull(actualArrayNull);
	}
	
	private void assertEqualsJaggedArray(int[][] expected, int[][] actual) {
		Assert.assertEquals(expected.length, actual.length);
		for(int i = 0; i < expected.length; i ++) {
			Assert.assertArrayEquals(expected[i], actual[i]);
		}
	}
}
