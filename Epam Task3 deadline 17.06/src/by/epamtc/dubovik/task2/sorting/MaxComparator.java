package by.epamtc.dubovik.task2.sorting;

import java.util.Comparator;

public class MaxComparator implements Comparator<int[]> {
	
	@Override
	public int compare(int[] array1, int[] array2) {
		int compare = (int)Math.signum(findMax(array1) - findMax(array2));
		return compare;
	}
	
	private static int findMax(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; ++i) {
			if(array[i] > max)
				max = array[i];
		}
		return max;
	}
}

