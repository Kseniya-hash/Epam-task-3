package by.epamtc.dubovik.task2.sorting;

import java.util.Comparator;

public class SummComparator implements Comparator<int[]> {
	
	@Override
	public int compare(int[] array1, int[] array2) {
		int compare = (int)Math.signum(summOfArray(array1) - summOfArray(array2));
		return compare;
	}
	
	private static int summOfArray(int[] array) {
		int summ = 0;
		if(array != null) {
			for(int i = 0; i < array.length; ++i) {
				summ += array[i];
			}
		}
		return summ;
	}
}
