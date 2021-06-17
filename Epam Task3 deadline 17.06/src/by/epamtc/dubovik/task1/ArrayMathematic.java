package by.epamtc.dubovik.task1;

public class ArrayMathematic {
	private final static int BASE = 10;
	
	public static Array findPrimes(Array array) {
		int countPrimes = 0;
		int[] primeArray = new int[array.getLength()];
		for(int value : array) {
			if(isPrime(value)) {
				primeArray[countPrimes++] = value;
			}
		}
		return new Array(primeArray,countPrimes);
	}
	
	private static boolean isPrime(int number) {
		int devider = 2;
		boolean isPrimeNumber = true;
		if(number < devider) {
			isPrimeNumber = false;
		}
		while(devider <= Math.sqrt(number)) {
			if((number % devider) == 0) {
				isPrimeNumber = false;
				break;
			}
			++devider;
		}
		return isPrimeNumber;
	}
	
	public static Array findFibonacci(Array array) {
		int countFibonacci = 0;
		int[] fibonacciArray = new int[array.getLength()];
		for(int value : array) {
			if(isFibonacci(value)) {
				fibonacciArray[countFibonacci++] = value;
			}
		}
		return new Array(fibonacciArray,countFibonacci);
	}
	
	private static boolean isFibonacci(int number) {
		boolean isFibonacciNumber = false;
		int fibonacci1 = 1;
		int fibonacci2 = 1;
		while(fibonacci2 <= number) {
			if(number == fibonacci2) {
				isFibonacciNumber = true;
			}
			int temp = fibonacci1;
			fibonacci1 = fibonacci2;
			fibonacci2 = fibonacci1 + temp;
		}
		return isFibonacciNumber;
	}
	
	public static Array findNumbersWithoutRepeats(Array array, int digitsCount) {
		int countNumbers = 0;
		int[] withoutRepeatsArray = new int[array.getLength()];
		for(int value : array) {
			if(countDigits(value) == digitsCount && !hasRepeates(value)) {
				withoutRepeatsArray[countNumbers++] = value;
			}
		}
		return new Array(withoutRepeatsArray,countNumbers);
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
		return digits.hasRepeates();
	}
	
	private static Array findDigits(int number) {
		int numberOfDigits = countDigits(number);
		Array digits = new Array(numberOfDigits);
		for(int i = 0; i < numberOfDigits; ++i) {
			digits.addAtIndex(i, (int) (number % BASE));
			number /= BASE;
		}
		return digits;
	}

}
