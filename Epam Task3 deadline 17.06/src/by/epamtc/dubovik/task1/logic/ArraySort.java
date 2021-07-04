package by.epamtc.dubovik.task1.logic;

import by.epamtc.dubovik.task1.entity.Array;
import by.epamtc.dubovik.task1.entity.InvalidBorderException;

public class ArraySort {
	
	public static void bubbleSort(Array array) {
		if(array == null) {
			return;
		}
		for(int j = 0; j < array.getLength(); ++j) {
			for(int i = 0; i < array.getLength() - 1 - j; ++i) {
				try {
					if(array.get(i) > array.get(i + 1)){
						swap(array, i, i+1);
					}
				} catch (InvalidBorderException e) {}
			}
		}
	}
	
	private static void swap(Array array, int index1, int index2) throws InvalidBorderException {
		int temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
	}
	
	public static void quickSort(Array array) {
		if(array == null) {
			return;
		}
		quickSort(array, 0, array.getLength() - 1);
	}

	private static void quickSort(Array array, int leftBorder, int rightBorder) {
		if(array == null) {
			return;
		}
		if(array.getLength() == 0)
			return;
		if(leftBorder >= rightBorder)
			return;
		try {
		int middle = (rightBorder + leftBorder) / 2;
		int opora = array.get(middle);
		int left = leftBorder, right = rightBorder;
			while(left <=right) {
				while(array.get(left) < opora) {
					++left;
				}
				while(array.get(right) > opora) {
					--right;
				}
				if(left <= right) {
					swap(array, left++, right--);
				}
				if(left < rightBorder)
					quickSort(array, left, rightBorder);
				if(leftBorder < right)
					quickSort(array, leftBorder, right);
			}
		} catch (InvalidBorderException e) {};
	}
	
	public static void shakerSort(Array array) {
		if(array == null) {
			return;
		}
		int left = 0;
		int right = array.getLength() - 1;
		try {
			do {
				for(int i = left; i < right; i++) {
					if(array.get(i) > array.get(i + 1)) {
						swap(array,i,i + 1);
					}
				}
				--right;
				for(int i = right; i > left; i--) {
					if(array.get(i) < array.get(i - 1)) {
						swap(array, i,i - 1);
					}
				}
				++left;
			} while (left < right);
		}catch(InvalidBorderException e) {};
	}
}
