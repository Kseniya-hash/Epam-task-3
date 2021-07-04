package by.epamtc.dubovik.task1.logic;

public class NullArrayException extends Exception {
	
	public NullArrayException() {}
	
	public NullArrayException(String s) {
		super(s);
	}
	
	public NullArrayException(String s, Throwable cause) {
		super(s, cause);
	}
	
	public NullArrayException(Throwable cause) {
		super(cause);
	}
}
