package by.epamtc.dubovik.task1.arrayfiller;

import java.util.Scanner;

import by.epamtc.dubovik.task1.Array;

public class ArrayConsoleReader {
	
	public static Array readArray(int capacity) {
		Array array = new Array(capacity);
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < capacity; ++i) {
			array.addAtIndex(i, in.nextInt());
		}
		return array;
	}
}
