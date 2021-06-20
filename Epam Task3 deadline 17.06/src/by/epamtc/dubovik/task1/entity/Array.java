package by.epamtc.dubovik.task1.entity;

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
		setAtIndex(array, startIndex, endIndex, pos);
	}
	
	public int get(int index) throws InvalidBorderException {
		if(!cheakIndex(index))
			throw new InvalidBorderException("Индекс вне границ массива");
		return array[index];
	}
	
	public int getLength() {
		return array.length;
	}
	
	public boolean set(int index, int value) {
		boolean isAdded = false;
		if(cheakIndex(index)) {
			array[index] = value;
			isAdded = true;
		}
		return isAdded;
	}
	
	public boolean setAllAtIndex(int[] array, int index) {
		return setAtIndex(array, 0, array.length, index);
	}
	
	public boolean setAtIndex(int[] array, int startIndex, int endIndex, int pos) {
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
	
	public Array copyArray() {
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; ++i) {
			copy[i] = array[i];
		}
		return new Array(copy);
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
