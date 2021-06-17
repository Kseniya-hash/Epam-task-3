package by.epamtc.dubovik.task1;

import java.util.Iterator;

public class Array implements Iterable<Integer> {
	int[] array;
	
	public Array(int capacity){
		if(capacity < 0) {
			capacity = 0;
		}
		array = new int[capacity];
	}
	
	public Array(int[] array){
		this(array, 0, array.length);
	}
	
	public Array(int[] array, int endIndex){
		this(array, 0, endIndex);
	}
	
	public Array(int[] array, int startIndex, int endIndex){
		this(endIndex - startIndex, array, startIndex, endIndex, 0);
	}
	
	public Array(int capacity, int[] array, int startIndex, int endIndex, int pos){
		this(capacity);
		addAtIndex(array, startIndex, endIndex, pos);
	}
	
	public int getValueAtIndex(int index) throws InvalidBorderException {
		if(!cheakIndex(index))
			throw new InvalidBorderException("Индекс вне границ массива");
		return array[index];
	}
	
	public int getLength() {
		return array.length;
	}
	
	public boolean addAtIndex(int index, int value) {
		boolean isAdded = false;
		if(cheakIndex(index)) {
			array[index] = value;
			isAdded = true;
		}
		return isAdded;
	}
	
	public boolean addAllAtIndex(int[] array, int index) {
		return addAtIndex(array, 0, array.length, index);
	}
	
	public boolean addAtIndex(int[] array, int startIndex, int endIndex, int pos) {
		boolean isFilled = true;
		endIndex = (endIndex < array.length)? endIndex : array.length;
		int count = endIndex - startIndex;
		if(count < 0) {
			isFilled = false;
		}
		if(!cheakIndex(pos)) {
			isFilled = false;
		}
		count = (pos + count < this.array.length)? count : this.array.length - pos;
		for(int i = 0; i < count; ++i) {
			this.array[pos + i] = array[startIndex + i];
		}
		return isFilled;
	}
	
	private boolean cheakIndex(int index) {
		boolean isValid = false;
		if((index >= 0) || (index < array.length))
			isValid = true;
		return isValid;
	}
	
	public void bubbleSort() {
		for(int j = 0; j < array.length; ++j) {
			for(int i = 0; i < array.length - 1 - j; ++i) {
				if(array[i] > array[i + 1]){
					swap(i, i+1);
				}
			}
		}
	}
	
	private void swap(int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public void quickSort() {
		quickSort(0, array.length - 1);
	}

	private void quickSort(int leftBorder, int rightBorder) {
		if(array.length == 0)
			return;
		if(leftBorder >= rightBorder)
			return;
		int middle = (rightBorder + leftBorder) / 2;
		int left = leftBorder, right = rightBorder;
		while(left <=right) {
			while(array[left] < array[middle]) {
				++left;
			}
			while(array[right] > array[middle]) {
				--right;
			}
			if(left <= right) {
				swap(left++, right--);
			}
			if(left < right)
				quickSort(left, rightBorder);
			if(leftBorder < right)
				quickSort(leftBorder, right);
		}
	}
	
	public void shakerSort() {
		int left = 0;
		int right = array.length - 1;
		do {
			for(int i = left; i < right; i++) {
				if(array[i] > array[i + 1]) {
					swap(i,i + 1);
				}
			}
			--right;
			for(int i = right; i > left; i--) {
				if(array[i] < array[i - 1]) {
					swap(i,i - 1);
				}
			}
			++left;
		} while (left < right);
	}
	
	public boolean hasRepeates() {
		Array copy = copyArray();
		copy.shakerSort();
		boolean repeates = false;
		for(int i = 0; i < copy.array.length - 1; ++i) {
			if(copy.array[i] == copy.array[i + 1]) {
				repeates = true;
			}
		}
		return repeates;
	}
	
	public Array copyArray() {
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; ++i) {
			copy[i] = array[i];
		}
		return new Array(copy);
	}
	
	public int binarySearch(int value) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int midVal = array[mid];
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
		return -(low + 1); 
	}

	public int findMaxElement() {
		int max = array[0];
		for(int element : array) {
			max = (max > element) ? max : element;
		}
		return max;
	}
	
	public int findMinElement() {
		int min = array[0];
		for(int element : array) {
			min = (min < element) ? min : element;
		}
		return min;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(this.getClass().getSimpleName());
		str.append(" [");
		for(int i = 0; i < array.length; ++i) {
			str.append(array[i]);
			if(i != array.length - 1) {
				str.append(", ");
			}
		}
		str.append("]");
		return str.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
        	return false;
        }
        Array other = (Array)obj;
        if(array.length != other.array.length)
        	return false;
        for(int i = 0; i < array.length; ++i) {
        	if(array[i] != other.array[i]) {
        		return false;
        	}
        }
        return true;
	}
	
	@Override
	public int hashCode() {
        int result = 1;
        for (int element : array) {
            result = 31 * result + element;
        }
        return result;
    }
	
	public Iterator<Integer>iterator() {
		return new ArrayIterator();
	}
	
	private class ArrayIterator implements Iterator<Integer>{
		private int count;
		
		@Override
		public boolean hasNext(){
			return count < array.length;
		}
		
		@Override
		public Integer next(){
			return array[count++];
		}
	}
}
