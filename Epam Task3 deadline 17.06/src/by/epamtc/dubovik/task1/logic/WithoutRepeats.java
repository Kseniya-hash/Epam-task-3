package by.epamtc.dubovik.task1.logic;

import by.epamtc.dubovik.task1.entity.Array;
import by.epamtc.dubovik.task1.entity.InvalidBorderException;

public class WithoutRepeats implements Condition {
	private final static int BASE = 10;
	private final static int DIGITSCOUNT = 3;
	
	@Override
	public boolean doesSatisfy(int number) {
		boolean withoutRepeates = ((countDigits(number) == DIGITSCOUNT) && (!hasRepeates(number)));
		return withoutRepeates;
	}
	
	private static int countDigits(int number) {
		int numberOfDigits = 1;
		while((number / BASE) != 0) {
			number = number / 10;
			++numberOfDigits;
		}
		return numberOfDigits;
	}
	
	private static boolean hasRepeates(int number) {
		boolean repeates = false;
		Array digits = findDigits(number);
		return hasRepeates(digits);
	}
	
	private static Array findDigits(int number) {
		int numberOfDigits = countDigits(number);
		Array digits = new Array(numberOfDigits);
		for(int i = 0; i < numberOfDigits; ++i) {
			digits.set(i, (int) (number % BASE));
			number /= BASE;
		}
		return digits;
	}
	
	private static boolean hasRepeates(Array array) {
		Array copy = array.copyArray();
		ArraySort.shakerSort(copy);;
		boolean repeates = false;
		for(int i = 0; i < copy.getLength() - 1; ++i) {
			try {
				if(copy.get(i) == copy.get(i + 1)) {
					repeates = true;
				}
			} catch (InvalidBorderException e) {}
		}
		return repeates;
	}

}
