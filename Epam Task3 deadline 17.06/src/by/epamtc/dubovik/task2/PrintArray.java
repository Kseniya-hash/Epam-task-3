package by.epamtc.dubovik.task2;

public class PrintArray {
	
	public static void printJaggedArray(int[][] array) {
		for(int i = 0; i < array.length; ++i) {
			for(int j = 0; j < array[i].length; ++j) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
