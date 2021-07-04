package by.epamtc.dubovik.task1.logic.condition;

public class Fibonacci implements Condition {

	@Override
	public boolean doesSatisfy(int number) {
		boolean isFibonacciNumber = false;
		int fibonacci1 = 0;
		int fibonacci2 = 1;
		
		while(fibonacci1 <= number) {
			if(number == fibonacci1) {
				isFibonacciNumber = true;
			}
			int temp = fibonacci1;
			fibonacci1 = fibonacci2;
			fibonacci2 = fibonacci1 + temp;
		}
		return isFibonacciNumber;
	}

}
