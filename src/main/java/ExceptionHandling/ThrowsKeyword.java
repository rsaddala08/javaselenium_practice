package ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsKeyword {
	
	
	static void throwsMethod() throws Throwable
	{
		
	int a[]=new int[3];
	
	a[4]=20;
	}

	public static void main(String[] args) throws Throwable {
	
		try {
			throwsMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
