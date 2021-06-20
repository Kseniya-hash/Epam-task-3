package by.epamtc.dubovik.task1.logic;

import by.epamtc.dubovik.task1.entity.Array;
import by.epamtc.dubovik.task1.entity.InvalidBorderException;

public class ArraySearch {
	
	public static int binarySearch(Array array, int value) {
		int low = 0;
		int high = array.getLength() - 1;
		try {
			while (low <= high) {
				int mid = (low + high) / 2;
				int midVal = array.get(mid);
				if (midVal < value) {
					low = mid + 1;
				}
				else if (midVal > value) {
					high = mid - 1;
				}
				else {
					return mid;
				}
			}
		} catch (InvalidBorderException e) {};
		return -(low + 1); 
	}

	public static int findMaxElement(Array array) {
		int max = 0;
		try {
			max = array.get(0);
		} catch (InvalidBorderException e) {}
		for(int element : array) {
			max = (max > element) ? max : element;
		}
		return max;
	}
	
	public static int findMinElement(Array array) {
		int min = 0;
		try {
			min = array.get(0);
		} catch (InvalidBorderException e) {}
		for(int element : array) {
			min = (min < element) ? min : element;
		}
		return min;
	}

}
