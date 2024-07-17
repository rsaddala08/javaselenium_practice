package TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGPriorities {
	
	
	@Test(invocationCount=10)
	public void a()
	{
		System.out.println("M1 Executed Successfully");
	}
	
	@Test(priority=6)
	public void c()
	{
		System.out.println("M2 Executed Successfully");
	}
	@Test(priority=2)
	public void d()
	{
		System.out.println("M3 Executed Successfully");
	}
	@Test(priority=5)
	public void r()
	{
		System.out.println("M4 Executed Successfully");
	}@Test
	public void b()
	{
		System.out.println("M5 Executed Successfully");
	}@Test
	public void s()
	{
		System.out.println("M6 Executed Successfully");
	}@Test
	public void k()
	{
		System.out.println("M7 Executed Successfully");
	}
	

}
