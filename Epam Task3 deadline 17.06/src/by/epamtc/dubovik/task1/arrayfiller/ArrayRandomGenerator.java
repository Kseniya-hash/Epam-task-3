package by.epamtc.dubovik.task1.arrayfiller;

import java.util.Random;
import by.epamtc.dubovik.task1.Array;
import by.epamtc.dubovik.task1.InvalidBorderException;

public class ArrayRandomGenerator {
	
	public static Array generateElements(int capacity, int lowerBorder, int higherBorder)
			throws InvalidBorderException {
		if(lowerBorder > higherBorder) {
			throw new InvalidBorderException("Нижняя граница больше верхней");
		}
		Array array = new Array(capacity);
		Random rand = new Random();
		for(int i = 0; i < capacity; ++i) {
			array.addAtIndex(i, lowerBorder + rand.nextInt(higherBorder - lowerBorder));
		}
		return array;
	}
}
