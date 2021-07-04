package by.epamtc.dubovik.task1.logic.condition;

import org.junit.Test;
import org.junit.Assert;
import by.epamtc.dubovik.task1.logic.condition.WithoutRepeat;

public class TestWithoutRepeat {

	@Test
	public void doesSatisfyTestWithoutRepeat() {
		WithoutRepeat testWithoutRepeat = new WithoutRepeat();
		int number = 123;
		boolean expected = true;
		boolean actual = testWithoutRepeat.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestNegativeWithoutRepeat() {
		WithoutRepeat testWithoutRepeat = new WithoutRepeat();
		int number = -123;
		boolean expected = true;
		boolean actual = testWithoutRepeat.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestHasRepeat() {
		WithoutRepeat testWithoutRepeat = new WithoutRepeat();
		int number = 122;
		boolean expected = false;
		boolean actual = testWithoutRepeat.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestNegativeWithRepeat() {
		WithoutRepeat testWithoutRepeat = new WithoutRepeat();
		int number = -131;
		boolean expected = false;
		boolean actual = testWithoutRepeat.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestTooManyDigits() {
		WithoutRepeat testWithoutRepeat = new WithoutRepeat();
		int number = 1231;
		boolean expected = false;
		boolean actual = testWithoutRepeat.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesSatisfyTestNotEnoughDigits() {
		WithoutRepeat testWithoutRepeat = new WithoutRepeat();
		int number = 12;
		boolean expected = false;
		boolean actual = testWithoutRepeat.doesSatisfy(number);
		Assert.assertEquals(expected, actual);
	}
}
