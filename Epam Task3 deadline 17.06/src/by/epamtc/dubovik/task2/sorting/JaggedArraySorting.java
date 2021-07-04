package by.epamtc.dubovik.task2.sorting;

import java.util.Comparator;

public class JaggedArraySorting {
	
	public static void sortBySummInc(int[][] array) {
		SummComparator cmp = new SummComparator();
		sortInc(array, cmp);
	}
	
	public static void sortBySummDec(int[][] array) {
		sortBySummInc(array);
		reverseOrder(array);
	}
	
	public static void sortByMaxInc(int[][] array) {
		MaxComparator cmp = new MaxComparator();
		sortInc(array, cmp);
	}
	
	public static void sortByMaxDec(int[][] array) {
		sortByMaxInc(array);
		reverseOrder(array);
	}
	
	public static void sortByMinInc(int[][] array) {
		MinComparator cmp = new MinComparator();
		sortInc(array, cmp);
	}
	
	public static void sortByMinDec(int[][] array) {
		sortByMinInc(array);
		reverseOrder(array);
	}
	
	private static void sortInc(int[][] array, Comparator<? super int[]> cmp) {
		if(array == null) {
			return;
		}
		
		for(int j = 0; j < array.length; ++j) {
			for(int i = 0; i < array.length - 1 - j; ++i) {
				if((cmp.compare(array[i],array[i + 1]) > 0)){
					swap(array, i, i+1);
				}
			}
		}
	}
	
	private static void swap(int[][] jaggedArray, int index1, int index2) {
		int[] temp = jaggedArray[index1];
		jaggedArray[index1] = jaggedArray[index2];
		jaggedArray[index2] = temp;
	}
	
	private static void reverseOrder(int[][] array) {
		if(array == null) {
			return;
		}
		
		for(int i = 0; i < array.length/2; ++i) {
			swap(array, i, array.length - 1 - i);
		}
	}
}
