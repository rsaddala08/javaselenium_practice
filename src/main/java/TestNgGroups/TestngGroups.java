package TestNgGroups;

import org.testng.annotations.Test;

import TestNG.ClassLevel_Test;


public class TestngGroups  extends ClassLevel_Test{
	
	@Test(groups= {"ClassLevel_Test"})  
	public void testcase1()   
	{  
	System.out.println("Test case belonging to ClassLevel Test");  
	}  

	/*
	 * @Test(groups= {"Group A"}) public void testcase6() {
	 * System.out.println("Test case belonging to Group A"); }
	 */
	@Test(groups= {"Group A","Group B"})  
	public void testcase2()   
	{  
	System.out.println("Test case belonging to both Group A and Group B");  
	}  
	@Test(groups= {"Group B"})  
	public void testcase3()   
	{  
	System.out.println("Test case belonging to Group B");  
	}  
	@Test(groups= {"Group C"})  
	public void testcase4()   
	{  
	System.out.println("Test case belonging to Group C");  
	}  
	@Test(groups= {"Group A","Group C"})  
	public void testcase5()   
	{  
	System.out.println("Test case belonging to Group A and C");  
	}  
}
