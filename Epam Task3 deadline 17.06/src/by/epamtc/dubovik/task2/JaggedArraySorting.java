package by.epamtc.dubovik.task2;

public class JaggedArraySorting {
	
	public static void sortBySummInc(int[][] array) {
		for(int j = 0; j < array.length; ++j) {
			for(int i = 0; i < array.length - 1 - j; ++i) {
				if((summOfArray(array[i]) > summOfArray(array[i + 1]))){
					swap(array, i, i+1);
				}
			}
		}
	}
	
	public static void sortBySummDec(int[][] array) {
		sortBySummInc(array);
		reverseOrder(array);
	}
	
	private static int summOfArray(int[] array) {
		int summ = 0;
		for(int i = 0; i < array.length; ++i) {
			summ += array[i];
		}
		return summ;
	}
	
	private static void swap(int[][] jaggedArray, int index1, int index2) {
		int[] temp = jaggedArray[index1];
		jaggedArray[index1] = jaggedArray[index2];
		jaggedArray[index2] = temp;
	}
	
	public static void sortByMaxInc(int[][] array) {
		sortByExtremumInc(array,true);
	}
	
	public static void sortByMaxDec(int[][] array) {
		sortByExtremumInc(array,true);
		reverseOrder(array);
	}
	
	public static void sortByMinInc(int[][] array) {
		sortByExtremumInc(array,false);
	}
	
	public static void sortByMinDec(int[][] array) {
		sortByExtremumInc(array,false);
		reverseOrder(array);
	}
	
	private static void sortByExtremumInc(int[][] array, boolean extremum) {
		for(int j = 0; j < array.length; ++j) {
			for(int i = 0; i < array.length - 1 - j; ++i) {
				if((findExtremum(array[i], extremum) > 
				    findExtremum(array[i + 1], extremum))){
					swap(array, i, i+1);
				}
			}
		}
	}
	
	private static int findExtremum(int[] array, boolean isMax) {
		int extremum = array[0];
		for(int i = 1; i < array.length; ++i) {
			if((array[i] > extremum) == (isMax))
				extremum = array[i];
		}
		return extremum;
	}
	
	public static void reverseOrder(int[][] array) {
		for(int i = 0; i < array.length/2; ++i) {
			swap(array, i, array.length - 1 - i);
		}
	}
}
