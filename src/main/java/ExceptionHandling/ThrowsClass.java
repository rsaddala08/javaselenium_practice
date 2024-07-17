package ExceptionHandling;

import java.io.IOException;
import java.io.InterruptedIOException;

public class ThrowsClass {

	static void throwsMethod() throws IllegalAccessException,IOException,Exception,ArithmeticException,InterruptedIOException
	{
		System.out.println("Exception at IllegalAccessException");
		throw new IllegalAccessException("Example");
		
	}
	
	public static void main(String[] args) throws Exception {
		try {
			throwsMethod();
		}
		catch(Throwable e)
		{
			System.out.println("Exception at Main");
			System.out.println(e.getMessage());
		}
	}
}
