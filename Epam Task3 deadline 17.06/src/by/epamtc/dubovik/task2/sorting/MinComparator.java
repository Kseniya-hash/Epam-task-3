package by.epamtc.dubovik.task2.sorting;

import java.util.Comparator;

public class MinComparator implements Comparator<int[]> {
	
	@Override
	public int compare(int[] array1, int[] array2) {
		int compare = (int)Math.signum(findMin(array1) - findMin(array2));
		return compare;
	}
	
	private static int findMin(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; ++i) {
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}
}

