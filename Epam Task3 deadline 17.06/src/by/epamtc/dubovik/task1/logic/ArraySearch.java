package by.epamtc.dubovik.task1.logic;

import by.epamtc.dubovik.task1.entity.Array;
import by.epamtc.dubovik.task1.entity.InvalidBorderException;

public class ArraySearch {
	
	public static int binarySearch(Array array, int value) {
		if(array == null) {
			return -1; 
		}
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
		return -1; 
	}

	public static int findMaxElement(Array array) throws NullArrayException, InvalidBorderException {
		if(array == null)
			throw new NullArrayException("Can not find max element. Array is null");
		
		int max = 0;
		max = array.get(0);
		for(int element : array) {
			max = (max > element) ? max : element;
		}
		return max;
	}
	
	public static int findMinElement(Array array) throws NullArrayException, InvalidBorderException {
		if(array == null)
			throw new NullArrayException("Can not find min element. Array is null");
		
		int min = 0;
		min = array.get(0);
		for(int element : array) {
			min = (min < element) ? min : element;
		}
		return min;
	}

}
