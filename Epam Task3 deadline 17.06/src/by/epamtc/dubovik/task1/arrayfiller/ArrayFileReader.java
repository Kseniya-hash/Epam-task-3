package by.epamtc.dubovik.task1.arrayfiller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import by.epamtc.dubovik.task1.*;
import by.epamtc.dubovik.task1.entity.Array;

public class ArrayFileReader {
	
	public static Array readArray(int capacity, String fileName) throws IOException {
		Array array = new Array(capacity);
		FileReader input = new FileReader(fileName);
		Scanner in = new Scanner(input);
		for(int i = 0; i < capacity; ++i) {
			array.set(i, in.nextInt());
			if(!in.hasNextInt()) {
				break;
			}
		}
		input.close();
		return array;
	}
}
