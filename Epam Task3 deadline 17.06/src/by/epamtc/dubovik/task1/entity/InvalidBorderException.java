package by.epamtc.dubovik.task1.entity;

public class InvalidBorderException extends Exception {
	
	public InvalidBorderException() {}
	
	public InvalidBorderException(String s) {
		super(s);
	}
	
	public InvalidBorderException(String s, Throwable cause) {
		super(s, cause);
	}
	
	public InvalidBorderException(Throwable cause) {
		super(cause);
	}
}
