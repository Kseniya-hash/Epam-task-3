package by.epamtc.dubovik.task1.logic;

public class Prime implements Condition {

	@Override
	public boolean doesSatisfy(int number) {
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
}
