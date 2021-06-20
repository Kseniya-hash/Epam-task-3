package by.epamtc.dubovik.task1.logic;

import by.epamtc.dubovik.task1.entity.Array;
import by.epamtc.dubovik.task1.entity.InvalidBorderException;

public class ArrayMathematic {
	
	public static Array findPrimes(Array array) {
		Array primeArray = findArrayWithCondition(array,new Prime());
		return primeArray;
	}
	
	public static Array findFibonacci(Array array) {
		Array fibonacciArray = findArrayWithCondition(array,new Fibonacci());
		return fibonacciArray;
	}
	
	public static Array findNumbersWithoutRepeats(Array array) {
		Array withoutRepeatsArray = findArrayWithCondition(array,new WithoutRepeats());
		return withoutRepeatsArray;
	}
	
	private static Array findArrayWithCondition(Array array, Condition condition) {
		int count = 0;
		int[] newArray = new int[array.getLength()];
		for(int value : array) {
			if(condition.doesSatisfy(value)) {
				newArray[count++] = value;
			}
		}
		return new Array(newArray,count);
	}
}
